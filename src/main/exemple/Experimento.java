package src.main.exemple;
import java.util.ArrayList;

public class Experimento {

    private ArrayList<PoblacionBacterias> poblaciones = new ArrayList<>();

    // Método para añadir población de bacterias al experimento
    public void agregarPoblacionBacterias(PoblacionBacterias poblacion) {
        poblaciones.add(poblacion);
    }

    // Método getter para obtener la lista de poblaciones de bacterias
    public ArrayList<PoblacionBacterias> getPoblaciones() {
        return poblaciones;
    }
}




