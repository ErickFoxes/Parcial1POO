/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1poo;

/**
 *
 * @author elsyc
 */
public class Cliente {
    private DUI dui;
    private Reservacion reservacion;
    private Costo totalPago;
    private int telefono;
    private int tarjetaCred;
    private Paquete paquete;
    
    public Cliente(){}

    public Cliente(DUI dui, Reservacion reservacion, Costo totalPago, int telefono, int tarjetaCred, Paquete paquete) {
        this.dui = dui;
        this.reservacion = reservacion;
        this.totalPago = totalPago;
        this.telefono = telefono;
        this.tarjetaCred = tarjetaCred;
        this.paquete = paquete;
    }

    public DUI getDui() {
        return dui;
    }

    public void setDui(DUI dui) {
        this.dui = dui;
    }

    public Reservacion getReservacion() {
        return reservacion;
    }

    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }

    public Costo getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(Costo totalPago) {
        this.totalPago = totalPago;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTarjetaCred() {
        return tarjetaCred;
    }

    public void setTarjetaCred(int tarjetaCred) {
        this.tarjetaCred = tarjetaCred;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }
    
}
