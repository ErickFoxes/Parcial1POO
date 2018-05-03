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
    String nombre;
    String apellido;
    int dui;
    Costo totalPago;
    int telefono;
    private int tarjetaCred;
    Paquete paquete;
    
    public Cliente(){}

    public Cliente(String nombre, String apellido, int dui, Costo totalPago, int telefono, int tarjetaCred, Paquete paquete) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dui = dui;
        this.totalPago = totalPago;
        this.telefono = telefono;
        this.tarjetaCred = tarjetaCred;
        this.paquete = paquete;
    }

    public int getTarjetaCred() {
        return tarjetaCred;
    }

    public void setTarjetaCred(int tarjetaCred) {
        this.tarjetaCred = tarjetaCred;
    }
    
}