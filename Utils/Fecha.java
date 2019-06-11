package Utils;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Clase encargada de dar la fecha actual.
 */
public class Fecha implements Serializable {

    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        LocalDate ahora = LocalDate.now();
        dia = ahora.getDayOfMonth();
        mes = ahora.getMonthValue();
        anio = ahora.getYear();
    }

    @Override
    public String toString() {
        return "fecha: "+dia+"/"+mes+"/"+anio+"\n";
    }
}