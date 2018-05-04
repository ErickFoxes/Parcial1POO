package parcial1poo;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author elsyc
 */
public class ListaClientes {
    public ArrayList<Cliente> clientes;
    String dato;
    String res;
    
    public ListaClientes(){
        clientes = new ArrayList<>();
    }
    
    public void agregarCliente(){
        Cliente cliente = new Cliente();
        clientes.add(cliente);
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del cliente: ");
        cliente.nombre = leer.nextLine();
        
        System.out.println("Ingrese el apellido del cliente: ");
        cliente.apellido = leer.nextLine();
        
        System.out.println("Ingrese el numero de DUI del cliente: ");
        cliente.dui = leer.nextInt();
        
        System.out.println("Ingresar el numero de telefono del cliente: ");
        cliente.telefono = leer.nextLine();
        
        System.out.println("Ingresar el numero de tarjeta de credito: ");
        cliente.setTarjetaCred(leer.nextInt());
        
    }
    
    public void agregarCliente(Cliente cliente) throws Exception {
        if (cliente != null) {
            if (!clientes.contains(cliente)) {
                clientes.add(cliente);
            }else{
            Exception except = new Exception("Los datos ya pertenecen a otro cliente");
            throw except;
            }
            
        } else {
            throw new Exception("No puede dejar vacio al cliente");
        }

    }
    
    public void MostrarCliente(){
               
        clientes.forEach((clientee) -> {
            System.out.println(clientee.toString());
        });
    }
    
    public void ModificarCliente(){
        Scanner leer = new Scanner(System.in);
        int IDcliente;
        System.out.println("Ingresar el dui del cliente que quiere modificar: ");
        IDcliente = leer.nextInt();
        
        clientes.forEach((clientee) -> {
            if(IDcliente == clientee.dui){
                System.out.println("Nuevo nombre: ");
                clientee.nombre = leer.nextLine();
                
                System.out.println("Nuevo apellido: ");
                clientee.apellido = leer.nextLine();

                System.out.println("Nuevo telefono: ");
                clientee.telefono = leer.nextLine();

                System.out.println("Nuevo tarjeta: ");
                clientee.setTarjetaCred(leer.nextInt());

            }
        });
                
    }
    
}
