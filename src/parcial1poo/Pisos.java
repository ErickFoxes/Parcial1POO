/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1poo;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
    
    public void addQuemados(){
        add("A", new Piso("A",false,true));
        add("B", new Piso("B",false,true));
        add("C", new Piso("C",false,true));
        add("D", new Piso("D",false,true));
        add("E", new Piso("E",false,true));
        add("F", new Piso("F",false,true));
        
        
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
            Imprimir = "**Piso**\n"+"Letra del piso: "+h.getLetraPiso()+"\nCosto: "+mCosto+"\nDisponibilidad: "+dispo;
            System.out.println(Imprimir);
        });
    }
    public String verificar(String clave){
        Pisos pisoss = new Pisos();
        String pisos2;
        Scanner s = new Scanner(System.in);
        Iterator<Piso> nom = pisos.values().iterator();
        int i=0;
        while(nom.hasNext()){
            Piso e= nom.next();
            if(clave.equals(e.getLetraPiso())){
                i=i+1;
            }
        }
        if(i==0){
            System.out.println("No hay pisos con esa letra");
            System.out.println("Ingrese nuevamente:");
            String pi =s.next();
            pisos2 = verificar(pi);
        }else{
            pisos2=clave;
        }
            return pisos2;
        
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
