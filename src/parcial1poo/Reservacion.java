package parcial1poo;

import java.util.Date;

/**
 *
 * @author Erick
 */
public class Reservacion {
    int id_Reservacion, diasReservacion;
    Date fechaReservacion;
    boolean cancelado;
    Habitacion habitacion;
    
    public Reservacion(){}
    
    public Reservacion(int id_Reservacion,Date fechaReservacion, int diasReservacion, boolean cancelado, Habitacion habitacion){
        this.id_Reservacion = id_Reservacion;
        this.fechaReservacion = fechaReservacion;
        this.diasReservacion = diasReservacion;
        this.cancelado = cancelado;
        this.habitacion = habitacion;
        
    }

    public int getId_Reservacion() {
        return id_Reservacion;
    }

    public int getDiasReservacion() {
        return diasReservacion;
    }

    public Date getFechaReservacion() {
        return fechaReservacion;
    }

    public boolean getCancelado() {
        return cancelado;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }
    

    public void setId_Reservacion(int id_Reservacion) {
        this.id_Reservacion = id_Reservacion;
    }

    public void setDiasReservacion(int diasReservacion) {
        this.diasReservacion = diasReservacion;
    }

    public void setFechaReservacion(Date fechaReservacion) {
        this.fechaReservacion = fechaReservacion;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
}
