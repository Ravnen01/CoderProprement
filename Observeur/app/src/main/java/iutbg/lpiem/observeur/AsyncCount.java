package iutbg.lpiem.observeur;

import android.os.AsyncTask;

/**
 * Created by Corentin on 08/01/2016.
 */
public class AsyncCount extends AsyncTask implements Observable{
    Observeur observeur;

    public AsyncCount() {
    }

    @Override
    protected Object doInBackground(Object[] params) {
        try {
            while(true){

                Thread.sleep(1000);
                notif();


            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public void addObserveur(Observeur o) {
        observeur=o;
    }

    @Override
    public void notif() {
        observeur.update();
    }
}
