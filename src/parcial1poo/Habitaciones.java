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
            String Imprimir,TipoH,Disponible,piso,Clave;
            double costo;
            int NHabitacion;
            if(h.isTipo()==true){
                TipoH = "Simple";
            }else{
                TipoH = "Doble";
            }
            if(h.isDisponible()==true){
                Disponible = "Disponible";
            }else{
                Disponible = "No Disponible";
            }
            NHabitacion=h.getNumHb();
            costo = h.getCosto();
            piso=h.getPiso();
            Clave = h.getIdHabitacion();
            Imprimir = "id habitacion:"+Clave+"\nTipo Habitacion: "+TipoH+"\nDisponibilidad: "+Disponible+"\nCosto de habitación: "+costo+"\nPiso: "+piso+"\nNumero de habitacion: "+NHabitacion;
            
            System.out.println(Imprimir);
        });
    }
    
    public void modificar(String clave) {
        
        Habitacion h = habitaciones.get(clave);
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la opcion de lo que desea modificar: ");
        System.out.println("1. Costo");
        System.out.println("2. Tipo (simple/doble)");
        System.out.println("3. Disponiblidad (disponible/cancelado)");
        System.out.println("4. Piso");
        System.out.println("5. Numero de habitacion");
        int i = s.nextInt();
        
        String resp;
        Scanner M = new Scanner(System.in);
        switch (i){
            case 1:
                System.out.println("Digite el nuevo costo :");
                Scanner j = new Scanner(System.in);
                double costo = j.nextDouble();
                h.setCosto(costo);
                break;            
            case 2:
                boolean doble;
                System.out.println("Digite el nuevo tipo de habitacion: ");
                Scanner q = new Scanner(System.in);
                resp = q.next();
                    if("simple".equals(resp)){
                        doble=true;
                        h.setTipo(doble);
                    }else if("doble".equals(resp)){
                        doble = false;
                        h.setTipo(doble);
                    }
                break;
            case 3:
                boolean cancelado;
                System.out.println("Digite el nuevo estado de la habitacion (disponible/cancelado): ");
                Scanner k = new Scanner(System.in);
                resp = k.next();
                    if("disponible".equals(resp)){
                        cancelado = true;
                        h.setDisponible(cancelado);
                    }else if("cancelado".equals(resp)){
                        cancelado = false;
                        h.setDisponible(cancelado);
                        }
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