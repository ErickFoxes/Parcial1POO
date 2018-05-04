package parcial1poo;

/**
 *
 * @author elsyc
 */
public class Cliente {
    String nombre;
    String apellido;
    int dui;
    String telefono;
    private int tarjetaCred;
    
    public Cliente(){}

    public Cliente(String nombre, String apellido, int dui, String telefono, int tarjetaCred) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dui = dui;
        this.telefono = telefono;
        this.tarjetaCred = tarjetaCred;
    }

    public int getTarjetaCred() {
        return tarjetaCred;
    }

    public void setTarjetaCred(int tarjetaCred) {
        this.tarjetaCred = tarjetaCred;
    }
    
}