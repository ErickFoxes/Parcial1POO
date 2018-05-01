package parcial1poo;

/**
 *
 * @author Kevin Ariel Vargas Menjivar 00139917
 */
public class Habitacion {

    boolean tipo;
    boolean Disponible = true;
    //Costo costo;
    Piso piso;

    public boolean VerificarEstado(){
        return Disponible;
    }
    
    public boolean ModificarEstado() {
            return !Disponible;
    }

}
