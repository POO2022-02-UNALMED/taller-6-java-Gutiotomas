package vehiculos;
import java.util.Hashtable;

public class Fabricante {
    static Hashtable <Fabricante, Integer> lista_fabricantes = new Hashtable <Fabricante, Integer>();
    String nombre;
    Pais pais;

    public Fabricante (String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Pais getPais() {
        return pais;
    }

    public static Fabricante fabricaMayorVentas() {
        int max = 0;
        Fabricante fabricante = null;
        for (Fabricante key : lista_fabricantes.keySet()) {
            if (lista_fabricantes.get(key) > max) {
                max = lista_fabricantes.get(key);
                fabricante = key;
            }
        }
        return fabricante;
    }


}