package org.tfa.testcase;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;

public class ProjectTest extends TestCase {
	private Project project;
	private Date startDate;

	public void setUp() {
		startDate = createDate(2014, 1, 10);
		project = new Project("ESS", "IMI", startDate);
	}
	
	public void testCreate() {
		assertEquals("ESS", project.getDepartment());
		assertEquals("IMI", project.getProjectId());
		assertEquals(0, project.getNumberOfPersons());
		assertEquals(startDate, project.getStartDate());
	}
	
	public void testPersons() {
		Person person1 = new Person("Cain DiVoe");
		project.addPerson(person1);
		assertEquals(1, project.getNumberOfPersons());
		assertEquals(person1, project.get(0));

		Person person2 = new Person("Coralee DeVaughn");
		project.addPerson(person2);
		assertEquals(2, project.getNumberOfPersons());
		assertEquals(person1, project.get(0));
		assertEquals(person2, project.get(1));
	}

	Date createDate(int year, int month, int date) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.clear();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month - 1);
		calendar.set(Calendar.DAY_OF_MONTH, date);
		return calendar.getTime();
	}
}
