package main.TourDeHanoi;

public class TourDeHanoi {
    private int[] EtatDesTours = {0, 0, 0};

    public TourDeHanoi(int nombreDeDisques) {
        EtatDesTours[0] = nombreDeDisques;
    }

    public int[] ObtenirEtat() {
        return EtatDesTours;
    }

    public void DeplacerDisque(int TourOuLeDisqueEstContenu, int TourOuLeDisqueDoitEtreDeplacer) {
        EtatDesTours[TourOuLeDisqueEstContenu] -= 1;
        EtatDesTours[TourOuLeDisqueDoitEtreDeplacer] += 1;
    }
}
