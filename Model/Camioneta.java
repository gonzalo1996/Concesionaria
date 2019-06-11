package Model;

import Utils.Fecha;

import java.io.Serializable;

public class Camioneta extends Vehiculo implements Serializable {
    private String transmision;

    public Camioneta(Boolean vendido, Fecha fecha_adquisicion, double valor_adquisicion, double gasto, double valor_estimado_venta, String marca, String modelo, Persona duenio_anterior, Persona duenio_nuevo, String transmision) {
        super(vendido, fecha_adquisicion, valor_adquisicion, gasto, valor_estimado_venta, marca, modelo, duenio_anterior, duenio_nuevo);
        this.transmision = transmision;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmicion(String transmicion) {
        transmision = transmicion;
    }
}
