package com.praxis.management.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Column;
import javax.persistence.FetchType;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="mentors")
public class Mentor{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "nomorMentor")
    private Long nomorMentor;

    private String namaMentor;
    
    private String status_mentor;
    
    private Long nomorKelas;


    // @OneToMany(fetch = FetchType.LAZY, mappedBy = "mentor")
    // private List<Kelas> kelas;
    
    public Long getIdMentor(){
        return nomorMentor;
    }

    public void setIdMentor(Long nomorMentor){
        this.nomorMentor = nomorMentor;
    }

    public String getNama(){
        return namaMentor;
    }

    public void setNama(String namaMentor){
        this.namaMentor = namaMentor;
    }

    public String getStatus(){
        return status_mentor;
    }

    public void setStatus(String status_mentor){
        this.status_mentor = status_mentor;
    }

    // public String getNamaKelas(){
    //     return nama_kelas;
    // }

    // public void setNamaKelas(String nama_kelas){
    //     this.nama_kelas = nama_kelas;
    // }


    // public List<Kelas> getKelas() {
    //     return kelas;
    // }

    // public void setKelas(List<Kelas> kelas) {
    //     this.kelas = kelas;
    // }

    public void setNomorKelas(Long nomorKelas){
        this.nomorKelas = nomorKelas;
    }

    public Long getNomorKelas(){
        return nomorKelas;
    }
}