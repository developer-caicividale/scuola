package it.caicividale.corsicai.ui.services;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class UtilsService {

	static final SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat("dd/MM/yyyy");
	static final SimpleDateFormat DATE_TIME_FORMATTER = new SimpleDateFormat("dd/MM/yyyy HH:mm");

	public static Integer getAnnoFromDate(Date date) {
		Integer anno = null;
		if (date != null) {

			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			anno = cal.get(Calendar.YEAR);
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
	public static boolean isBeforeOrEqual(Date date1, Date date2) {
		boolean check = false;
		if (date1 != null && date2 != null) {
			check = date1.before(date2) || date1.compareTo(date2) == 0;
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
	public static boolean isAfterOrEqual(Date date1, Date date2) {
		boolean check = false;
		if (date1 != null && date2 != null) {
			check = date1.after(date2) || date1.compareTo(date2) == 0;
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
	public static Date getDate(int year, int month, int day) {
		return new GregorianCalendar(year, month - 1, day).getTime();
	}

	public static String getDateString(final Date date) {
		if (date == null) {
			return null;
		}
		return DATE_FORMATTER.format(date);
	}

	public static String getDateTimeString(final Date date) {
		if (date == null) {
			return null;
		}
		return DATE_TIME_FORMATTER.format(date);
	}

	public static int getYearsBetween(Date date1, Date date2) {
		org.joda.time.DateTime jodaDate1 = new org.joda.time.DateTime(date1);
		org.joda.time.DateTime jodaDate2 = new org.joda.time.DateTime(date2);

		return org.joda.time.Years.yearsBetween(jodaDate1, jodaDate2).getYears();
	}
}
