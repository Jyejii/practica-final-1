package src.main.exemple;
import java.util.Date;

public class PoblacionBacterias {
    // Atributos de la población de bacterias
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private int cantidadInicialBacterias;
    private int temperatura;
    private String condicionesLuminosidad;
    private int cantidadInicialComida;
    private int diaIncrementoComida;
    private int cantidadIncrementoComida;
    private int cantidadFinalComida;

    // Constructor
    public PoblacionBacterias(String nombre, Date fechaInicio, Date fechaFin, int cantidadInicialBacterias,
                              int temperatura, String condicionesLuminosidad, int cantidadInicialComida,
                              int diaIncrementoComida, int cantidadIncrementoComida, int cantidadFinalComida) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantidadInicialBacterias = cantidadInicialBacterias;
        this.temperatura = temperatura;
        this.condicionesLuminosidad = condicionesLuminosidad;
        this.cantidadInicialComida = cantidadInicialComida;
        this.diaIncrementoComida = diaIncrementoComida;
        this.cantidadIncrementoComida = cantidadIncrementoComida;
        this.cantidadFinalComida = cantidadFinalComida;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public int getCantidadInicialBacterias() {
        return cantidadInicialBacterias;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public String getCondicionesLuminosidad() {
        return condicionesLuminosidad;
    }

    public int getCantidadInicialComida() {
        return cantidadInicialComida;
    }

    public int getDiaIncrementoComida() {
        return diaIncrementoComida;
    }

    public int getCantidadIncrementoComida() {
        return cantidadIncrementoComida;
    }

    public int getCantidadFinalComida() {
        return cantidadFinalComida;
    }

    // Método para calcular la cantidad de comida para cada día
    public int[] calcularComidaPorDia() {
        int[] comidaPorDia = new int[30];
        // Cálculo de la comida por día
        // Implementar lógica para incremento y decremento lineal de comida
        return comidaPorDia;
    }
}

