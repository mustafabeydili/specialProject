package com.cybersoft.specialProject.controller;

import com.cybersoft.specialProject.document.Soru;
import com.cybersoft.specialProject.repository.SoruRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by MC on 02.01.2018.
 */
@Controller
@RequestMapping("/sorular")
public class SoruController {
    @Autowired
    SoruRepository soruRepository;

    // ilk sayfa 0 dan başlıyor !

    @GetMapping(value = "/brans/{brans}/unite/{unite}/{sayfa}/{kayitsayisi}")
    public List<Soru> getAllSoruByBransUnitePaging(@PathVariable("brans") String brans, @PathVariable("unite") String unite, @PathVariable("sayfa") int sayfa, @PathVariable("kayitsayisi") int kayitsayisi) {
        List<Soru> findByBransAndUnite = soruRepository.findByBransAndUnite(brans, unite, new PageRequest(sayfa, kayitsayisi));
        return findByBransAndUnite;
    }

    @GetMapping(value = "/brans/{brans}/unite/{unite}/bolum/{bolum}/{sayfa}/{kayitsayisi}")
    public List<Soru> getAllSoruByBransUniteBolumPaging(@PathVariable("brans") String brans, @PathVariable("unite") String unite, @PathVariable("bolum") String bolum, @PathVariable("sayfa") int sayfa, @PathVariable("kayitsayisi") int kayitsayisi) {
        List<Soru> findByBransAndUniteAndBolum = soruRepository.findByBransAndUniteAndBolum(brans, unite, bolum, new PageRequest(sayfa, kayitsayisi));
        return findByBransAndUniteAndBolum;
    }

    @PostMapping("/soruekle")
    public void insertSoru(@RequestBody Soru soru) {
        soruRepository.insert(soru);
    }
}
