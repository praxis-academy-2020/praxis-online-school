package com.praxis.management.controller;

import com.praxis.management.model.Kelas;
import com.praxis.management.model.Murid;
import com.praxis.management.model.Murid;
import com.praxis.management.repository.MuridRepository;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.server.ResponseStatusException;

@CrossOrigin
@RestController
@RequestMapping("/praxis/murid")
public class MuridController{

    @Autowired
    private MuridRepository muridRepository;

    @GetMapping("/get")
    public List<Murid> getAllUsers(){
        return muridRepository.findAll();
    }
    

    @GetMapping("/get/{id}")
    public @ResponseBody Optional<Murid> getId(@PathVariable("id") Long userId) {
        return muridRepository.findByUserId(userId);
      }

    @PostMapping("/post")
    public @ResponseBody Murid createUser(@RequestBody  Murid murid) throws Exception{
        String message = "";

        return muridRepository.save(murid);
//        try {
//
//        }
//        catch (IOException ex){
//
//            return message;
//        }

    }



    @PutMapping("/put/{id}")
    public Murid updateUser(@RequestBody Murid newUser, @PathVariable Long userId){
        return muridRepository.findByUserId(userId).map(
            user -> {
//            user.setNama(newUser.getNama());
//            user.setStatus(newUser.getStatus());
            user.setEmailUser(newUser.getEmailUser());
            user.setNomorHape(newUser.getNomorHape());
            //user.setNomorKelas(newUser.getNomorKelas());
           // user.setKelas(newUser.getKelas());
            return muridRepository.save(user);

        }).orElseGet(() -> {
          //   newUser.setId(userId);
          newUser.setUserId(userId);
          return muridRepository.save(newUser);
        });
    }

    @GetMapping("/jumlah/{noKelas}")
    public @ResponseBody List<Murid> lihatJumlah(@PathVariable("noKelas") Long nomorKelas){
        return muridRepository.findByJumlahPeserta(nomorKelas);
        // try {
        //     return muridRepository.findJumlahPeserta(nomorKelas).map(
        //         murid -> {
        //             return murid.setNomorKelas(nomorKelas);
        //         }
        //     );
        // } catch (Exception e) {
        //     //TODO: handle exception
        //     return "exception";
        // }
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long userId){
        Murid murid = muridRepository.findByUserId(userId).get();
        muridRepository.delete(murid);
        return "Terhapus";

    }
}