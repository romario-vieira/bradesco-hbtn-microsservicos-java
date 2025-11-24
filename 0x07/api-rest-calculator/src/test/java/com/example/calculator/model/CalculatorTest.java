package com.example.calculator.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private Calculator calculator;

	@BeforeEach
	public void setup() {
		calculator = new Calculator();
	}

	@Test
	void sumTest() {
		// TODO
		Double resultado = calculator.sum(1.0, 2.0);
		assertNotNull(resultado);
		assertEquals(3.0, resultado);
	}

	@Test
	public void numbersNullSumTest() {
		// TODO
		assertThrows(NullPointerException.class, () -> calculator.sum(null, null));
	}

	@Test
	void subTest() {
		// TODO
		Double resultado = calculator.sub(2.0, 1.0);
		assertNotNull(resultado);
		assertEquals(1.0, resultado);
	}

	@Test
	void divideTest() {
		// TODO
		Double resultado = calculator.divide(4.0, 2.0);
		assertNotNull(resultado);
		assertEquals(2.0, resultado);
	}

	@Test
	public void divisionByZeroTest() {
		// TODO
		assertThrows(ArithmeticException.class, () -> calculator.divide(4.0, 0.0));
	}

	@Test
	void factorialTest() {
		// TODO
		Integer resultado = calculator.factorial(5);
		assertNotNull(resultado);
		assertEquals(120, resultado);
	}

	@Test
	void integerToBinaryTest() {
		// TODO
		Integer resultado = calculator.integerToBinary(5);
		assertNotNull(resultado);
		assertEquals(101, resultado);
	}

	@Test
	void integerToHexadecimalTest() {
		// TODO
		String resultado = calculator.integerToHexadecimal(55);
		assertNotNull(resultado);
		assertEquals("37", resultado);
	}

	@Test
	void calculeDayBetweenDateTest() {
		// TODO
		int resultado = calculator.calculeDayBetweenDate(LocalDate.of(2023, 7, 12), LocalDate.of(2025, 3, 10));
		assertNotNull(resultado);
		assertEquals(607, resultado);
	}
}
