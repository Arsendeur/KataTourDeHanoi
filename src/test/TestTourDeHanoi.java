import main.TourDeHanoi.TourDeHanoi;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestTourDeHanoi {

    @Test
    public void PeutCreerUneTourDeHanoiCorrect()
    {
        TourDeHanoi uneTourDeHanoi = new TourDeHanoi(5);
        assertArrayEquals(new int[]{5, 0, 0}, uneTourDeHanoi.ObtenirEtat());
    }


}
