package parcial1poo;

/**
 *
 * @author Kevin Ariel Vargas Menjivar 00139917
 */

public class Piso {
    
    char letraPiso;
    boolean mayorCosto;
    int habitaciones;
    boolean Disponible;
    
    public void Piso(char letraPiso, boolean mayorCosto, int habitaciones, boolean Disponible){
        this.letraPiso = letraPiso;
        this.mayorCosto = mayorCosto;
        this.habitaciones = habitaciones;
        this.Disponible = Disponible;
    }
    
}
