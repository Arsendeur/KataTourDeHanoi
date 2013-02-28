package main.TourDeHanoi;


import java.util.Stack;

public class Disques {
    private Stack<Disque> listeDeDisques = new Stack<Disque>();

    Disques(int nombreDeDisques)
    {
        int grosseurDuDisque = 0;
        for(int index = 0 ;  index < nombreDeDisques;  index++)
        {
            grosseurDuDisque++;
            listeDeDisques.add(new Disque(grosseurDuDisque));
        }
    }

    public int ObtenirNombreDeDisques() {
        return listeDeDisques.size();
    }

    public Disque enleverUnDisque() {
        return listeDeDisques.pop();
    }

    public void ajouterDisque(Disque disqueAAjouter) {
        listeDeDisques.add(disqueAAjouter);
    }

    public int grosseurDuDernienDisque() {
        return listeDeDisques.peek().obtenirGrosseurDuDisque();
    }
}
