/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1poo;

import java.util.ArrayList;
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
        int i = s.nextInt();
        
        switch (i){
            case 1:
                System.out.println("Digite la neva letra del piso :");
                Scanner j = new Scanner(System.in);
                String le = j.next();
                p.setLetraPiso(le);
                break;            
            case 2:
                System.out.println("Digite el nuevo campo:");
                Scanner q = new Scanner(System.in);
                boolean MY = q.nextBoolean();
                p.setMayorCosto(MY);
                break;
            case 3:
                System.out.println("Digite el nuevo numero de habitaciones:");
                Scanner k = new Scanner(System.in);
                int ff = k.nextInt();
                p.setHabitaciones(ff);
                break;
            case 4:
                System.out.println("Digite el nuevo campo:");
                Scanner o = new Scanner(System.in);
                 boolean D = o.nextBoolean();
                p.setDisponible(D);
                break;
            default:
                System.out.println("Digite un numero correcto");
        }
    }
    
}
