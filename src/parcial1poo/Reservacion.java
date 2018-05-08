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
    
    public String vigente(){
        if(cancelado==false){
            return "Esta vigente";
        }
        else{
            return "Esta cancelada";
        }
    }
    
    @Override
    public String toString() {
        return ">>El id es: "+id_Reservacion+" \n>>Cantidad de dias: "+diasReservacion+"\n>>Fecha reservacion: "+fechaReservacion+"\n>>Cliente: \n"+cliente
                +"\n>>Estado:"+ vigente()+"\n";

    }
}
