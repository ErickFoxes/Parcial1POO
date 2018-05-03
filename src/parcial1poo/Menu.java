package parcial1poo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author kevin ariel vargas menjivar 00139917
 */
public class Menu {

    private static Menu menu ;

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
        System.out.println("1. Ingresar Reservación");
        System.out.println("2. Mostrar Reservaciones (por semana)");
        System.out.println("3. Modificar Reservación (cantidad de dias, fecha y estado)");
        System.out.println("4. Mantenimiento Piso");
        System.out.println("5. Mantenimiento Habitacion");
        System.out.println("6. Modificar Precios de Habitaciónes");
        System.out.println("7. Agregar paquete");
        System.out.println("8. Mostrar paquetes");
        System.out.println("9. Modificar paquetes");
        System.out.println("10. Salir");
    }

    public void menu() {
        int x;
        Scanner M = new Scanner(System.in);
        ListaReservacion lista = new ListaReservacion();
        ListaPaquetes listaP = new ListaPaquetes();
        escoger();
        try{
            x = M.nextInt();

            switch (x) {
                case 1:
                    lista.agregarReserva();
                    break;
                case 2:
                    lista.mostrarReserva();
                    break;
                case 3:
                    lista.modificarReserva();
                    break;
                case 4:
                    System.out.println("Mantenimiento de piso/s");
                    break;
                case 5:
                    System.out.println("Mantenimiento de habitacion/es");
                    break;
                case 6:
                    System.out.println("Modificando precios de habitaciones");
                    break;
                case 7:
                    listaP.AgregarPaquete();
                    break;
                case 8:
                    listaP.MostrarPaquete();
                    break;
                case 9:
                    listaP.ModificarPaquete();
                    break;
         
                    
                default:
                    System.out.println("Ingresa una opcion entre 1 y 9 por favor...");
            }
        }catch (InputMismatchException E) {
            System.err.println("Debes ingresar un # entero");
            M.nextLine();
     }
     
  }
}
