package com.praxis.management.repository;

import com.praxis.management.response.UploadedFileResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileResponseRepository extends JpaRepository<UploadedFileResponse, Integer> {
}
