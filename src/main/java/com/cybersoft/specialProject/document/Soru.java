package com.cybersoft.specialProject.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by MC on 31.12.2017.
 */
@Document
public class Soru {

    @Id
    private String id;
    @Indexed
    private String brans;
    @Indexed
    private String unite;
    @Indexed
    private String bolum;
    private String metin;
    private List<Secenek> secenekler; // şıklar
    private String dogruSecenekTip; // seçenekler listesindeki doğru seçeneğin tipi
    @Indexed
    private String soruTip; // coktansecmeli, boslukdoldurma, dogruyanlis, eslestirme
    @Indexed
    private String zorlukSeviye; // kolay , orta, zor

    public Soru(String brans, String unite, String bolum, String metin, List<Secenek> secenekler, String dogruSecenekTip, String soruTip, String zorlukSeviye) {
        this.brans = brans;
        this.unite = unite;
        this.bolum = bolum;
        this.metin = metin;
        this.secenekler = secenekler;
        this.dogruSecenekTip = dogruSecenekTip;
        this.soruTip = soruTip;
        this.zorlukSeviye = zorlukSeviye;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public String getDogruSecenekTip() {
        return dogruSecenekTip;
    }

    public void setDogruSecenekTip(String dogruSecenekTip) {
        this.dogruSecenekTip = dogruSecenekTip;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getMetin() {
        return metin;
    }

    public void setMetin(String metin) {
        this.metin = metin;
    }

    public List<Secenek> getSecenekler() {
        return secenekler;
    }

    public void setSecenekler(List<Secenek> secenekler) {
        this.secenekler = secenekler;
    }

    public String getSoruTip() {
        return soruTip;
    }

    public void setSoruTip(String soruTip) {
        this.soruTip = soruTip;
    }

    public String getZorlukSeviye() {
        return zorlukSeviye;
    }

    public void setZorlukSeviye(String zorlukSeviye) {
        this.zorlukSeviye = zorlukSeviye;
    }
}
