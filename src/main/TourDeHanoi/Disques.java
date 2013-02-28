package main.TourDeHanoi;


import java.util.Stack;

public class Disques {
    private Stack<Disque> listeDeDisques = new Stack<Disque>();

    Disques(int nombreDeDisques)
    {
        int grosseurDuDisque = nombreDeDisques;
        for(int index = 0;  index < nombreDeDisques;  index++)
        {
            listeDeDisques.add(new Disque(grosseurDuDisque));
            grosseurDuDisque--;
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
