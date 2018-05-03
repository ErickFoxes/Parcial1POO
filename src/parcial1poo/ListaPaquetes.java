/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        
    
    // 
    public void MostrarPaquete(){
               
        paquetes.forEach((paquetee) -> {
            System.out.println(paquetee.toString());
        });
    }
    
    
}
