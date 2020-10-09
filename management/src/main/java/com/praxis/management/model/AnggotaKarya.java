package com.praxis.management.model;

import javax.persistence.*;

@Entity
@Table(name = "anggotakarya")
public class AnggotaKarya {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer anggotaId;

    private String anggota;

    private String roleAnggota;

//    private Integer karyaId;

    @ManyToOne
    @JoinColumn(referencedColumnName = "karyaId", updatable = false, insertable = false)
    private Karya karya;

    public Integer getAnggotaId() {
        return anggotaId;
    }

    public void setAnggotaId(Integer anggotaId) {
        this.anggotaId = anggotaId;
    }

    public String getAnggota() {
        return anggota;
    }

    public void setAnggota(String anggota) {
        this.anggota = anggota;
    }

    public String getRoleAnggota() {
        return roleAnggota;
    }

    public void setRoleAnggota(String roleAnggota) {
        this.roleAnggota = roleAnggota;
    }

    //    public Karya getKarya() {
//        return karya;
//    }
//
//    public void setKarya(Karya karya) {
//        this.karya = karya;
//    }

//    public Integer getKaryaId() {
//        return karyaId;
//    }
//
//    public void setKaryaId(Integer karyaId) {
//        this.karyaId = karyaId;
//    }
}
