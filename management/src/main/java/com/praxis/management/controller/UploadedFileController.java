package com.praxis.management.controller;


import com.praxis.management.model.UploadedFile;
import com.praxis.management.repository.FileResponseRepository;
import com.praxis.management.response.UploadedFileResponse;
import com.praxis.management.service.UploadedFileService;
import org.apache.tomcat.util.http.fileupload.FileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/praxis/data")
public class UploadedFileController {

    @Autowired
    UploadedFileService uploadedFileService;

    @Autowired
    FileResponseRepository fileResponseRepository;

    @PostMapping("/upload")
    public UploadedFileResponse uploadFile(@RequestParam("file") MultipartFile multipartFile){

        UploadedFile uploadedFile = uploadedFileService.uploadFile(multipartFile);

        UploadedFileResponse uploadedFileResponse = new UploadedFileResponse();

        if (uploadedFile != null){
            String downloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                    .path("/praxis/data/download/")
                    .path(uploadedFile.getFileId()).toUriString();

            uploadedFileResponse.setFileId(uploadedFile.getFileId());
            uploadedFileResponse.setFileType(uploadedFile.getFileType());
            uploadedFileResponse.setMessage("Successfully uploaded");
            uploadedFileResponse.setUploadStatus(true);
            uploadedFileResponse.setDownloadUri(downloadUri);

            return fileResponseRepository.save(uploadedFileResponse);
        }

        uploadedFileResponse.setMessage("Ooops 1 something went wrong please re-upload");
        return uploadedFileResponse;
    }

    @PostMapping("/uploads")
    public List<UploadedFileResponse> uploadFilesToDB(@RequestParam("files") MultipartFile[] multipartFiles){
        try {
            List<UploadedFile> uploadedFiles = new ArrayList<UploadedFile>();
            List<UploadedFileResponse> uploadedFileResponses = new ArrayList<UploadedFileResponse>();
            for (MultipartFile multipartFile: multipartFiles) {
                UploadedFile uploadedFile = uploadedFileService.uploadFile(multipartFile);
                UploadedFileResponse uploadedFileResponse = new UploadedFileResponse();

                if (uploadedFile != null){
                    String downloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                            .path("/api/download/")
                            .path(uploadedFile.getFileId())
                            .toUriString();

                    uploadedFileResponse.setDownloadUri(downloadUri);
                    uploadedFileResponse.setFileId(uploadedFile.getFileId());
                    uploadedFileResponse.setFileType(uploadedFile.getFileType());
                    uploadedFileResponse.setUploadStatus(true);
                    uploadedFileResponse.setMessage("File Uploaded Successfully");
                }

                uploadedFiles.add(uploadedFile);
                uploadedFileResponses.add(uploadedFileResponse);

            }
            return uploadedFileResponses;

        }
        catch (Exception ex){
            return null;

        }

    }

    @GetMapping("/download/{id}")
    public ResponseEntity<byte[]> downloadFile(@PathVariable String id){
        UploadedFile uploadedFileToRet = uploadedFileService.downloadFile(id);

        return  ResponseEntity.ok()
//                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename:\"" + uploadedFileToRet.getFilename() +"\"")
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + uploadedFileToRet.getFilename() + "\"")
                .body(uploadedFileToRet.getFileData());

    }

    @GetMapping("/list/files")
    public List<UploadedFileResponse> listingFiles(){
        return fileResponseRepository.findAll();

    }
}
