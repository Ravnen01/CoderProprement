package com.lpiem.lecomte.volkwagengroup.Factory;

import com.lpiem.lecomte.volkwagengroup.data_model.Auto;
import com.lpiem.lecomte.volkwagengroup.data_model.Model;
import com.lpiem.lecomte.volkwagengroup.data_model.Moto;
import com.lpiem.lecomte.volkwagengroup.data_model.Truck;
import com.lpiem.lecomte.volkwagengroup.data_model.Utilitaire;

/**
 * Created by iem2 on 03/11/15.
 */
public abstract class ModelFactory {
    public Auto getAuto(){
        return new Auto();
    }

    public Moto getMoto(){
        return new Moto();
    }

    public Truck getTruck(){
        return new Truck();
    }

    public Utilitaire getUtilitaire(){
        return new Utilitaire();

    }

}
