package parcial1poo;

/**
 *
 * @author elsyc
 */
public class Cliente {
    String nombre;
    String apellido;
    String dui;
    String telefono;
    int tarjetaCred;
    
    public Cliente(){}

    public Cliente(String nombre, String apellido, String dui, String telefono, int tarjetaCred) {
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
    
    @Override
    public String toString() {
        
        return "El nombre del cliente: "+nombre+"\nEl apellido es: "+apellido+ "\nEl DUI es: "+dui+"\nEl telefono es: "+telefono+"\nTarjeta de credito: "+tarjetaCred;
    }
    
}