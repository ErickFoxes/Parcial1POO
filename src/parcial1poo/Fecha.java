package parcial1poo;

/**
 *
 * @author kaztro
 */
public class Fecha {
    public int dia;
    public int mes;
    public int aneo;

    public Fecha(int dia, int mes, int aneo) {
        this.dia = dia;
        this.mes = mes;
        this.aneo = aneo;
    }
    
    @Override
    public String toString() {
        return "El dia es: "+dia+" \nEl mes es: "+mes+"\nEl annio: "+aneo;
    }
  
}

