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
    boolean buffet, piscinaI, piscina,servicioH,minibar,internet;
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

    public boolean getBuffet() {
        return buffet;
    }

    public boolean getPiscinaI() {
        return piscinaI;
    }

    public boolean getPiscina() {
        return piscina;
    }

    public boolean getServicioH() {
        return servicioH;
    }

    public boolean getMinibar() {
        return minibar;
    }

    public boolean getInternet() {
        return internet;
    }

    public float getCostoExtra() {
        return costoExtra;
    }

    public void setBuffet(boolean buffet) {
        this.buffet = buffet;
    }

    public void setPiscinaI(boolean piscinaI) {
        this.piscinaI = piscinaI;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public void setServicioH(boolean servicioH) {
        this.servicioH = servicioH;
    }

    public void setMinibar(boolean minibar) {
        this.minibar = minibar;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public void setCostoExtra(float costoExtra) {
        this.costoExtra = costoExtra;
    }
}
