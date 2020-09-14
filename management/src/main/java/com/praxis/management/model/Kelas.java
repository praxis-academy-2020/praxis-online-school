package com.praxis.management.model;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="kelas")
public class Kelas {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_kelas;

    private String nama_kelas;
    
    private Long jumlah_peserta;

    public Long getId() {
        return id_kelas;
    }

    public void setId(Long id_kelas){
        this.id_kelas = id_kelas;
    }
    
    public Long getNama() {
        return nama_kelas;
    }

    public void setNama(String nama_kelas){
        this.nama_kelas = nama_kelas;
    }

    public Long getJumlah() {
        return jumlah_peserta;
    }

    public void setJumlah(Long jumlah_peserta){
        this.jumlah_peserta = jumlah_peserta;
    }
}