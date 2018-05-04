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
        System.out.println("13. Salir");
    }

    public void menu() {
        int x = 0;
        Scanner M = new Scanner(System.in);
        ListaReservacion lista = new ListaReservacion();
        ListaPaquetes paquete = new ListaPaquetes();
        ListaClientes cliente = new ListaClientes();
        Piso piso = new Piso();
        Habitacion hab = new Habitacion();
        while (x != 13) {
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
                        piso.VerificarEstado();
                        break;
                    case 8:
                        hab.VerificarEstado();
                        break;
                    case 9:
                        piso.ModificarEstado();
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
