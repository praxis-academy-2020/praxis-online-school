package com.praxis.management.controller;

import com.praxis.management.model.Kelas;
import com.praxis.management.repository.KelasRepository;

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
public class KelasController{
    
    @Autowired
    private KelasRepository kelasRepository;

    @GetMapping("/getAll")
    public List<Kelas> getAllUsers(){
        return kelasRepository.findAll();
    }

    @PutMapping("/put{id}")
    Mentor updateUser(@RequestBody Kelas newUser, @PathVariable Long id){
        return kelasRepository.findById(id).map(
            user -> {
            user.setNamaKelas(newUser.getNama());
            user.setJumlah(newUser.getJumlahPeserta());
            return kelasRepository.save(user);

        }).orElseGet(() -> {
          //   newUser.setId(userId);
          newUser.setId(id);
          return kelasRepository.save(newUser);
        });
    }


}
