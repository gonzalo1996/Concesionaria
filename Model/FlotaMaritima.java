package Model;

import Utils.Fecha;

import java.io.Serializable;

public class FlotaMaritima extends Vehiculo implements Serializable {

    private float anchoProa;
    private boolean Vela;
    private float largobuque;

    public FlotaMaritima(Boolean vendido, Fecha fecha_adquisicion, double valor_adquisicion, double gasto, double valor_estimado_venta, String marca, String modelo, Persona duenio_anterior, Persona duenio_nuevo, float anchoProa, boolean vela, float largobuque) {
        super(vendido, fecha_adquisicion, valor_adquisicion, gasto, valor_estimado_venta, marca, modelo, duenio_anterior, duenio_nuevo);
        this.anchoProa = anchoProa;
        Vela = vela;
        this.largobuque = largobuque;
    }

    public float getAnchoProa() {
        return anchoProa;
    }

    public void setAnchoProa(float anchoProa) {
        this.anchoProa = anchoProa;
    }

    public boolean isVela() {
        return Vela;
    }

    public void setVela(boolean vela) {
        Vela = vela;
    }

    public float getLargobuque() {
        return largobuque;
    }

    public void setLargobuque(float largobuque) {
        this.largobuque = largobuque;
    }
}
