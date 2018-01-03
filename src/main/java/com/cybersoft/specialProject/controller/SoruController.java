package com.cybersoft.specialProject.controller;

import com.cybersoft.specialProject.document.Soru;
import com.cybersoft.specialProject.repository.SoruRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public List<Soru> getAllSoruByBransUnitePaging(@PathVariable("brans") String brans,
                                                   @PathVariable("unite") String unite,
                                                   @PathVariable("sayfa") int sayfa,
                                                   @PathVariable("kayitsayisi") int kayitsayisi) {
        List<Soru> findByBransAndUnite = soruRepository.findByBransAndUnite(brans, unite, new PageRequest(sayfa, kayitsayisi));
        return findByBransAndUnite;
    }

    @GetMapping(value = "/brans/{brans}/unite/{unite}/bolum/{bolum}/{sayfa}/{kayitsayisi}")
    public List<Soru> getAllSoruByBransUniteBolumPaging(@PathVariable("brans") String brans,
                                                        @PathVariable("unite") String unite,
                                                        @PathVariable("bolum") String bolum,
                                                        @PathVariable("sayfa") int sayfa,
                                                        @PathVariable("kayitsayisi") int kayitsayisi) {
        List<Soru> findByBransAndUniteAndBolum = soruRepository.findByBransAndUniteAndBolum(brans, unite, bolum, new PageRequest(sayfa, kayitsayisi));
        return findByBransAndUniteAndBolum;
    }

    @GetMapping(value = "/brans/{brans}/unite/{unite}/bolum/{bolum}/soruTip/{soruTip}/{sayfa}/{kayitsayisi}")
    public List<Soru> getAllSoruByBransUniteBolumSoruTipPaging(@PathVariable("brans") String brans,
                                                               @PathVariable("unite") String unite,
                                                               @PathVariable("bolum") String bolum,
                                                               @PathVariable("soruTip") String soruTip,
                                                               @PathVariable("sayfa") int sayfa,
                                                               @PathVariable("kayitsayisi") int kayitsayisi) {
        List<Soru> findByBransAndUniteAndBolumAndSoruTip = soruRepository.findByBransAndUniteAndBolumAndSoruTip(brans, unite, bolum, soruTip, new PageRequest(sayfa, kayitsayisi));
        return findByBransAndUniteAndBolumAndSoruTip;
    }

    @GetMapping(value = "/brans/{brans}/unite/{unite}/bolum/{bolum}/soruTip/{soruTip}/zorlukSeviye/{zorlukSeviye}/{sayfa}/{kayitsayisi}")
    public List<Soru> getAllSoruByBransUniteBolumSoruTipZorlukSeviyePaging(@PathVariable("brans") String brans,
                                                                           @PathVariable("unite") String unite,
                                                                           @PathVariable("bolum") String bolum,
                                                                           @PathVariable("soruTip") String soruTip,
                                                                           @PathVariable("zorlukSeviye") String zorlukSeviye,
                                                                           @PathVariable("sayfa") int sayfa,
                                                                           @PathVariable("kayitsayisi") int kayitsayisi) {
        List<Soru> findByBransAndUniteAndBolumAndSoruTipAndZorlukSeviye = soruRepository.findByBransAndUniteAndBolumAndSoruTipAndZorlukSeviye(brans, unite, bolum, soruTip, zorlukSeviye, new PageRequest(sayfa, kayitsayisi));
        return findByBransAndUniteAndBolumAndSoruTipAndZorlukSeviye;
    }

    @PostMapping(value = "/soruekle")
    public Soru insertSoru(@RequestBody Soru soru) {
        return soruRepository.insert(soru);
    }
}
