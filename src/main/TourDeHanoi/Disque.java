package main.TourDeHanoi;


public class Disque {
    private final int grosseurDuDisque;

    public Disque(int grosseurDuDisque) {
        this.grosseurDuDisque = grosseurDuDisque;
    }

    public int obtenirGrosseurDuDisque() {
        return this.grosseurDuDisque;
    }
}
