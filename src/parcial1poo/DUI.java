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
public class DUI {
    private int dui;
    private int verificador;
    
    public DUI(){}

    public DUI(int dui, int verificador) {
        this.dui = dui;
        this.verificador = verificador;
    }

    public int getDui() {
        return dui;
    }

    public void setDui(int dui) {
        this.dui = dui;
    }

    public int getVerificador() {
        return verificador;
    }

    public void setVerificador(int verificador) {
        this.verificador = verificador;
    }
     
}
