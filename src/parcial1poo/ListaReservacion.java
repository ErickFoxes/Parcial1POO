package parcial1poo;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        reservas.add(reservacion);
        Scanner read = new Scanner(System.in);
        
        System.out.println("¿Ingrese el ID");
        System.out.print(": ");
        reservacion.setDiasReservacion(read.nextInt());
        
        System.out.println("¿Cuantos dias se hospedara?");
        System.out.print(": ");
        reservacion.setDiasReservacion(read.nextInt());
        
             
        System.out.println("Ingrese fecha de reservacion (dd/mm/aaa)");
        System.out.print(": ");
        String fecha = read.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date pruebaf = null;
        String date = fecha;
        try{
            pruebaf = format.parse(date);
            System.out.println("Ahora hemos creado un objeto date con la fecha indicada, "+pruebaf);
        } catch (Exception e){ System.out.println("invalid format");}

        if (!format.format(pruebaf).equals(date)){
            System.out.println("invalid date!!");
        } else {
            System.out.println("valid date");
        }
        
        System.out.println("¿Ha cancelado?");
        System.out.print(": ");
        reservacion.setCancelado(read.nextBoolean()); 
        
        System.out.println("¿En que habitacion se hospedara?");
        System.out.print(": ");
        reservacion.setHabitacion(read.Habitacion());
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
