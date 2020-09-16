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

@RestCOntroller
@RequestMapping("/praxis")
public class MentorController{
    
    @Autowired
    private MentorRepository mentorRepository;

    @GetMapping("/getAll")
    public List<Mentor> getAllUsers(){
        return mentorRepository.findAll();
    }

    @PutMapping("/put{id}")
    Mentor updateUser(@RequestBody Mentor newUser, @PathVariable Long id){
        return mentorRepository.findById(id).map(
            user -> {
            user.setNama(newUser.getNama());
            user.setStatus(newUser.getStatus());
            user.setNamaKelas(newUser.getNamaKelas());
            return muridRepository.save(user);

        }).orElseGet(() -> {
          //   newUser.setId(userId);
          newUser.setId(id);
          return muridRepository.save(newUser);
        });
    }


}

