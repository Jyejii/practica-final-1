package src.main.exemple;
import org.junit.Test;
import java.util.Date;

public class ExperimentoTest {
    @Test
    public void testAgregarPoblacionBacterias() {
        Experimento experimento = new Experimento();
        PoblacionBacterias poblacion1 = new PoblacionBacterias("Poblacion1", new Date(), new Date(),
                100, 37, "Alta", 50, 15, 10, 200);
        PoblacionBacterias poblacion2 = new PoblacionBacterias("Poblacion2", new Date(), new Date(),
                150, 37, "Baja", 40, 10, 8, 180);

        experimento.agregarPoblacionBacterias(poblacion1);
        experimento.agregarPoblacionBacterias(poblacion2);

        equals(2, experimento.getPoblacionesBacterias().size());
        equals("Poblacion1", experimento.getPoblacionesBacterias().get(0).getNombre());
        equals("Poblacion2", experimento.getPoblacionesBacterias().get(1).getNombre());
    }

    @Test
    public void testEliminarPoblacionBacterias() {
        Experimento experimento = new Experimento();
        PoblacionBacterias poblacion1 = new PoblacionBacterias("Poblacion1", new Date(), new Date(),
                100, 37, "Alta", 50, 15, 10, 200);
        PoblacionBacterias poblacion2 = new PoblacionBacterias("Poblacion2", new Date(), new Date(),
                150, 37, "Baja", 40, 10, 8, 180);

        experimento.agregarPoblacionBacterias(poblacion1);
        experimento.agregarPoblacionBacterias(poblacion2);
        assertEquals(2, experimento.getPoblacionesBacterias().size());

        experimento.eliminarPoblacionBacterias(poblacion1);
        assertEquals(1, experimento.getPoblacionesBacterias().size());
        assertEquals("Poblacion2", experimento.getPoblacionesBacterias().get(0).getNombre());
    }
}
