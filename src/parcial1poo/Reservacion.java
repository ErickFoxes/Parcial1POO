package parcial1poo;

/**
 *
 * @author Erick
 */
public class Reservacion {
    int id_Reservacion, diasReservacion;
    Fecha fechaReservacion;
    boolean cancelado = false;
    Habitacion habitacion;
    Cliente cliente;
    
    public Reservacion(){}
    
    public Reservacion(int id_Reservacion,Fecha fechaReservacion, int diasReservacion, boolean cancelado, Habitacion habitacion){
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

    public Fecha getFechaReservacion() {
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

    public void setFechaReservacion(Fecha fechaReservacion) {
        this.fechaReservacion = fechaReservacion;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
}
