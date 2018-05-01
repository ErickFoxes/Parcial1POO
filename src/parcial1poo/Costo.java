package parcial1poo;

/**
 *
 * @author kaztro
 */
public class Costo {
    public float precioBaseH;
    public float costoExtraH;
    public float costoExtraP;

    public Costo(float precioBaseH, float costoExtraH, float costoExtraP) {
        this.precioBaseH = precioBaseH;
        this.costoExtraH = costoExtraH;
        this.costoExtraP = costoExtraP;
    }

    public float getPrecioBaseH() {
        return precioBaseH;
    }

    public void setPrecioBaseH(float precioBaseH) {
        this.precioBaseH = precioBaseH;
    }

    public float getCostoExtraH() {
        return costoExtraH;
    }

    public void setCostoExtraH(float costoExtraH) {
        this.costoExtraH = costoExtraH;
    }

    public float getCostoExtraP() {
        return costoExtraP;
    }

    public void setCostoExtraP(float costoExtraP) {
        this.costoExtraP = costoExtraP;
    }

   
}
