package parcial1poo;

/**
 *
 * @author Kevin Ariel Vargas Menjivar 00139917
 */
public class Habitacion {

    boolean tipo;
    boolean Disponible = true;
    Costo costo;
    Piso piso;
    
    public void Habitaciones(boolean tipo, boolean Disponible, Costo costo, Piso piso){
        this.tipo = tipo;
        this.Disponible = Disponible;
        this.costo = costo;
        this.piso = piso;
    
    }

    public boolean VerificarEstado(){
        return Disponible;
    }
    
    public boolean ModificarEstado() {
            return !Disponible;
    }
    
    
}
