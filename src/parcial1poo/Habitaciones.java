package parcial1poo;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author kevit
 */
public class Habitaciones {
    Map<String,Habitacion> habitaciones;
    
    public Habitaciones(){
        habitaciones = new HashMap<>();
    }
    
    public void add(String clave,Habitacion habitacion) {
        habitaciones.put(clave, habitacion);
    }
    
    public void mostrar(){
        habitaciones.values().forEach((h) -> {
            System.out.println(h.getPiso());
        });
    }
    
    public void modificar(String clave) {
        Habitacion h = habitaciones.get(clave);
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        
        switch (i){
            case 1:
                System.out.println("Digite el nuevo costo :");
                Scanner j = new Scanner(System.in);
                int costo = j.nextInt();
                h.setCosto(costo);
                break;            
            case 2:
                System.out.println("Digite el nuevo campo:");
                Scanner q = new Scanner(System.in);
                boolean tipo = q.nextBoolean();
                h.setTipo(tipo);
                break;
            case 3:
                System.out.println("Digite el nuevo campo:");
                Scanner k = new Scanner(System.in);
                boolean disponible = k.nextBoolean();
                h.setDisponible(disponible);
                break;
            case 4:
                System.out.println("Digite el nuevo piso:");
                Scanner o = new Scanner(System.in);
                String piso = o.nextLine();
                h.setPiso(piso);
                break;
            case 5:
                System.out.println("Digite el nuevo numero de habitacion:");
                Scanner l = new Scanner(System.in);
                int numHb = l.nextInt();
                h.setNumHb(numHb);
                break;
        }
    }
}