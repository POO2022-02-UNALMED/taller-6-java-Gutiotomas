package vehiculos;

import java.util.ArrayList;

public class Automovil extends Vehiculo {
    int puestos;
    static int totalAutomoviles;
    ArrayList<Automovil> automoviles = new ArrayList<Automovil>();
    
    public Automovil(String placa,  String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        automoviles.add(this);
        totalAutomoviles++;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    public int getPuestos() {
        return puestos;
    }

    public static int getTotalAutomoviles() {
        return totalAutomoviles;
    }


}