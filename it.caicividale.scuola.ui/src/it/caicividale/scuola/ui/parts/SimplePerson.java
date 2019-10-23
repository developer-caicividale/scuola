package it.caicividale.scuola.ui.parts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Object representation of a row in the table
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SimplePerson extends ModelObject {
	private int id;
	private String name;
	private Date birthDate;
	private SimplePersonGender gender;
	private Boolean isMarvel;

	private static final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

	public SimplePerson(int id, String name, Date birthDate, SimplePersonGender gender, Boolean isMarvel) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.gender = gender;
		this.isMarvel = isMarvel;
	}

	public static List<SimplePerson> getList() throws ParseException {
		return Arrays.asList(
				new SimplePerson(100, "Iron Man", format.parse("01/01/1970"), SimplePersonGender.MALE, Boolean.TRUE),
				new SimplePerson(110, "Batman", format.parse("01/02/1970"), SimplePersonGender.MALE, Boolean.FALSE),
				new SimplePerson(120, "Cat Woman", format.parse("01/03/1970"), SimplePersonGender.FEMALE, Boolean.TRUE),
				new SimplePerson(130, "Wonder Woman", format.parse("01/04/1970"), SimplePersonGender.FEMALE,
						Boolean.TRUE),
				new SimplePerson(140, "Hulk", format.parse("01/05/1970"), SimplePersonGender.MALE, Boolean.TRUE));
	}

	public SimplePerson() {

	}
}