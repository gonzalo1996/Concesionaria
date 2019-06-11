package Model;

import Utils.Fecha;

import java.io.Serializable;

public class Avion extends Vehiculo implements Serializable {

    private String anchoAlas;
    private int cantidad_volante;

    public Avion(Boolean vendido, Fecha fecha_adquisicion, double valor_adquisicion, double gasto, double valor_estimado_venta, String marca, String modelo, Persona duenio_anterior, Persona duenio_nuevo, String anchoAlas, int cantidad_volante) {
        super(vendido, fecha_adquisicion, valor_adquisicion, gasto, valor_estimado_venta, marca, modelo, duenio_anterior, duenio_nuevo);
        this.anchoAlas = anchoAlas;
        this.cantidad_volante = cantidad_volante;
    }

    public String getAnchoAlas() {
        return anchoAlas;
    }

    public void setAnchoAlas(String anchoAlas) {
        this.anchoAlas = anchoAlas;
    }

    public int getCantidad_volante() {
        return cantidad_volante;
    }

    public void setCantidad_volante(int cantidad_volante) {
        this.cantidad_volante = cantidad_volante;
    }
}
