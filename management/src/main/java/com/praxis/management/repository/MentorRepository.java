package com.praxis.management.repository;

import java.util.Optional;

import com.praxis.management.model.Mentor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentorRepository extends JpaRepository<Mentor, Long>{

    Optional<Mentor> findBynomorMentor(Long nomorMentor);

}