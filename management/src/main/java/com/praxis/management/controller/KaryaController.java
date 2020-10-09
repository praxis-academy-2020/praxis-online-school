package com.praxis.management.controller;

import com.praxis.management.model.Karya;
import com.praxis.management.repository.KaryaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/praxis/karya")
public class KaryaController {

    @Autowired
    KaryaRepository karyaRepository;

    @PostMapping("/post")
    public Karya postKarya(@RequestBody Karya karya){
        return karyaRepository.save(karya);
    }

    @GetMapping("/get")
    public List<Karya> getKarya(){
        return karyaRepository.findAll();
    }

    @DeleteMapping("/delete")
    public void deleteAllKarya(Iterable<? extends Karya> iterable){
        karyaRepository.deleteAll(iterable);
    }

    @DeleteMapping("/delete/{karyaId}")
    public String deleteKarya(@PathVariable("karyaId") Integer karyaId){
        Karya karya = karyaRepository.findById(karyaId).get();
        karyaRepository.delete(karya);

        return "Delete Success";
    }
}
