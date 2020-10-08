package com.praxis.management.controller;


import com.praxis.management.model.UploadedFile;
import com.praxis.management.response.UploadedFileResponse;
import com.praxis.management.service.UploadedFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;

@RestController
@CrossOrigin
@RequestMapping("/praxis/data")
public class UploadedFileController {

    @Autowired
    UploadedFileService uploadedFileService;

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

            return uploadedFileResponse;
        }

        uploadedFileResponse.setMessage("Ooops 1 something went wrong please re-upload");
        return uploadedFileResponse;
    }

    @GetMapping("/download/{id}")
    public ResponseEntity<byte[]> downloadFile(@PathVariable String fileId){
        UploadedFile uploadedFileToRet = uploadedFileService.downloadFile(fileId);

        return  ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename:\"" + uploadedFileToRet.getFilename() +"\"" )
                .body(uploadedFileToRet.getFileData());

    }
}
