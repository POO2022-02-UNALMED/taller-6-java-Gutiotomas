package vehiculos;
import java.util.Hashtable;

public class Pais {
    String nombre;
    static Hashtable <Pais, Integer> lista_paises = new Hashtable <Pais, Integer>();

    public Pais (String nombre) {
        this.nombre = nombre;
        if (lista_paises.containsKey(this)) {
            lista_paises.put(this, lista_paises.get(this) + 1);
        } else {
            lista_paises.put(this, 1);
        } 
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static Pais paisMasVendedor() {
        int max = 0;
        Pais pais = null;
        for (Pais key : lista_paises.keySet()) {
            if (lista_paises.get(key) > max) {
                max = lista_paises.get(key);
                pais = key;
            }
        }
        return pais;
    }
}