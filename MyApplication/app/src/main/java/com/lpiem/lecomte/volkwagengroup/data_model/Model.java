package com.lpiem.lecomte.volkwagengroup.data_model;

/**
 * Created by iem2 on 12/10/15.
 */
public abstract class Model {

    protected String model;
    protected String mversion;
    protected int anneeFabrication;
    protected int emmissionCO2;

    protected Model() {
    }

    protected Model(String model, String mversion, int anneeFabrication, int emmissionCO2) {
        this.model = model;
        this.mversion = mversion;
        this.anneeFabrication = anneeFabrication;
        this.emmissionCO2 = emmissionCO2;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMversion() {
        return mversion;
    }

    public void setMversion(String mversion) {
        this.mversion = mversion;
    }

    public int getAnneeFabrication() {
        return anneeFabrication;
    }

    public void setAnneeFabrication(int anneeFabrication) {
        this.anneeFabrication = anneeFabrication;
    }

    public int getEmmissionCO2() {
        return emmissionCO2;
    }

    public void setEmmissionCO2(int emmissionCO2) {
        this.emmissionCO2 = emmissionCO2;
    }

    
}
