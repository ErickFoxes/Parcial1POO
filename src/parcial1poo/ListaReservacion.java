package parcial1poo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kaztro
 */
public class ListaReservacion {
    public ArrayList<String> reservas;

    public ListaReservacion(ArrayList<String> reservas) {
        this.reservas = reservas;
    }

    /**
     * Se utiliza para agregar reservaciones a la lista
     */
    public void agregarReserva(){
        Reservacion reservacion = new Reservacion();
        reservacion.agregarReserva(reservacion);
        Scanner read = new Scanner(System.in);
         System.out.println("Ingrese la reservacion");
        System.out.print(": ");
        estudiante.setNombres(leer.nextLine());
        
        System.out.println("Ingrese los apellids del estudiante");
        System.out.print(": ");
        estudiante.setApellidos(leer.nextLine());
        
        System.out.println("Ingrese el carne del estudiante");
        System.out.print(": ");
        estudiante.setCarnet(leer.next());
    }
    
    public void modificarReserva(){
        
    }
        
    public void mostrarReserva(){
        
    } 
}