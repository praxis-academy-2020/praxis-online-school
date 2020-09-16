package com.praxis.management.controller;

import com.praxis.management.model.Murid;
import com.praxis.management.model.Murid;
import com.praxis.management.repository.MuridRepository;

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
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
@RequestMapping("/praxis/murid")
public class MuridController{

    @Autowired
    private MuridRepository muridRepository;

    @GetMapping("/get")
    public List<Murid> getAllUsers(){
        return muridRepository.findAll();
    }

    @GetMapping("/getId/{id}")
    public Optional<Murid> getId(@PathVariable Long id) {
        return muridRepository.findById(id);
      }

    @PostMapping("/post")
    public @ResponseBody Murid createUser(@RequestBody Murid murid){
        return muridRepository.save(murid);
    }

    @PutMapping("/put/{id}")
    public Murid updateUser(@RequestBody Murid newUser, @PathVariable Long id){
        return muridRepository.findById(id).map(
            user -> {
            user.setNama(newUser.getNama());
            user.setStatus(newUser.getStatus());
            user.setEmailUser(newUser.getEmailUser());
            user.setNomorHape(newUser.getNomorHape());
            user.setKelas(newUser.getKelas());
            return muridRepository.save(user);

        }).orElseGet(() -> {
          //   newUser.setId(userId);
          newUser.setId(id);
          return muridRepository.save(newUser);
        });
    }


}