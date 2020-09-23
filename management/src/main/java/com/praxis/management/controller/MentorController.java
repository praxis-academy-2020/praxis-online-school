package com.praxis.management.controller;

import com.praxis.management.model.Mentor;
import com.praxis.management.repository.MentorRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("/praxis/mentor")
public class MentorController{
    
    @Autowired
    private MentorRepository mentorRepository;

    @GetMapping("/get")
    public List<Mentor> getAllMentors(){
        return mentorRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public @ResponseBody Mentor getByNomorMentor(@PathVariable("id") Long nomorMentor){
        return mentorRepository.findBynomorMentor(nomorMentor).get();
    }

    @PutMapping("/put/{id}")
    Mentor updateMentor(@RequestBody Mentor newMentor, @PathVariable("id") Long nomorMentor){
        return mentorRepository.findBynomorMentor(nomorMentor).map(
            mentor -> {
            mentor.setNama(newMentor.getNama());
            mentor.setStatus(newMentor.getStatus());
            // user.setNamaKelas(newUser.getNamaKelas());
            //mentor.setNomorKelas(newMentor.getNomorKelas());
            return mentorRepository.save(mentor);

        }).orElseGet(() -> {
          //   newUser.setId(userId);
          newMentor.setNomorMentor(nomorMentor);
          return mentorRepository.save(newMentor);
        });
    }

    @PostMapping("/post")
    public @ResponseBody Mentor createMentor(@RequestBody Mentor mentor){
        return mentorRepository.save(mentor);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long nomorMentor){
        Mentor mentor = mentorRepository.findBynomorMentor(nomorMentor).get();
        mentorRepository.delete(mentor);
        return "Terhapus";
    }

}

