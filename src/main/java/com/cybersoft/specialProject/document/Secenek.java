package com.cybersoft.specialProject.document;

/**
 * Created by MC on 02.01.2018.
 */
public class Secenek {
    private String tip; // a , b , c , d
    private String metin;

    public Secenek(String tip, String metin) {
        this.tip = tip;
        this.metin = metin;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getMetin() {
        return metin;
    }

    public void setMetin(String metin) {
        this.metin = metin;
    }
}
