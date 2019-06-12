package Model;

import Utils.Fecha;

import java.io.Serializable;

public abstract class Vehiculo implements Serializable {

    private Boolean vendido;
    private Fecha fecha_adquisicion;
    private double valor_adquisicion;
    private double gasto; //reparaciones o lo necesario para venderlo
    private double valor_estimado_venta;
    private String marca;
    private String modelo;
    private Persona duenio_anterior;
    private Persona duenio_nuevo;

    public Vehiculo(Boolean vendido, Fecha fecha_adquisicion, double valor_adquisicion, double gasto, double valor_estimado_venta, String marca, String modelo, Persona duenio_anterior, Persona duenio_nuevo) {
        this.vendido = vendido;
        this.fecha_adquisicion = fecha_adquisicion;
        this.valor_adquisicion = valor_adquisicion;
        this.gasto = gasto;
        this.valor_estimado_venta = valor_estimado_venta;
        this.marca = marca;
        this.modelo = modelo;
        this.duenio_anterior = duenio_anterior;
        this.duenio_nuevo = duenio_nuevo;
    }

    public Boolean getVendido() {
        return vendido;
    }

    public void setVendido(Boolean vendido) {
        this.vendido = vendido;
    }

    public Fecha getFecha_adquisicion() {
        return fecha_adquisicion;
    }

    public void setFecha_adquisicion(Fecha fecha_adquisicion) {
        this.fecha_adquisicion = fecha_adquisicion;
    }

    public double getValor_adquisicion() {
        return valor_adquisicion;
    }

    public void setValor_adquisicion(double valor_adquisicion) {
        this.valor_adquisicion = valor_adquisicion;
    }

    public double getGasto() {
        return gasto;
    }

    public void setGasto(double gasto) {
        this.gasto = gasto;
    }

    public double getValor_estimado_venta() {
        return valor_estimado_venta;
    }

    public void setValor_estimado_venta(double valor_estimado_venta) {
        this.valor_estimado_venta = valor_estimado_venta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Persona getDuenio_anterior() {
        return duenio_anterior;
    }

    public void setDuenio_anterior(Persona duenio_anterior) {
        this.duenio_anterior = duenio_anterior;
    }

    public Persona getDuenio_nuevo() {
        return duenio_nuevo;
    }

    public void setDuenio_nuevo(Persona duenio_nuevo) {
        this.duenio_nuevo = duenio_nuevo;
    }

	@Override
	public String toString() {
		return  "\n Marca=" + marca +"\nModelo=" + modelo +"\nFecha Adquisicion=" + fecha_adquisicion + "\nValor Adquisicion=" + valor_adquisicion
				+ "\nGasto=" + gasto + "\nValor Estimado Venta=" + valor_estimado_venta ;
	}
    
}