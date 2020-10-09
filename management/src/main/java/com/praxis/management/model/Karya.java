package com.praxis.management.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "karya")
public class Karya {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer karyaId;

    private String url;

    private String namaKarya;

    private String urlGithub;

    @OneToMany(targetEntity = AnggotaKarya.class,mappedBy = "karya", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<AnggotaKarya> anggotaKaryas;

    private String description;

    public Integer getKaryaId() {
        return karyaId;
    }

    public void setKaryaId(Integer karyaId) {
        this.karyaId = karyaId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNamaKarya() {
        return namaKarya;
    }

    public void setNamaKarya(String namaKarya) {
        this.namaKarya = namaKarya;
    }

    public List<AnggotaKarya> getAnggotaKaryas() {
        return anggotaKaryas;
    }

    public void setAnggotaKaryas(List<AnggotaKarya> anggotaKaryas) {
        this.anggotaKaryas = anggotaKaryas;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlGithub() {
        return urlGithub;
    }

    public void setUrlGithub(String urlGithub) {
        this.urlGithub = urlGithub;
    }
}
