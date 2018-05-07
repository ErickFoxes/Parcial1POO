package parcial1poo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kevin Ariel Vargas Menjivar 00139917
 */

public class Piso {

    
    private String letraPiso;
    private boolean mayorCosto;
    private int habitaciones;
    private boolean Disponible;
    private ArrayList habitacion;
    
    public Piso(){}
    
    public Piso(String letraPiso, boolean mayorCosto, boolean Disponible, ArrayList habitacion){
        this.letraPiso = letraPiso;
        this.mayorCosto = mayorCosto;
        this.Disponible = Disponible;
    }
    
    public boolean VerificarEstado(){
        return Disponible;
    }
    
    public boolean ModificarEstado() {
            return !Disponible;
    }  

    public String getLetraPiso() {
        return letraPiso;
    }

    public void setLetraPiso(String letraPiso) {
        this.letraPiso = letraPiso;
    }

    public boolean isMayorCosto() {
        return mayorCosto;
    }

    public void setMayorCosto(boolean mayorCosto) {
        this.mayorCosto = mayorCosto;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public boolean isDisponible() {
        return Disponible;
    }

    public void setDisponible(boolean Disponible) {
        this.Disponible = Disponible;
    }

    public ArrayList getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(ArrayList habitacion) {
        this.habitacion = habitacion;
    }
    
    
}