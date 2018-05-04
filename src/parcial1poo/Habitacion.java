package parcial1poo;

import java.util.ArrayList;

/**
 *
 * @author Kevin Ariel Vargas Menjivar 00139917
 */
public class Habitacion {
    private boolean tipo;
    private boolean Disponible = true;
    private double costo;
    private String piso,idHabitacion;
    private int numHb;
    
    public Habitacion(){
    }
    
    public Habitacion(String idHabitacion,boolean tipo, boolean Disponible, double costo, String piso, int numHb){
        this.tipo = tipo;
        this.Disponible = Disponible;
        this.costo = costo;
        this.piso = piso;
        this.idHabitacion = idHabitacion;
        this.numHb = numHb;
    } 

    public String getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(String idHabitacion) {
        this.idHabitacion = idHabitacion;
    }
    
    public boolean VerificarEstado(){
        return Disponible;
    }
    
    public boolean ModificarEstado() {
            return !Disponible;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponible() {
        return Disponible;
    }

    public void setDisponible(boolean Disponible) {
        this.Disponible = Disponible;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public int getNumHb() {
        return numHb;
    }

    public void setNumHb(int numHb) {
        this.numHb = numHb;
    }
    
    
    
}
