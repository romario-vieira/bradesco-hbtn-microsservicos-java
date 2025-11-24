package com.example.calculator.model;

import java.time.LocalDate;
import java.util.OptionalDouble;

public class Calculator {
	public Double sum(Double number1, Double number2) {
		// TODO
		// validação -> throw new NullPointerException("Número 1 e número 2 são
		// obrigatórios.");
		if (OptionalDouble.of(number1).isEmpty() || OptionalDouble.of(number2).isEmpty()) {
			throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
		}
		return number1 + number2;
	}

	public Double sub(Double number1, Double number2) {
		// TODO
		// validação -> throw new NullPointerException("Número 1 e número 2 são
		// obrigatórios.");
		if (OptionalDouble.of(number1).isEmpty() || OptionalDouble.of(number2).isEmpty()) {
			throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
		}
		return number1 - number2;
	}

	public Double divide(Double number1, Double number2) {
		// TODO
		// validação -> throw new NullPointerException("Número 1 e número 2 são
		// obrigatórios.");
		// validação -> throw new ArithmeticException("Divisão por zero não é
		// permitido.");
		if (OptionalDouble.of(number1).isEmpty() || OptionalDouble.of(number2).isEmpty()) {
			throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
		}
		if (number1 == 0 || number2 == 0) {
			throw new ArithmeticException("Divisão por zero não é permitido.");
		}
		return number1/number2;
	}

	public Integer factorial(Integer factorial) {
		// TODO
		// validação -> throw new NullPointerException("Número é obrigatório.");
		if (factorial == null) {
			throw new NullPointerException("Número é obrigatório.");
		}
		return (factorial <= 1) ? 1 : factorial * factorial(factorial - 1);
	}

	// Exemplos:
	// Integer = 1 -> Binary = 1
	// Integer = 5 -> Binary = 101
	// Integer = 20 -> Binary = 10100
	public Integer integerToBinary(Integer integer) {
		// TODO
		return Integer.valueOf(Integer.toBinaryString(integer));
	}

	// Exemplos:
	// Integer = 1 -> Hexadecimal = "1"
	// Integer = 5 -> Hexadecimal = "37"
	// Integer = 170 -> Binary = "AA"
	public String integerToHexadecimal(Integer integer) {
		// TODO
		return Integer.toHexString(integer);
	}

	// Exemplos
	// Date 1 = LocalDate.of(2020, 3, 15);
	// Date 2 = LocalDate.of(2020, 3, 29)
	// Total de dias = 14
	public int calculeDayBetweenDate(LocalDate date1, LocalDate date2) {
		// TODO
		return (int) Math.abs(java.time.temporal.ChronoUnit.DAYS.between(date1, date2));
	}
}
