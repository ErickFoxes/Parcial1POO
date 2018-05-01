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
    
    public boolean VerificarEstado(){
        return Disponible;
    }
    
    public boolean ModificarEstado() {
            return !Disponible;
    }  
}
