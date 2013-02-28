package main.TourDeHanoi;

public class TourDeHanoi {
    private Disques[] EtatDesTours;

    public TourDeHanoi(int nombreDeDisques) {
        EtatDesTours = new Disques[3];
        EtatDesTours[0] = new Disques(nombreDeDisques);
        EtatDesTours[1] = new Disques(0);
        EtatDesTours[2] = new Disques(0);
    }

    public int[] ObtenirEtat() {
        return new int[]{EtatDesTours[0].ObtenirNombreDeDisques(),
                         EtatDesTours[1].ObtenirNombreDeDisques(),
                         EtatDesTours[2].ObtenirNombreDeDisques()};
    }

    public void DeplacerDisque(int tourOuLeDisqueEstContenu, int tourOuLeDisqueDoitEtreDeplacer) {
        if(TourEstPasVide(tourOuLeDisqueEstContenu) && disqueADeplacerEstPlusPetit(tourOuLeDisqueEstContenu, tourOuLeDisqueDoitEtreDeplacer))
        {
            Disque disqueEnleve = EtatDesTours[tourOuLeDisqueEstContenu].enleverUnDisque();
            EtatDesTours[tourOuLeDisqueDoitEtreDeplacer].ajouterDisque(disqueEnleve);
        }
    }

    private boolean disqueADeplacerEstPlusPetit(int tourOuLeDisqueEstContenu, int tourOuLeDisqueDoitEtreDeplacer) {
        return !TourEstPasVide(tourOuLeDisqueDoitEtreDeplacer) || EtatDesTours[tourOuLeDisqueEstContenu].grosseurDuDernienDisque() < EtatDesTours[tourOuLeDisqueDoitEtreDeplacer].grosseurDuDernienDisque();
    }

    private boolean TourEstPasVide(int TourOuLeDisqueEstContenu) {
        return EtatDesTours[TourOuLeDisqueEstContenu].ObtenirNombreDeDisques() > 0;
    }

    public int grosseurDuDernierDisque(int Tour) {
        return EtatDesTours[Tour].grosseurDuDernienDisque();
    }
}