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
        reservacion.setId_Reservacion(read.nextInt());
        
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
        } catch (Exception e){ System.out.println("invalid format");}
        if (!format.format(pruebaf).equals(date)){
            System.out.println("Fecha Incorrecta");
        } else {
            reservacion.setFechaReservacion(pruebaf);
        }
        
        System.out.println("¿Ha cancelado?");
        System.out.print(": ");
        reservacion.setCancelado(read.nextBoolean()); 
    /*    
        System.out.println("¿En que habitacion se hospedara?");
        System.out.print(": ");
        reservacion.setHabitacion(read.Habitacion());*/
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
        Scanner read = new Scanner(System.in);
        int idMod; 
        System.out.println("Ingrese el ID de la reserva que quiere modificar");
        idMod = read.nextInt();
        reservas.forEach((rsrvs) -> {
            if (idMod == rsrvs.id_Reservacion) {
                rsrvs.diasReservacion = read.nextInt();
                //rsrvs.fechaReservacion = ???????
                rsrvs.cancelado = read.nextBoolean();
                ///rsrvs.habitacion = ???????
            }
            
        });
    }
        
    public void mostrarReserva(){
        reservas.forEach((rsrvs) -> {
            System.out.println(rsrvs.toString());
        });
    }
}
