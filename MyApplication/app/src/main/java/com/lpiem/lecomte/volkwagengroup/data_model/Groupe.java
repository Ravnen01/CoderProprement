package com.lpiem.lecomte.volkwagengroup.data_model;

import java.util.ArrayList;

/**
 * Created by iem2 on 12/10/15.
 */
public class Groupe {
    private String nom;

    private ArrayList<Filiale> listFiliale;

    public Groupe() {
    }

    public Groupe(String nom) {
        this.nom = nom;
        listFiliale=new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void addFiliale(Filiale filiale){
        listFiliale.add(filiale);
    }

    public Filiale getFilialeIndex(int index){
        return listFiliale.get(index);
    }
}
