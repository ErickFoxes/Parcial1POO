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
        if("S".equals(respuesta)){
            paquete.buffet = true;
        }
        
        System.out.println("Piscina Ilimitada:");
        respuesta = read.nextLine();
        if("S".equals(respuesta)){
            paquete.piscinaI = true;
        }
        
        System.out.println("Piscina:");
        respuesta = read.nextLine();
        if("S".equals(respuesta)){
            paquete.piscina = true;
        }
        
        System.out.println("Servicio a la habitación:");
        respuesta = read.nextLine();
        if("S".equals(respuesta)){
            paquete.servicioH = true;
        }
        
        System.out.println("Minibar Ilimitado:");
        respuesta = read.nextLine();
        if("S".equals(respuesta)){
            paquete.minibar = true;
        }
        
        System.out.println("Internet:");
        respuesta = read.nextLine();
        if("S".equals(respuesta)){
            paquete.internet = true;
        }
        
        System.out.println("Ingrese el valor extra que tendrá el paquete: ");
        paquete.costoExtra = read.nextFloat();
        
    
    }
    
//    //paquetes
//        
//        //Paquete Premium
//        Paquete paquetePremium = new Paquete();
//        paquetePremium.buffet = true;
//        paquetePremium.piscinaI = true;
//        paquetePremium.servicioH = true;
//        paquetePremium.minibar = true;
//        paquetePremium.internet = true;
//        paquetePremium.costoExtra = 150;
//       
//        //Paquete Basico
//        Paquete paqueteBasico = new Paquete();
//        paqueteBasico.piscina = true;
//        paqueteBasico.internet = true;
//        paqueteBasico.costoExtra = 10;
//        
//        //paquetes
    
}
