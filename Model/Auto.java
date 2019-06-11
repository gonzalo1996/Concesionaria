package Model;

import Utils.Fecha;

import java.io.Serializable;

public class Auto extends Vehiculo implements Serializable {

    public Auto(Boolean vendido, Fecha fecha_adquisicion, double valor_adquisicion, double gasto, double valor_estimado_venta, String marca, String modelo, Persona duenio_anterior, Persona duenio_nuevo) {
        super(vendido, fecha_adquisicion, valor_adquisicion, gasto, valor_estimado_venta, marca, modelo, duenio_anterior, duenio_nuevo);
    }
}
