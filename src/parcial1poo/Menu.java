package parcial1poo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author kevin ariel vargas menjivar 00139917
 */
public class Menu {

    private static Menu menu;

    private Menu() {
    }

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    public void escoger() {
        System.out.println("- - - MENÚ - - -");
        System.out.println("1. Agregar Paquete");
        System.out.println("2. Mostrar paquetes ingresados");
        System.out.println("3. Modificar Paquetes");
        System.out.println("4. Ingresar Reservación");
        System.out.println("5. Mostrar Reservaciones (por semana)");
        System.out.println("6. Modificar Reservación");
        System.out.println("7. Verificar el estado del Piso");
        System.out.println("8. Verificar el estado de la Habitacion");
        System.out.println("9. Cambiar el estado del Piso");
        System.out.println("10. Cambiar el estado de la Habitacion");
        System.out.println("11. Agregar cliente");
        System.out.println("12. Modificar cliente");
        System.out.println("13. Mostrar clientes");
        System.out.println("14. Agreagar habitaciones");
        System.out.println("15. Mostrar habitaciones");
        System.out.println("16. Salir");
    }

    public void menu() {
        int x = 0;
        Scanner M = new Scanner(System.in);
        ListaReservacion lista = new ListaReservacion();
        ListaPaquetes paquete = new ListaPaquetes();
        ListaClientes cliente = new ListaClientes();
        Habitaciones habitaciones = new Habitaciones();
        Piso piso = new Piso();
        Habitacion hab = new Habitacion();
        while (x != 16) {
            escoger();
            try {
                x = M.nextInt();

                switch (x) {
                    case 1:
                        paquete.AgregarPaquete();
                        break;
                    case 2:
                        paquete.MostrarPaquete();
                        break;
                    case 3:
                        paquete.ModificarPaquete();
                        break;
                    case 4:
                        lista.agregarReserva();
                        break;
                    case 5:
                        lista.mostrarReserva();
                        break;
                    case 6:
                        lista.modificarReserva();
                        break;
                    case 7:
//                        piso.VerificarEstado();
                        break;
                    case 8:
                        hab.VerificarEstado();
                        break;
                    case 9:
//                        piso.ModificarEstado();
                        break;
                    case 10:
                        hab.ModificarEstado();
                        break;
                    case 11:
                        cliente.agregarCliente();
                        break;
                    case 12:
                        cliente.ModificarCliente();
                        break;
                    case 13:
                        cliente.MostrarCliente();
                        break;
                    case 14:
                        String Clave,Piso,id;
                        Boolean doble,cancelado;
                        double costo;
                        int Num;
                                              
                        System.out.println("Tipo de habitacion:");
                        doble = M.nextBoolean();
                        System.out.println("Esta disponible:");
                        cancelado = M.nextBoolean();
                        System.out.println("¿Cual es el piso?:");
                        Piso = M.next();
                        System.out.println("Número de habitacion:");
                        Num = M.nextInt();
                        System.out.println("Costo habitacion:");
                        costo = M.nextDouble();
                        Clave = Piso+Num;
                        habitaciones.add(Clave,new Habitacion(Clave,doble,cancelado,costo,Piso,Num));
                        break;
                    case 15:
                        habitaciones.mostrar();
                        break;
                    case 16:
                        System.out.println("***Fin programa***");
                        break;
                    default:
                        System.out.println("Por favor ingresa un valor valido");      
                }
            } catch (InputMismatchException E){
                System.err.println("Debes ingresar un # entero");
                M.nextLine();
            }
        }
    }
}
