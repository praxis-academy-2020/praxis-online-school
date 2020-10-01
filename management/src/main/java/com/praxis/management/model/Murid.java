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



@Entity(name = "pengguna")
@Table (name="pengguna")
public class Murid {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "idUser")
    private Long userId;

    private String namaUser;

    private String tempatLahir;
    
    private Long nomorKelas;

    private String nomorHape;

    private String emailUser;

    private String program;

    private String tanggalLahir;
    
    private String kotaAsal;

    private String alamat;

    private String pendidikan;

    private String namaKampus;

    private String semester;

    private String alamatKampus;

    private String pengalamanKerja;

    private String pengalamanProject;

    private String alasanIkut;

    private String komitmen;

    private String referensi;

    private String mediaSosial;

    private String bootCamp;

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

//    @ManyToOne
//    @JoinColumn(name = "nomorKelas", referencedColumnName="nomorKelas", insertable = false, updatable = false)
//    private Kelas kelas;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNamaUser() {
        return namaUser;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public Long getNomorKelas() {
        return nomorKelas;
    }

    public void setNomorKelas(Long nomorKelas) {
        this.nomorKelas = nomorKelas;
    }

    public String getNomorHape() {
        return nomorHape;
    }

    public void setNomorHape(String nomorHape) {
        this.nomorHape = nomorHape;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getKotaAsal() {
        return kotaAsal;
    }

    public void setKotaAsal(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    public String getNamaKampus() {
        return namaKampus;
    }

    public void setNamaKampus(String namaKampus) {
        this.namaKampus = namaKampus;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getAlamatKampus() {
        return alamatKampus;
    }

    public void setAlamatKampus(String alamatKampus) {
        this.alamatKampus = alamatKampus;
    }

    public String getPengalamanKerja() {
        return pengalamanKerja;
    }

    public void setPengalamanKerja(String pengalamanKerja) {
        this.pengalamanKerja = pengalamanKerja;
    }

    public String getPengalamanProject() {
        return pengalamanProject;
    }

    public void setPengalamanProject(String pengalamanProject) {
        this.pengalamanProject = pengalamanProject;
    }

    public String getAlasanIkut() {
        return alasanIkut;
    }

    public void setAlasanIkut(String alasanIkut) {
        this.alasanIkut = alasanIkut;
    }

    public String getKomitmen() {
        return komitmen;
    }

    public void setKomitmen(String komitmen) {
        this.komitmen = komitmen;
    }

    public String getReferensi() {
        return referensi;
    }

    public void setReferensi(String referensi) {
        this.referensi = referensi;
    }

    public String getMediaSosial() {
        return mediaSosial;
    }

    public void setMediaSosial(String mediaSosial) {
        this.mediaSosial = mediaSosial;
    }

    public String getBootCamp() {
        return bootCamp;
    }

    public void setBootCamp(String bootCamp) {
        this.bootCamp = bootCamp;
    }

//    public void setKelas(Kelas kelas){
//        this.kelas = kelas;
//    }
//
//    public Kelas getKelas(){
//        return kelas;
//    }


}