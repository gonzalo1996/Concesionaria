package Utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

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