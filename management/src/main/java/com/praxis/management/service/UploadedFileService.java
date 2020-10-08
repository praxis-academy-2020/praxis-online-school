package com.praxis.management.service;

import com.praxis.management.model.UploadedFile;
import org.springframework.web.multipart.MultipartFile;

public interface UploadedFileService {

    public UploadedFile uploadFile(MultipartFile multipartFile);

    public UploadedFile downloadFile(String fileId);
}
