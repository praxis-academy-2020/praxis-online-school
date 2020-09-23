package com.praxis.management.repository;

import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

import com.praxis.management.model.Murid;


//import com.praxis.management.model.Kelas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

//buat repository

@Repository
public interface MuridRepository extends JpaRepository<Murid, Long>{

    Optional<Murid> findByUserId(Long userId);

    @Query(value= "SELECT count(nomorKelas) from pengguna")
    List<Murid> findByJumlahPeserta(Long nomorKelas);

}