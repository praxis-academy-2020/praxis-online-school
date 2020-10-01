package com.praxis.management.controller;

import com.praxis.management.model.Kelas;
import com.praxis.management.repository.KelasRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.server.ResponseStatusException;

@CrossOrigin
@RestController
@RequestMapping("/praxis/kelas")
public class KelasController{
    
    @Autowired
    private KelasRepository kelasRepository;

    @GetMapping("/getKelas")
    public List<Kelas> getAllKelas(){
        return kelasRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public Kelas getByNomorKelas(@PathVariable("id") Long nomorKelas){
        return kelasRepository.findByNomorKelas(nomorKelas).get();
    }

    @PostMapping("/post")
    public @ResponseBody Kelas createUser(@RequestBody Kelas kelas){
        return kelasRepository.save(kelas);
    }

    @PutMapping("/put/{id}")
    public Kelas updateKelas(@RequestBody Kelas newKelas, @PathVariable("id") Long nomorKelas){
        return kelasRepository.findByNomorKelas(nomorKelas).map(
            kelas -> {
            kelas.setNamaKelas(newKelas.getNamaKelas());
            kelas.setJumlahPeserta(newKelas.getJumlahPeserta());
            kelas.setIdMentor(newKelas.getIdMentor());
            // kelas.setNomorKelas(newKelas.getNomorKelas());
            return kelasRepository.save(kelas);

        }).orElseGet(() -> {
          //   newUser.setId(userId);
          newKelas.setNomorKelas(nomorKelas);
          return kelasRepository.save(newKelas);
        });
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long nomorKelas){
        Kelas kelas = kelasRepository.findByNomorKelas(nomorKelas).get();
        kelasRepository.delete(kelas);
        return "Terhapus";
    }

    


}
