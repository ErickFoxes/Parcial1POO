/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1poo;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author kevit
 */
public class Pisos {
     Map<String,Piso> pisos;

    public Pisos(){
    pisos = new HashMap<>();
    }
    
    public void add(String clave, Piso piso) {
        pisos.put(clave, piso);
    }
   
    public void mostrar(){
               
        
        pisos.values().forEach((h) -> {
            String Imprimir,mCosto,dispo;
            
            if(h.isMayorCosto()==true){
                mCosto = "Mayor";
            }else{
                mCosto = "Normal";
            }
            
            if(h.isDisponible()==true){
                dispo = "Disponible";
            }else{
                dispo = "No Disponible";
            }
            Imprimir = "Letra del piso: "+h.getLetraPiso()+"\nCosto: "+mCosto+"\nDisponibilidad: "+dispo;
            System.out.println(Imprimir);
        });
    }
    
    public void modificar(String clave) {
        Piso p = pisos.get(clave);
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese la opcion de lo que desea modificar: ");
        System.out.println("1. Mayor costo");
        System.out.println("2. Disponibilidad");
        
        int i = s.nextInt();
        
        switch (i){          
            case 1:
                System.out.println("Digite si tiene mayor costo o no:");
                Scanner q = new Scanner(System.in);
                boolean MY = q.nextBoolean();
                p.setMayorCosto(MY);
                break;
            case 2:
                System.out.println("Digite si esta disponible o no:");
                Scanner o = new Scanner(System.in);
                 boolean D = o.nextBoolean();
                p.setDisponible(D);
                break;
            default:
                System.out.println("Digite un numero correcto");
        }
    }
    
}
