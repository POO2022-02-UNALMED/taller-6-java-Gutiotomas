package vehiculos;
import java.util.ArrayList;

public class Camioneta extends Vehiculo {

    boolean volco;
    private static int totalCamionetas;
    static ArrayList<Camioneta> camionetas = new ArrayList<Camioneta>();

    public Camioneta(String placa, int puertas,  String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
        super( placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        camionetas.add(this);
        totalCamionetas++;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }

    public boolean isVolco() {
        return volco;
    }

    public static int getTotalCamionetas() {
        return totalCamionetas;
    }

}