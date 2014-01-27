package org.tfa.testcase;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Project {

	private String department;
	private String projectId;
	private ArrayList<Person> persons = new ArrayList<Person>();
	private Date startDate;

	Project(String department, String projectId, Date startDate) {
		this.department = department;
		this.projectId = projectId;
		this.startDate = startDate;
	}

	public String getDepartment() {
		return department;
	}

	public String getProjectId() {
		return projectId;
	}

	public Date getStartDate() {
		return startDate;
	}

	int getNumberOfPersons() {
		return persons.size();
	}

	void addPerson(Person person) {
		persons.add(person);
	}

	Person get(int index) {
		return persons.get(index);
	}

	Date getEndDate() {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(startDate);
		final int sessionLength = 16;
		final int daysInWeek = 7;
		final int daysFromFridayToMonday = 3;
		int numberOfDays = sessionLength * daysInWeek - daysFromFridayToMonday;
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		return calendar.getTime();
	}

}
