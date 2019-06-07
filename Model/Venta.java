package Model;

import Utils.Fecha;

import java.io.Serializable;

public class Venta implements Serializable {
    private Vehiculo vehiculo;
    private Persona nuevo_duenio;
    private Fecha fecha_venta;
    private Usuario vendedor;
    private double valor_vendido;

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Persona getNuevo_duenio() {
        return nuevo_duenio;
    }

    public void setNuevo_duenio(Persona nuevo_duenio) {
        this.nuevo_duenio = nuevo_duenio;
    }

    public Fecha getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Fecha fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public Usuario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
    }

    public double getValor_vendido() {
        return valor_vendido;
    }

    public void setValor_vendido(double valor_vendido) {
        this.valor_vendido = valor_vendido;
    }

    public Venta(Vehiculo vehiculo, Persona nuevo_duenio, Fecha fecha_venta, Usuario vendedor, double valor_vendido) {

        this.vehiculo = vehiculo;
        this.nuevo_duenio = nuevo_duenio;
        this.fecha_venta = fecha_venta;
        this.vendedor = vendedor;
        this.valor_vendido = valor_vendido;
    }

    public double calcular_ganancia(){
        return (getValor_vendido() - vehiculo.getGasto() - vehiculo.getValor_adquisicion());
    }

}
