package com.praxis.management.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;




@Entity
@Table (name="pengguna")
public class Murid {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idUser;

    private String namaUser;

    private String statusUser;

    public Long getId() {
        return idUser;
    }

    public void setId(Long idUser) {
        this.idUser = idUser;
    }

    public String getNama() {
        return namaUser;
    }

    public void setNama(String namaUser) {
        this.namaUser = namaUser;
    }

    public String getStatus() {
        return statusUser;
    }

    public void setStatus(String statusUser) {
        this.statusUser = statusUser;
    }

}