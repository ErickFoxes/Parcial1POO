/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1poo;

/**
 * *
 * @author Erick
 */
public class Paquete {
    //agregar
    String nombre;
    boolean buffet = false;
    boolean piscinaI = false;
    boolean piscina = false;
    boolean servicioH = false;
    boolean minibar = false;
    boolean internet = false;
    float costoExtra;
    
    public Paquete (){ }
    
    public Paquete(String nombre,boolean buffet, boolean piscinaI, boolean piscina, boolean servicioH, boolean minibar, boolean internet, float costoExtra){
        this.nombre = nombre;
        this.buffet = buffet;
        this.piscinaI = piscinaI;
        this.piscina = piscina;
        this.servicioH = servicioH;
        this.minibar = minibar;
        this.internet = internet;
        this.costoExtra = costoExtra;        
    }
    
    @Override
    public String toString() {
        
        return "El paquete "+nombre+" contiene:\nBuffet: "+buffet+ "\nPiscina Ilimitada: "+piscinaI+"\nPiscina: "+ piscina+"\nServicio a la habitación: "+servicioH+"\nminibar: "+minibar+"\ninternet: "+internet+"\ncosto Extra: $"+costoExtra;
    }

}
