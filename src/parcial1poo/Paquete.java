/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1poo;

/**
 *
 * @author uca
 */
public class Paquete {
    //agregar
    boolean buffet = false;
    boolean piscinaI = false;
    boolean piscina = false;
    boolean servicioH = false;
    boolean minibar = false;
    boolean internet = false;
    float costoExtra;
    
    public Paquete (){ }
    
    public Paquete(boolean buffet, boolean piscinaI, boolean piscina, boolean servicioH, boolean minibar, boolean internet, float costoExtra){
        this.buffet = buffet;
        this.piscinaI = piscinaI;
        this.piscina = piscina;
        this.servicioH = servicioH;
        this.minibar = minibar;
        this.internet = internet;
        this.costoExtra = costoExtra;        
    }

}
