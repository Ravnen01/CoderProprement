package com.lpiem.lecomte.volkwagengroup.Singleton;

import com.lpiem.lecomte.volkwagengroup.data_model.Model;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by iem2 on 12/10/15.
 */
public class VehicleStockManager {
    private static VehicleStockManager INSTANCE=null;
    private static Object verrou;

    ArrayList<Model> StockVehicle;

    private VehicleStockManager() {
        StockVehicle=new ArrayList<>();

    }

    public static VehicleStockManager getINSTANCE(){
        synchronized(verrou){
            if(INSTANCE==null){
                INSTANCE=new VehicleStockManager();
            }
        }
        return INSTANCE;
    }




}
