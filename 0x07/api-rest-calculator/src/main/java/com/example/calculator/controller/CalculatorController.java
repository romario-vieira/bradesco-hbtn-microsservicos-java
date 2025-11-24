package com.example.calculator.controller;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculator.model.Calculator;

@RestController
@RequestMapping(value = "/calculator")
public class CalculatorController {
	@GetMapping("/welcome")
	public String messageWelcome() {
		// TODO
		return "Bem vindo à CALCULATOR API REST.";
	}

	@GetMapping("/addNumbers")
	public String addNumbers(@RequestParam(name = "number1") Double n1, @RequestParam(name = "number2") Double n2) {
		// TODO
		Calculator calc = new Calculator();
		Double res = calc.sum(n1, n2);
		return String.valueOf(res);
	}

	@GetMapping("/subNumbers")
	public String subNumbers(@RequestParam(name = "number1") Double n1, @RequestParam(name = "number2") Double n2) {
		// TODO
		Calculator calc = new Calculator();
		Double res = calc.sub(n1, n2);
		return String.valueOf(res);
	}

	@GetMapping("/divideNumbers")
	public String divideNumbers(@RequestParam(name = "number1") Double n1, @RequestParam(name = "number2") Double n2) {
		// TODO
		Calculator calc = new Calculator();
		Double res = calc.divide(n1, n2);
		return String.valueOf(res);
	}

	@GetMapping("/factorial")
	public String factorial(@RequestParam(name = "factorial") Integer factorial) {
		// TODO
		Calculator calc = new Calculator();
		Integer res = calc.factorial(factorial);
		return String.valueOf(res);
	}

	@GetMapping("/calculeDayBetweenDate")
	public String calculeDayBetweenDate(
			@RequestParam("localDate1") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate1,
			@RequestParam("localDate2") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate2) {
		// TODO
		Calculator calc = new Calculator();
		int res = calc.calculeDayBetweenDate(localDate1, localDate2);
		return String.valueOf(res);
	}

	@GetMapping("/integerToBinary")
	public String integerToBinary(@RequestParam(name = "number1") Integer n1) {
		// TODO
		Calculator calc = new Calculator();
		Integer res = calc.integerToBinary(n1);
		return String.valueOf(res);
	}

	@GetMapping("/integerToHexadecimal")
	public String integerToHexadecimal(@RequestParam(name = "number1") Integer n1) {
		// TODO
		Calculator calc = new Calculator();
		String res = calc.integerToHexadecimal(n1);
		return res;
	}
}
