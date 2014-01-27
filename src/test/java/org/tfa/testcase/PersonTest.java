package org.tfa.testcase;

import junit.framework.TestCase;

public class PersonTest extends TestCase {
	   public void testCreate() {
		      final String firstPersonName = "Jane Doe";
		      Person firstPerson = new Person(firstPersonName);
		      assertEquals(firstPersonName, firstPerson.getName());

		      final String secondPersonName = "Joe Blow";
		      Person secondPerson = new Person(secondPersonName);
		      assertEquals(secondPersonName, secondPerson.getName());
		   }	
}
