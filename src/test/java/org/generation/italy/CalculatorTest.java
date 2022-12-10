package org.generation.italy;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

 public class CalculatorTest {
 	private Calculator c = new Calculator();

 	@Test
 	@DisplayName("test addizione")
 	void addTest() {
 		float value = c.add(1, 2);
 		assertEquals(3, value);
 	}

 	@Test
 	@DisplayName("test sottrazione")
 	void subracTest() {
 		float value = c.subtract(5, 10);
 		assertEquals(-5, value);
 	}

 	@Test
 	@DisplayName("test moltiplicazione")
 	void multiplyTest() {
 		float value = c.multiply(3, 10);
 		assertEquals(30, value);
 	}

 
 	@Test
 	@DisplayName("Test divisione")
 	void divideTest() throws Exception {
 		float value = c.divide(7, 10);
 		assertEquals(0.7f, value);
 	}

 	@Test
 	@DisplayName("Test eccezione divisione /0")
 	void exceptionDivideTest() {
 		assertThrows(Exception.class, () -> c.divide(3, 0));
 	}
 
 	
 }