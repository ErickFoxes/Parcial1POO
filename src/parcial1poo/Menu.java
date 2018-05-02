package parcial1poo;


/**
 *
 * @author kevin ariel vargas menjivar 00139917
 */
public class Menu {

    public void menu(int y) {
        int x = 0;

        while (x != 9) {
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
    }
}
