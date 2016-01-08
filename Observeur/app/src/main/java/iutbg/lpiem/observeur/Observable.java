package iutbg.lpiem.observeur;

/**
 * Created by Corentin on 08/01/2016.
 */
public interface Observable {
    void addObserveur(Observeur o);
    void notif();
}
