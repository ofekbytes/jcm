package jcm.examples.b02_BasicJavaKeywords.test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import jcm.examples.b02_BasicJavaKeywords.main.Person;

public class b02Test {
	
	public b02Test() {
	}

	@Test
	public void ReturnString() {
		Person person = new Person();
		assertEquals("Test", person.isOk());
	}
}
