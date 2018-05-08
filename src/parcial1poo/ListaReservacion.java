package parcial1poo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kaztro
 */
public class ListaReservacion{
    public ArrayList<Reservacion> reservas;

    public ListaReservacion() {
        reservas = new ArrayList<>();
    }

    /**
     * Se utiliza para agregar reservaciones a la lista
     */
    public void agregarReserva() {           
        int dias;
        Reservacion reservacion = new Reservacion();
        reservas.add(reservacion);
        Scanner read = new Scanner(System.in);
        

        System.out.println("¿Ingrese el ID");
        System.out.print(": ");
        reservacion.id_Reservacion = read.nextInt();

        while(true){
        System.out.println("¿Cuantos dias se hospedara?");
        System.out.print(": ");    
        dias = read.nextInt();
            if(dias <= 7){
                reservacion.diasReservacion = dias;
                break;
            }
            else{
                System.out.println("No se puede resevar mas de 7 dias");
            }
        }

        System.out.println("Ingrese fecha de reservacion (dd/MM/aaa)");
        System.out.print(": ");
        int dia, mes, annio;
        System.out.println("Ingresa el dia");
        System.out.print(": ");
        dia = read.nextInt();
        System.out.println("Ingresa el mes");
        System.out.print(": ");
        mes = read.nextInt();
        System.out.println("Ingresa el annio");
        System.out.print(": ");
        annio = read.nextInt(); 
        Fecha f;
        f = new Fecha(dia, mes, annio);
        reservacion.fechaReservacion = f;
        
        System.out.println("Ingrese los datos del cliente: ");
        String nombre, apellido, dui, telefono;
        int tarjetaCred;
        System.out.println("Ingrese el nombre del cliente: ");
        nombre = read.next();
        System.out.println("Ingrese el apellido del cliente: ");
        apellido = read.next();
        System.out.println("Ingrese el dui del cliente: ");
        dui = read.next();
        System.out.println("Ingrese el telefono del cliente: ");
        telefono = read.next();
        System.out.println("Ingrese la tarjeta de credito del cliente: ");
        tarjetaCred = read.nextInt();
        Cliente c;
        c = new Cliente(nombre, apellido, dui, telefono, tarjetaCred);
        reservacion.cliente = c;
        
        reservacion.cancelado = false;
        
        System.out.println("¿En que habitacion se hospedara?: ");
        reservacion.habitacion = read.next();
        
        
        Habitaciones habi = new Habitaciones();
        reservacion.costo = 0;
        
        
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
    
    public void modificarReserva(){
        Scanner read = new Scanner(System.in);
        int idMod;
        System.out.println("Ingrese el ID de la reserva que quiere modificar");
        System.out.print(":");
        idMod = read.nextInt();
        reservas.forEach((rsrvs) -> {
            if (idMod == rsrvs.id_Reservacion) {
        
                Scanner s = new Scanner(System.in);

                System.out.println("Ingrese la opcion de lo que desea modificar: ");
                System.out.println("1. Cantidad de dias de reservacion");
                System.out.println("2. Fecha");
                System.out.println("3. Cliente");
                System.out.println("4. Estado");

                int i = s.nextInt();

                String resp;
                Scanner M = new Scanner(System.in);
                switch (i){
                    case 1:
                        Scanner j = new Scanner(System.in);
                        while(true){
                            int dias;
                            System.out.println("Modificar cantidad de dias reservacion: ");
                            System.out.print(": ");    
                            dias = j.nextInt();
                                if(dias <= 7){
                                    rsrvs.diasReservacion = dias;
                                    break;
                                }
                                else{
                                    System.out.println("No se puede resevar mas de 7 dias");
                                }
                        } 
                        break;            
                    case 2:
                        System.out.println("Digite la nueva fecha: ");
                        Scanner q = new Scanner(System.in);

                        System.out.println("Ingrese fecha de reservacion (dd/MM/aaa): ");
                        int dia, mes, annio;
                        System.out.println("Ingresa el dia: ");
                        dia = q.nextInt();
                        System.out.println("Ingresa el mes: ");
                        mes = q.nextInt();
                        System.out.println("Ingresa el annio: ");
                        annio = q.nextInt(); 
                        Fecha fecha = new Fecha(dia, mes, annio);
                        rsrvs.fechaReservacion = fecha;
                        break;
                    case 3:
                        Scanner c = new Scanner(System.in);

                        System.out.println("Modifique los datos del cliente: ");
                        String nombre, apellido, dui, telefono;
                        int tarjetaCred;
                        System.out.println("Ingrese el nombre del cliente: ");
                        nombre = c.next();
                        System.out.println("Ingrese el apellido del cliente: ");
                        apellido = c.next();
                        System.out.println("Ingrese el dui del cliente: ");
                        dui = c.next();
                        System.out.println("Ingrese el telefono del cliente: ");
                        telefono = c.next();
                        System.out.println("Ingrese la tarjeta de credito del cliente: ");
                        tarjetaCred = c.nextInt();
                        Cliente client;
                        client = new Cliente(nombre, apellido, dui, telefono, tarjetaCred);
                        rsrvs.cliente = client;
                        break;
                    case 4:
                        boolean cancelado;
                        System.out.println("Modifique el estado (vigente/cancelado)");
                        Scanner e = new Scanner(System.in);
                        resp = e.next();
                        if("vigente".equals(resp)){
                            cancelado = false;
                            rsrvs.cancelado = cancelado;
                        }else if("cancelado".equals(resp)){
                            cancelado = true;
                            rsrvs.cancelado = cancelado;
                        }
                        break;
                    default:
                        System.out.println("Digite una opcion valida (numero entero del 1 al 4)");
                        break;
                }
        
                    }

        });
    }

    public void mostrarReserva(){
               
        reservas.forEach((rsrvs) -> {
            System.out.println(rsrvs.toString());
        });
        System.out.println("\n");
    }
}
