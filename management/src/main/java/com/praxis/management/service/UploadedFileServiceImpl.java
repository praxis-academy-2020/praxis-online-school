package com.praxis.management.service;

import com.praxis.management.model.UploadedFile;
import com.praxis.management.repository.UploadedFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class UploadedFileServiceImpl implements UploadedFileService{

    @Autowired
    UploadedFileRepository uploadedFileRepository;

    @Override
    public UploadedFile uploadFile(MultipartFile multipartFile) {

        UploadedFile uploadedFile = new UploadedFile();

        try {
            uploadedFile.setFileData(multipartFile.getBytes());
            uploadedFile.setFileType(multipartFile.getContentType());
            uploadedFile.setFilename(multipartFile.getOriginalFilename());

            return uploadedFileRepository.save(uploadedFile);

        }catch (IOException ex){
            ex.printStackTrace();
            return null;
        }

    }

    @Override
    public UploadedFile downloadFile(String fileId) {

        return uploadedFileRepository.findById(fileId).get();
    }
}
