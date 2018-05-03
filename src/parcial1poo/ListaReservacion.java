package parcial1poo;

import java.util.ArrayList;
import java.util.Scanner;
//import java.util.Scanner;

/**
 *
 * @author kaztro
 */
public class ListaReservacion {
    public ArrayList<Reservacion> reservas;

    public ListaReservacion(){
        reservas = new ArrayList<>();
    }

    /**
     * Se utiliza para agregar reservaciones a la lista
     */
    
    public void agregarReserva(){
        Reservacion reservacion = new Reservacion();
        reservas.agregarReserva(reservacion);
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese fecha de reservacion");
        System.out.print(": ");
        reservacion.setFechaReservacion(read.nextLine());
        
        System.out.println("Ingrese los dias de reserva");
        System.out.print(": ");
        reservacion.setDiasReservacion(read.nextLine());
        
        System.out.println("¿En que habitacion se hospedara?");
        System.out.print(": ");
        reservacion.setHabitacion(read.nextLine());
        
        System.out.println("¿Ha cancelado?");
        System.out.print(": ");
        reservacion.setCancelado(read.nextLine());
        
    }
   
    public void agregarReserva(Reservacion reservacion) throws Exception{
        if(reservacion != null) {
            if (!reservas.contains(reservacion)) {
                reservas.add(reservacion);
            }
            Exception except = new Exception("Los datos ya pertenecen a otro cliente");
            throw except;
        } else {
            throw new Exception("No puede dejar vacia la reserva");
        }
        
    }
    
    public void modificarReserva(){
        
    }
        
    public void mostrarReserva(){
        reservas.forEach((rsrvs) -> {
            System.out.println(rsrvs.toString());
        });
    }
}
