package com.cybersoft.specialProject.repository;


import com.cybersoft.specialProject.document.Soru;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by MC on 02.01.2018.
 */

public interface SoruRepository extends MongoRepository<Soru, String> {
    List<Soru> findByBransAndUnite(String brans, String unite, Pageable pageable);
    List<Soru> findByBransAndUniteAndBolum(String brans, String unite, String bolum, Pageable pageable);
    List<Soru> findByBransAndUniteAndBolumAndSoruTip(String brans, String unite, String bolum, String soruTip, Pageable pageable);
    List<Soru> findByBransAndUniteAndBolumAndSoruTipAndZorlukSeviye(String brans, String unite, String bolum, String soruTip, String zorlukSeviye, Pageable pageable);
    void insertSoru(Soru soru);
}
