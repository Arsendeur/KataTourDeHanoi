import main.TourDeHanoi.TourDeHanoi;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

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


}
