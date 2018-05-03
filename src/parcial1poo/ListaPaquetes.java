package parcial1poo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class ListaPaquetes {
    public ArrayList <Paquete> paquetes;
    String respuesta;
    public ListaPaquetes(){
        paquetes = new ArrayList<>();
               
    }
    
    public void AgregarPaquete(){
        Paquete paquete = new Paquete();
        paquetes.add(paquete);
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese un nombre para el nuevo paquete:");
        paquete.nombre = read.nextLine();
        
        System.out.println("Coloque S para 'Si' o N para 'No'\nEl paquete "+paquete.nombre+" Tendrá: ");
        
        System.out.println("Buffet:");
        respuesta = read.nextLine();
        if("s".equals(respuesta)){
            paquete.buffet = true;
        }
        
        System.out.println("Piscina Ilimitada:");
        respuesta = read.nextLine();
        if("s".equals(respuesta)){
            paquete.piscinaI = true;
        }
        
        System.out.println("Piscina:");
        respuesta = read.nextLine();
        if("s".equals(respuesta)){
            paquete.piscina = true;
        }
        
        System.out.println("Servicio a la habitación:");
        respuesta = read.nextLine();
        if("s".equals(respuesta)){
            paquete.servicioH = true;
        }
        
        System.out.println("Minibar Ilimitado:");
        respuesta = read.nextLine();
        if("s".equals(respuesta)){
            paquete.minibar = true;
        }
        
        System.out.println("Internet:");
        respuesta = read.nextLine();
        if("s".equals(respuesta)){
            paquete.internet = true;
        }
        
        System.out.println("Ingrese el valor extra que tendrá el paquete: ");
        paquete.costoExtra = read.nextFloat();
        
    }
    
    
    public void AgregarPaquete(Paquete paquete) throws Exception{
        if(paquete != null){
            if(!paquetes.contains(paquete)){
                paquetes.add(paquete);
            }else{
                Exception e = new Exception("Los datos ya pertenecen a otro paquete");
                throw e;
            }
            
        }else{
            throw new Exception("El paquete no puede quedar vacío");
        }
    }
        
    
    public void MostrarPaquete(){
               
        paquetes.forEach((paquetee) -> {
            System.out.println(paquetee.toString());
        });
    }
    
    public void ModificarPaquete(){
        Scanner read = new Scanner(System.in);
        String nombrePaquete;
        System.out.println("¿Cúal paquete desea modificar?");
        nombrePaquete = read.nextLine();
        paquetes.forEach((paquetee) -> {
            if (nombrePaquete.equals(paquetee.nombre)){
                System.out.println("Coloque S para 'Si' o N para 'No'\nEl paquete "+paquetee.nombre+" Tendrá: ");
                System.out.println("Buffet:");
                respuesta = read.nextLine();
                if("s".equals(respuesta)){
                    paquetee.buffet = true;
                }else if("n".equals(respuesta)){
                    paquetee.buffet = false;
                }
                System.out.println("Piscina Ilimitada:");
                respuesta = read.nextLine();
                if("s".equals(respuesta)){
                    paquetee.piscinaI = true;
                }else if("n".equals(respuesta)){
                    paquetee.piscinaI = false;
                }

                System.out.println("Piscina:");
                respuesta = read.nextLine();
                if("s".equals(respuesta)){
                    paquetee.piscina = true;
                }else if("n".equals(respuesta)){
                    paquetee.piscina = false;
                }

                System.out.println("Servicio a la habitación:");
                respuesta = read.nextLine();
                if("s".equals(respuesta)){
                    paquetee.servicioH = true;
                }else if("n".equals(respuesta)){
                    paquetee.servicioH = false;
                }

                System.out.println("Minibar Ilimitado:");
                respuesta = read.nextLine();
                if("s".equals(respuesta)){
                    paquetee.minibar = true;
                }else if("n".equals(respuesta)){
                    paquetee.minibar = false;
                }

                System.out.println("Internet:");
                respuesta = read.nextLine();
                if("s".equals(respuesta)){
                    paquetee.internet = true;
                }else if("n".equals(respuesta)){
                    paquetee.internet = false;
                }

                System.out.println("Ingrese el valor extra que tendrá el paquete: ");
                paquetee.costoExtra = read.nextFloat();
                
                
            }
        });
    }
    
    
}
