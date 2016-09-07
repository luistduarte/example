package it.tests.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplyTest {

	@Test
	public void testMultiply() {
		Junit test = new Junit();
		int result = test.multiply(4, 2);
		assertEquals(8, result);
	}

}
