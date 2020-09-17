package com.praxis.management.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;



@Entity
@Table (name="pengguna")
public class Murid {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "idUser")
    private Long idUser;

    private String namaUser;

    private String statusUser;

    
    private Long nomorKelas;

    private String nomorHape;

    private String emailUser;

    // @OneToOne(mappedBy = "pengguna", cascade = CascadeType.ALL)
 
    // @JoinColumn(name = "nomorKelas")
    // private Kelas kelas;
    // @JoinTable(name = "kelas",
    //     joinColumns = 
    //         { @JoinColumn(name = "nomorKelas", referencedColumnName = "nomorKelas" ) },
    //     inverseJoinColumns =
    //         { @JoinColumn(name = "nomorKelas", referencedColumnName = "nomorKelas")} )

    //@Column(name = "nomorSekolah", update="false")
    // private Long nomorSekolah;

    @ManyToOne
    @JoinColumn(name = "nomorKelas", referencedColumnName="nomorKelas", insertable = false, updatable = false)
    private Kelas kelas;

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


    public Long getNomorKelas() {
        return nomorKelas;
    }

    public void setNomorKelas(Long nomorKelas) {
        this.nomorKelas = nomorKelas;
    }

    public void setEmailUser(String emailUser){
        this.emailUser = emailUser;
    }

    public String getEmailUser(){
        return emailUser;
    }

    public void setNomorHape(String nomorHape){
        this.nomorHape = nomorHape;
    }

    public String getNomorHape(){
        return nomorHape;
    }

    public void setKelas(Kelas kelas){
        this.kelas = kelas;
    }

    public Kelas getKelas(){
        return kelas;
    }

}