package src.main.exemple;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Date;

public class PoblacionBacteriasTest {
    @Test
    public void testCalcularComidaPorDia() {
        PoblacionBacterias poblacion = new PoblacionBacterias("Poblacion1", new Date(), new Date(),
                100, 37, "Alta", 50, 15, 10, 200);
        int[] comidaPorDiaEsperada = {50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 60, 70, 80, 90, 100, 110,
                120, 130, 140, 150, 160, 170, 180, 190, 200, 200};
        assertArrayEquals(comidaPorDiaEsperada, poblacion.calcularComidaPorDia());
    }
}


