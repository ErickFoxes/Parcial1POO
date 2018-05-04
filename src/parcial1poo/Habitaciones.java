package parcial1poo;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kevit
 */
public class Habitaciones {
    Map<String,Habitacion> habitaciones;
    
    public Habitaciones(){
        habitaciones = new HashMap<String,Habitacion>();
    }
    
    public void add(String clave,Habitacion habitacion) {
        habitaciones.put(clave, habitacion);
    }
    
    public void mostrar(){
        for(Habitacion h : habitaciones.values()){
            System.out.println(h.getPiso());
        }
    }
    
    public void modificar(String clave) {
        Habitacion h = habitaciones.get(clave);
        h.setCosto(3);
    }
}