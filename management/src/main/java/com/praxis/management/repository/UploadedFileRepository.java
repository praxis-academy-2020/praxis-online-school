package com.praxis.management.repository;

import com.praxis.management.model.UploadedFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UploadedFileRepository extends JpaRepository<UploadedFile, String> {
}
