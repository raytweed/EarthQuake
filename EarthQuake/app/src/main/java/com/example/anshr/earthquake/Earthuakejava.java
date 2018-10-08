package com.example.anshr.earthquake;

public class Earthuakejava {
    private String mag;
    private String place;
    private  String date;

    public  Earthuakejava(String magnitude, String plac,String daat ){
        mag=magnitude;
        place=plac;
        date=daat;
    }

    public String getMag() {
        return mag;
    }

    public String getPlace() {
        return place;
    }

    public String getDate() {
        return date;
    }
}
