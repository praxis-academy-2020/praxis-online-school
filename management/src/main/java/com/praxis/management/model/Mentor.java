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

    @Column(name = "nama_mentor")
    private String namaMentor;
    
    @Column(name = "status_mentor")
    private String statusMentor;
    
    // private Long nomorKelas;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "mentor")
    private List<Kelas> kelas;
    
    public Long getNomorMentor(){
        return nomorMentor;
    }

    public void setNomorMentor(Long nomorMentor){
        this.nomorMentor = nomorMentor;
    }

    public String getNama(){
        return namaMentor;
    }

    public void setNama(String namaMentor){
        this.namaMentor = namaMentor;
    }

    public String getStatus(){
        return statusMentor;
    }

    public void setStatus(String statusMentor){
        this.statusMentor = statusMentor;
    }

    // public String getNamaKelas(){
    //     return nama_kelas;
    // }

    // public void setNamaKelas(String nama_kelas){
    //     this.nama_kelas = nama_kelas;
    // }


    // public Set<Kelas> getKelas() {
    //     return kelas;
    // }

    // public void setKelas(Set<Kelas> kelas) {
    //     this.kelas = kelas;
    // }

    // public void setNomorKelas(Long nomorKelas){
    //     this.nomorKelas = nomorKelas;
    // }

    // public Long getNomorKelas(){
    //     return nomorKelas;
    // }
}