package com.example.student.myapplication;

public class Studenti {
    private String sIme;
    private String sPrezime;

    public Studenti(String ime, String prezime)
    {
        this.sIme = ime;
        this.sPrezime = prezime;
    }

    public String getsPrezime() {
        return sPrezime;
    }

    public String getsIme() {
        return sIme;
    }
}


