package com.praxis.management.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table (name="User")
public class User {
    
    @Id
    @GeneratedValue(strategy=GenerationType.Auto)
    private Long id_user;

    private String nama_user;

    private String status_user;

    public Long getId() {
        return id_user;
    }

    public void setId(Long id_user) {
        this.id_user = id_user;
    }

    public String getNama() {
        return nama_user;
    }

    public void setNama(String nama_user) {
        this.nama_user = nama_user;
    }

    public String getStatus() {
        return status_user;
    }

    public void setStatus(String status_user) {
        this.status_user = status_user;
    }

}