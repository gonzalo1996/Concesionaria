package Model;

import Utils.Fecha;

import java.io.Serializable;

public class Embarcacion extends Vehiculo implements Serializable {

    private float manga;
    private float eslora;
    private int hpMotor;
    private boolean Vela;

    public Embarcacion(Boolean vendido, Fecha fecha_adquisicion, double valor_adquisicion, double gasto, double valor_estimado_venta, String marca, String modelo, Persona duenio_anterior, Persona duenio_nuevo, float manga, boolean vela, float eslora, int hpMotor) {
        super(vendido, fecha_adquisicion, valor_adquisicion, gasto, valor_estimado_venta, marca, modelo, duenio_anterior, duenio_nuevo);
        this.manga = manga;
        this.Vela = vela;
        this.eslora = eslora;
        this.hpMotor = hpMotor;
    }

    public int getHpMotor() {
		return hpMotor;
	}

	public void setHpMotor(int hpMotor) {
		this.hpMotor = hpMotor;
	}

	public float getManga() {
        return manga;
    }

    public void setManga(float manga) {
        this.manga = manga;
    }

    public boolean isVela() {
        return Vela;
    }

    public void setVela(boolean vela) {
        Vela = vela;
    }

    public float getEslora() {
        return eslora;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }
    private String VelaOMotor()
    {
    	if(Vela)
    		return "Velero";
    	else 
    		return "Yate / Lancha";
    }

	@Override
	public String toString() {
		return "Embarcacion:\n" + super.toString()+ "\ntipo:" + VelaOMotor() + "\nManga=" + manga + "\nEslora=" + eslora + "\nHp Motor=" + hpMotor;
	}
    
    
}
