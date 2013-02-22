package main.TourDeHanoi;

public class TourDeHanoi {

    private int nombreDeDisques;
    public TourDeHanoi(int nombreDeDisques) {
        this.nombreDeDisques = nombreDeDisques;
    }

    public int[] ObtenirEtat() {
        return new int[]{5, 0, 0};
    }
}
