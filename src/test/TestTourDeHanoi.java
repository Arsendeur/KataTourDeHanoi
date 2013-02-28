import main.TourDeHanoi.TourDeHanoi;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestTourDeHanoi {
    private TourDeHanoi uneTourDeHanoi;

   @Before
   public void Initialiser()
   {
       uneTourDeHanoi = new TourDeHanoi(5);
   }

    @Test
    public void PeutCreerUneTourDeHanoiCorrect()
    {
        assertArrayEquals(new int[]{5, 0, 0}, uneTourDeHanoi.ObtenirEtat());
    }

    @Test
    public void PeutDeplacerUnDisque()
    {
        uneTourDeHanoi.DeplacerDisque(0, 1);
        assertArrayEquals(new int[]{4, 1, 0}, uneTourDeHanoi.ObtenirEtat());
    }

    @Test
    public void NePeutPasDeplacerUnDisqueProvenantDUneTourVide()
    {
        uneTourDeHanoi.DeplacerDisque(1, 2);
        assertArrayEquals(new int[]{5, 0, 0}, uneTourDeHanoi.ObtenirEtat());
    }

    @Test
    public void PeutRetournerLaGrosseurDuDisqueLePlusHaut()
    {
        uneTourDeHanoi.DeplacerDisque(0, 1);
        assertEquals(2, uneTourDeHanoi.grosseurDuDernierDisque(0));
        assertEquals(1, uneTourDeHanoi.grosseurDuDernierDisque(1));
    }

    @Test
    public void NePeutPasDeplacerUnGrosDisqueSurUnPetitDisque()
    {
        uneTourDeHanoi.DeplacerDisque(0, 1);
        uneTourDeHanoi.DeplacerDisque(0, 1);
        assertArrayEquals(new int[]{4, 1, 0}, uneTourDeHanoi.ObtenirEtat());
    }

}
