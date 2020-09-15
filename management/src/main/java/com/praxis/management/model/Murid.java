package com.praxis.management.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;



@Entity
@Table (name="pengguna")
public class Murid {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "idKelas")
    private Long idUser;

    private String namaUser;

    private String statusUser;

    private Long nomorKelas;

    @OneToOne(mappedBy = "pengguna", cascade = CascadeType.ALL)
    @JoinTable(name = "kelas",
        joinColumns = 
            { @JoinColumn(name = "nomorKelas", referencedColumnName = "nomorKelas" ) },
        inverseJoinColumns =
            { @JoinColumn(name = "nomorKelas", referencedColumnName = "nomorKelas")} )

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

}