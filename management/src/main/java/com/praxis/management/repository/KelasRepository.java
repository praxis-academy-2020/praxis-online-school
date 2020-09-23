package com.praxis.management.repository;

import java.util.Optional;

import com.praxis.management.model.Kelas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KelasRepository extends JpaRepository<Kelas, Long>{

    Optional<Kelas> findByNomorKelas(Long nomorKelas);

}