package parcial1poo;

import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner read = new Scanner(System.in);

        System.out.println("¿Ingrese el ID");
        System.out.print(": ");
        reservacion.setId_Reservacion(read.nextInt());

        System.out.println("¿Cuantos dias se hospedara?");
        System.out.print(": ");
        reservacion.setDiasReservacion(read.nextInt());

        System.out.println("Ingrese fecha de reservacion (dd/mm/aaa)");
        System.out.print(": ");
        /*fecha.dia = read.nextInt();
        System.out.print("/");
        fecha.mes = read.nextInt();
        System.out.print("/");
        fecha.aneo = read.nextInt();
        */
        //reservacion.setFechaReservacion();
        
        System.out.println("¿Ha cancelado?");
        System.out.print(": ");
        reservacion.setCancelado(read.nextBoolean());
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
        idMod = read.nextInt();
        reservas.forEach((rsrvs) -> {
            if (idMod == rsrvs.id_Reservacion) {
                rsrvs.diasReservacion = read.nextInt();
                //rsrvs.dia = read.nextInt();
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
    /*
    public void cancelarReserva(){
        Scanner read = new Scanner(System.in);
        int idMod;
        System.out.println("Ingrese el ID de la reserva que quiere cancelar");
        idMod = read.nextInt();
        reservas.forEach((rsrvs) -> {
            if (idMod == rsrvs.id_Reservacion) {
                rsrvs.diasReservacion = 0;
                //rsrvs.fechaReservacion = ???????
                rsrvs.cancelado = read.nextBoolean();
                ///rsrvs.habitacion = ???????
                rsrvs.id_Reservacion = 0;
            }
    }
 }*/
}
