package com.example.persons;

public class PersonModel {

    private int id;
    private String imie;
    private String nazwisko;
    private int wiek;
    private int majatek;
    private String zdjecie;
    private String narodowosc;
    private String adres_zamieszkania;
    private String najpopularniejsze_przedsiebiorstwo;


    public PersonModel(int id, String imie, String nazwisko, int wiek, int majatek, String zdjecie, String narodowosc, String adres_zamieszkania, String najpopularniejsze_przedsiebiorstwo, Miejsce_i_data_urodzenia miejsce_i_data_urodzenia) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.majatek = majatek;
        this.zdjecie = zdjecie;
        this.narodowosc = narodowosc;
        this.adres_zamieszkania = adres_zamieszkania;
        this.najpopularniejsze_przedsiebiorstwo = najpopularniejsze_przedsiebiorstwo;
        this.miejsce_i_data_urodzenia = miejsce_i_data_urodzenia;
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public int getMajatek() {
        return majatek;
    }

    public String getZdjecie() {
        return zdjecie;
    }

    public String getNarodowosc() {
        return narodowosc;
    }

    public String getAdres_zamieszkania() {
        return adres_zamieszkania;
    }

    public String getNajpopularniejsze_przedsiebiorstwo() {
        return najpopularniejsze_przedsiebiorstwo;
    }

    private Miejsce_i_data_urodzenia miejsce_i_data_urodzenia;


    public Miejsce_i_data_urodzenia getMiejsce_i_data_urodzenia() {
        return miejsce_i_data_urodzenia;
    }
}
