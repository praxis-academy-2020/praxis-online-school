// package com.praxis.management.model;

// import javax.persistence.Entity;
// import javax.persistence.Table;
// import javax.persistence.Id;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.OneToMany;
// import javax.persistence.Column;

// import java.util.HashSet;
// import java.util.List;
// import java.util.Objects;
// import java.util.Set;

// @Entity
// @Table(name="mentor")
// public class Mentor{
    
//     @Id
//     @GeneretadValue(strategy=GenerationType.AUTO)
//     @Column(name = "id_mentor")
//     private Long id_mentor;

//     private String nama_mentor;
    
//     private String status_mentor;
    
//     private Long nomor_kelas;

//     @OneToMany(fetch = FetchType.LAZY, mappedBy = "mentor")
//     private List<Kelas> kelas;
    
//     public Long getId(){
//         return id_mentor;
//     }

//     public void setId(Long id_mentor){
//         this.id_mentor = id_mentor;
//     }

//     public String getNama(){
//         return nama_mentor;
//     }

//     public void setNama(String nama_mentor){
//         this.nama_mentor = nama_mentor;
//     }

//     public String getStatus(){
//         return status_mentor;
//     }

//     public void setStatus(String status_mentor){
//         this.status_mentor = status_mentor;
//     }

//     public String getNamaKelas(){
//         return nama_kelas;
//     }

//     public void setNamaKelas(String nama_kelas){
//         this.nama_kelas = nama_kelas;
//     }


//     public List<Kelas> getKelas() {
//         return kelas;
//     }

//     public void setKelas(List<Kelas> kelas) {
//         this.kelas = kelas;
//     }
// }