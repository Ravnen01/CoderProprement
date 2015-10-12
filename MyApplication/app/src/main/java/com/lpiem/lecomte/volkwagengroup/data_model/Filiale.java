package com.lpiem.lecomte.volkwagengroup.data_model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by iem2 on 12/10/15.
 */
public class Filiale {

    private String nom;
    private String chaminLogo;
    private double chiffreAffaire;
    private String origine;
    private int nbEmploye;
    private Date dateRachat;
    private ArrayList<Model> listModel;

    public Filiale() {
    }

    public Filiale(String nom, String chaminLogo, double chiffreAffaire, String origine, int nbEmploye, Date dateRachat) {
        this.nom = nom;
        this.chaminLogo = chaminLogo;
        this.chiffreAffaire = chiffreAffaire;
        this.origine = origine;
        this.nbEmploye = nbEmploye;
        this.dateRachat = dateRachat;
        listModel=new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getChaminLogo() {
        return chaminLogo;
    }

    public void setChaminLogo(String chaminLogo) {
        this.chaminLogo = chaminLogo;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public int getNbEmploye() {
        return nbEmploye;
    }

    public void setNbEmploye(int nbEmploye) {
        this.nbEmploye = nbEmploye;
    }

    public Date getDateRachat() {
        return dateRachat;
    }

    public void setDateRachat(Date dateRachat) {
        this.dateRachat = dateRachat;
    }

    public void addModel(Model model){
        listModel.add(model);
    }

    public Model getIndexModel(int index){
        return listModel.get(index);
    }
}
