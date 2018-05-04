package parcial1poo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
//import java.text.SimpleDateFormat;

/**
 *
 * @author kaztro
 */
public class ListaReservacion {

    public ArrayList<Reservacion> reservas;

    public ListaReservacion() {
        reservas = new ArrayList<>();
    }

    /**
     * Se utiliza para agregar reservaciones a la lista
     */
    public void agregarReserva() {
        Reservacion reservacion = new Reservacion();
        reservas.add(reservacion);
        Scanner read = new Scanner(System.in);
        String resp;

        System.out.println("¿Ingrese el ID");
        System.out.print(": ");
        reservacion.id_Reservacion = read.nextInt();

        System.out.println("¿Cuantos dias se hospedara?");
        System.out.print(": ");
        reservacion.diasReservacion = read.nextInt();

        System.out.println("Ingrese fecha de reservacion (dd/MM/aaa)");
        System.out.print(": ");
        //String dia, mes, annio;
        /*System.out.println("Ingresa el dia");
        System.out.print(": ");
        dia = read.nextLine();
        System.out.println("Ingresa el mes");
        System.out.print(": ");
        mes = read.nextLine();
        System.out.println("Ingresa el annio");
        System.out.print(": ");
        annio = read.nextLine(); mes+"/"+dia+"/"+annio*/
//        Date date = new Date(5/2/3);
//        reservacion.fechaReservacion = date;
        
        reservacion.cancelado = false;
        
        /*    
        System.out.println("¿En que habitacion se hospedara?");
        System.out.print(": ");
        reservacion.setHabitacion(read.Habitacion());*/

    }
    public void agregarReserva(Reservacion reservacion) throws Exception {
        if (reservacion != null) {
            if (!reservas.contains(reservacion)) {
                reservas.add(reservacion);
            }
            Exception except = new Exception("Los datos ya pertenecen a otro cliente");
            throw except;
        } else {
            throw new Exception("No puede dejar vacia la reserva");
        }

    }

    public void modificarReserva() {
        Scanner read = new Scanner(System.in);
        int idMod;
        System.out.println("Ingrese el ID de la reserva que quiere modificar");
        System.out.print(":");
        idMod = read.nextInt();
        reservas.forEach((rsrvs) -> {
            if (idMod == rsrvs.id_Reservacion) {
                rsrvs.diasReservacion = read.nextInt();
//                Date date = new Date();
//                date = new Date(read.nextLine());
//                rsrvs.fechaReservacion = date;
                rsrvs.cancelado = read.nextBoolean();
                ///rsrvs.habitacion = ???????
            }

        });
    }

    public void mostrarReserva() {
        reservas.forEach((rsrvs) -> {
            System.out.println(rsrvs.toString());
            
        });
    }
}
