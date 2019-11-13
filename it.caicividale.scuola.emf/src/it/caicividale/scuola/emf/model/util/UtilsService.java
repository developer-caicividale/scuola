package it.caicividale.scuola.emf.model.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class UtilsService {

    static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public static Integer getAnnoFromDate(LocalDate date) {
	Integer anno = null;
	if (date != null) {

	    anno = date.getYear();
	}
	return anno;
    }

    /**
     * Verifica se date1 è antecedente o uguale a date2
     * 
     * @param date1
     * @param date2
     * @return
     */

    public static boolean isBeforeOrEqual(LocalDate date1, LocalDate date2) {
	boolean check = false;
	if (date1 != null && date2 != null) {
	    check = date1.isBefore(date2) || date1.compareTo(date2) == 0;
	}
	return check;
    }

    /**
     * Verifica se date1 è posteriore o uguale a date2
     * 
     * @param date1
     * @param date2
     * @return
     */
    public static boolean isAfterOrEqual(LocalDate date1, LocalDate date2) {
	boolean check = false;
	if (date1 != null && date2 != null) {
	    check = date1.isAfter(date2) || date1.compareTo(date2) == 0;
	}
	return check;
    }

    /**
     * metodo che restituisce una data passando anno, mese (1-12) e giorno (1-31)
     * 
     * @param year
     * @param month
     * @param day
     * @return
     */

    public static LocalDate getDate(int year, int month, int day) {
	return LocalDate.of(year, month, day);
    }

    public static String getDateString(final LocalDate date) {
	if (date == null) {
	    return null;
	}
	return date.format(DATE_FORMATTER);
    }

    public static long getYearsBetween(LocalDate date1, LocalDate date2) {

	long diff = ChronoUnit.YEARS.between(date1, date2);

	return diff;
    }

}
