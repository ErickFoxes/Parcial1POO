package parcial1poo;

import java.util.Date;

/**
 *
 * @author Erick
 */
public class Reservacion {
    int id_Reservacion, diasReservacion;
    Date fechaReservacion;
    boolean cancelado = false;
    Habitacion habitacion;
    Cliente cliente;
    
    public Reservacion(){}
    
    public Reservacion(int id_Reservacion,Date fechaReservacion, int diasReservacion, boolean cancelado, Habitacion habitacion){
        this.id_Reservacion = id_Reservacion;
        this.fechaReservacion = fechaReservacion;
        this.diasReservacion = diasReservacion;
        this.cancelado = cancelado;
        this.habitacion = habitacion;
        
    }
    
    @Override
    public String toString() {
        return "El id es: "+id_Reservacion+" \nCantidad de dias: "+diasReservacion+ "\nEstado:"+cancelado;
    }
}
