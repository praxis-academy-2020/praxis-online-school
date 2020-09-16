package com.praxis.management.model;

import java.util.List;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
@Table(name="kelas")
public class Kelas {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "nomorKelas")   
    private Long nomorKelas;

    

    // @OneToOne(mappedBy = "kelas", cascade = CascadeType.ALL)
    // private Murid murid;

    // @OneToMany(fetch = FetchType.LAZY, mappedBy = "kelas")
    // private List<Murid> murid;

    // @OneToMany(targetEntity=Murid.class, mappedBy="nomorSekolah",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    // private List<Murid> murid;


    private String namaKelas;
    
    private Long jumlahPeserta;

    // public Long getId() {
    //     return id_kelas;
    // }

    // public void setId(Long id_kelas){
    //     this.id_kelas = id_kelas;
    // }
    
    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas){
        this.namaKelas = namaKelas;
    }

    public Long getJumlahPeserta() {
        return jumlahPeserta;
    }

    public void setJumlahPeserta(Long jumlahPeserta){
        this.jumlahPeserta = jumlahPeserta;
    }

    public void setNomorKelas(Long nomorKelas){
        this.nomorKelas = nomorKelas;
    }
    public Long getNomorKelas(){
        return nomorKelas;
    }

    // public void setMurid(List<Murid> murid){
    //     this.murid = murid;
    // }
    // public List<Murid> getMurid(){
    //     return murid;
    // }
}
