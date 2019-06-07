package Model;

public class Domicilio {
    private String calle;
    private String numero_calle;
    private String piso;
    private String departamento; // A , B, C o 1 2 3
    private String codigo_postal;
    private String localidad;

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero_calle() {
        return numero_calle;
    }

    public void setNumero_calle(String numero_calle) {
        this.numero_calle = numero_calle;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Domicilio(String calle, String numero_calle, String piso, String departamento, String codigo_postal, String localidad) {

        this.calle = calle;
        this.numero_calle = numero_calle;
        this.piso = piso;
        this.departamento = departamento;
        this.codigo_postal = codigo_postal;
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return  "\nCalle: " + getCalle() +
                "\nNumero calle: " + getNumero_calle() +
                "\nPiso: "+ getPiso() +
                "\nDepartamento: " + getDepartamento() +
                "\nCodigo postal: " + getCodigo_postal() +
                "\nLocalidad: " + getLocalidad() +"\n";
    }
}
