package parcial1poo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *u
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
        System.out.println("7. Agregar cliente");
        System.out.println("8. Modificar cliente");
        System.out.println("9. Mostrar clientes");
        System.out.println("10. Agreagar habitaciones");
        System.out.println("11. Mostrar habitaciones");
        System.out.println("12. Modificar habitaciones");
        System.out.println("13. Agregar piso");
        System.out.println("14. Mostrar piso");
        System.out.println("15. Modificar piso");
        System.out.println("16. Salir");
        System.out.println("Ingrese la opcion que desea ejecutar: ");
    }

    public void menu() {
        int x = 0;
        Scanner M = new Scanner(System.in);
        ListaReservacion lista = new ListaReservacion();
        ListaPaquetes paquete = new ListaPaquetes();
        ListaClientes cliente = new ListaClientes();
        Habitaciones habitaciones = new Habitaciones();
        Pisos pisos = new Pisos();
        Piso piso = new Piso();
        Habitacion hab = new Habitacion();
        paquete.AgregarPaqueteQuemado();
        pisos.addQuemados();
        habitaciones.agregarHabitacionesQuemadas();
        
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
                        cliente.agregarCliente();
                        break;
                    case 8:
                        cliente.ModificarCliente();
                        break;
                    case 9:
                        cliente.MostrarCliente();
                        break;
                    case 10:
                        String Clave,Piso,id,resp;
                        boolean doble= true,cancelado=false;
                        double costo;
                        int Num;
                                              
                        System.out.println("Tipo de habitacion (Ingrese 'simple' o 'doble'):");
                        resp = M.next();
                        if("simple".equals(resp)){
                            doble = true;
                        }else if("doble".equals(resp)){
                            doble = false;
                        }
                        
                        System.out.println("Esta disponible (Ingrese 'Disponible' o 'Cancelado'):");
                        resp = M.next();
                        if("disponible".equals(resp)){
                            cancelado = true;
                        }else if("cancelado".equals(resp)){
                            cancelado = false;
                        }
                        
                        System.out.println("¿Cual es el piso?:");
                        Piso = M.next();
                        System.out.println("Número de habitacion:");
                        Num = M.nextInt();
                        System.out.println("Costo habitacion:");
                        costo = M.nextDouble();
                        Clave = Piso+Num;
                        habitaciones.add(Clave,new Habitacion(Clave,doble,cancelado,costo,Piso,Num));
                        break;
                    case 11:
                        habitaciones.mostrar();
                        break;
                    case 12:
                        String id_hab;
                        System.out.println("Ingrese el Id de la habitacion: ");
                        id_hab = M.next();
                        habitaciones.modificar(id_hab);
                        break;
                    case 13:
                        String letraPiso, mCosto,dispo, ClaveP;
                        int numP;
                        boolean mayorCosto =false, disponibilidad=true;
                        
                        System.out.println("Letra del piso:");
                        letraPiso = M.next();
                        
                        System.out.println("¿El piso tiene un mayor costo?(Coloque S para 'Si' o N para 'No'):");
                        mCosto = M.next();
                        if("s".equals(mCosto)){
                            mayorCosto = true;
                        }else if("n".equals(mCosto)){
                            mayorCosto = false;
                        }
                        
                        System.out.println("¿El piso esta disponible?(Coloque S para 'Si' o N para 'No'):");
                        dispo = M.next();
                        if("s".equals(dispo)){
                            disponibilidad = true;
                        }else if("n".equals(dispo)){
                            disponibilidad = false;
                        }
                       
                        pisos.add(letraPiso, new Piso(letraPiso,mayorCosto,disponibilidad));
                        break;
                    case 14:
                        pisos.mostrar();
                        break;
                    case 15:
                        String id_piso;
                        System.out.println("Ingrese la letra del piso a modificar: ");
                        id_piso = M.next();
                        pisos.modificar(id_piso);
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
