package Model;

import Utils.Fecha;

import java.io.Serializable;

public class Auto extends Vehiculo implements Serializable {

	private int cantidadPuertas;
	private String motor;
    public Auto(Boolean vendido, Fecha fecha_adquisicion, double valor_adquisicion, double gasto, double valor_estimado_venta, String marca, String modelo, Persona duenio_anterior, Persona duenio_nuevo, int cantidadPuertas, String motor) {
        super(vendido, fecha_adquisicion, valor_adquisicion, gasto, valor_estimado_venta, marca, modelo, duenio_anterior, duenio_nuevo);
        this.cantidadPuertas = cantidadPuertas;
        this.motor = motor;
    }
	public int getCantidadPuertas() {
		return cantidadPuertas;
	}
	public void setCantidadPuertas(int cantidadPuertas) {
		this.cantidadPuertas = cantidadPuertas;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	@Override
	public String toString() {
		return "Auto: \n "+ super.toString() + "\nCantidad Puertas=" + cantidadPuertas + ", \nMotor=" + motor;
	}
    
}
