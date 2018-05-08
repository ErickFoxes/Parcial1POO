package parcial1poo;

/**
 *
 * @author Erick
 */
public class Reservacion {
    int id_Reservacion, diasReservacion;
    Fecha fechaReservacion;
    boolean cancelado = false;
    String habitacion;
    Cliente cliente;
    double costo;
    
    public Reservacion(){}
    
    public Reservacion(int id_Reservacion,Fecha fechaReservacion, int diasReservacion, boolean cancelado, String habitacion,double costo){
        this.id_Reservacion = id_Reservacion;
        this.fechaReservacion = fechaReservacion;
        this.diasReservacion = diasReservacion;
        this.cancelado = cancelado;
        this.habitacion = habitacion;
        this.costo = costo;
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
        return "**Reservacion** \n"+">>El id es: "+id_Reservacion+" \n>>Cantidad de dias: "+diasReservacion+"\n>>Fecha reservacion: "+fechaReservacion+"\n>>Cliente: \n"+cliente
                +"\n>>Estado:"+ vigente()+"\nCosto total:"+costo;

    }
}
