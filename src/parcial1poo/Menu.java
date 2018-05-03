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
        System.out.println("1. Ingresar Reservación");
        System.out.println("2. Mostrar Reservaciones (por semana)");
        System.out.println("3. Modificar Reservación");
        System.out.println("4. Cancelar Reservación");
        System.out.println("5. Mantenimiento Piso");
        System.out.println("6. Mantenimiento Habitacion");
        System.out.println("7. Modificar Precios de Habitaciónes");
        System.out.println("8. Modificar paquetes");
        System.out.println("9. Salir");
    }

    public void menu() {
        int x = 0;
        Scanner M = new Scanner(System.in);
        ListaReservacion lista = new ListaReservacion();
        while (x != 9) {
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
                    default:
                        System.out.println("Ingresa una opcion entre 1 y 9 por favor...");
                }
            }catch (InputMismatchException E) {
                System.err.println("Debes ingresar un # entero");
                M.nextLine();
         }
     }
  }
}
