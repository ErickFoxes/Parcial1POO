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
            System.out.println("Numero de habitacion: "+h.getNumHb()+" tipo: "+h.isTipo()+" Costo: "+h.getCosto()+" Piso: "+h.getPiso()+" Disponible: "+h.isDisponible());
        });
    }
    
    public void modificar(String clave) {
        Habitacion h = habitaciones.get(clave);
        Scanner s = new Scanner(System.in);
        
        System.out.println("-- modificar habitaciones --");
        System.out.println("1. modificar costo");
        System.out.println("2. modificar tipo");
        System.out.println("3. modificar disponibilidad");
        System.out.println("4. modificar piso");
        System.out.println("5. modificar numero de piso");
        
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
            default:
                System.out.println("Ingrese un numero correcto");
                break;
                
        }
    }
}