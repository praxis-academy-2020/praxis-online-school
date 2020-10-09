package com.praxis.management.response;

import javax.persistence.*;

@Entity
@Table(name = "metadata")
public class UploadedFileResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer fileNo;

    private String fileId;

    private String fileType;

    private String message;

    private Boolean uploadStatus;

    private String downloadUri;

    public Integer getFileNo() {
        return fileNo;
    }

    public void setFileNo(Integer fileNo) {
        this.fileNo = fileNo;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getUploadStatus() {
        return uploadStatus;
    }

    public void setUploadStatus(Boolean uploadStatus) {
        this.uploadStatus = uploadStatus;
    }

    public String getDownloadUri() {
        return downloadUri;
    }

    public void setDownloadUri(String downloadUri) {
        this.downloadUri = downloadUri;
    }
}
