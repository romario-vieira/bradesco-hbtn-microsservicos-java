package com.example.calculator.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

@ExtendWith(SpringExtension.class)
@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTest {
	@Autowired
	private MockMvc mvc;

	@Test
	void messageWelcome() throws Exception {
		RequestBuilder request = get("/calculator/welcome");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals("Bem vindo à CALCULATOR API REST.", result.getResponse().getContentAsString());
	}

	@Test
	void addNumbers() throws Exception {
		// TODO
		RequestBuilder request = get("/calculator/addNumbers?number1=2&number2=1");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals("3.0", result.getResponse().getContentAsString());
	}
	
	@Test
	void subNumbers() throws Exception {
		// TODO
		RequestBuilder request = get("/calculator/subNumbers?number1=2&number2=1");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals("1.0", result.getResponse().getContentAsString());
	}
	
	@Test
	void divideNumbers() throws Exception {
		// TODO
		RequestBuilder request = get("/calculator/divideNumbers?number1=2&number2=1");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals("2.0", result.getResponse().getContentAsString());
	}

	@Test
	void factorial() throws Exception {
		// TODO
		RequestBuilder request = get("/calculator/factorial?factorial=5");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals("120", result.getResponse().getContentAsString());
	}
	
	@Test
	void calculeDayBetweenDate() throws Exception {
		// TODO
		RequestBuilder request = get("/calculator/calculeDayBetweenDate?localDate1=2025-11-24&localDate2=2025-11-20");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals("4", result.getResponse().getContentAsString());
	}
	
	@Test
	void integerToBinary() throws Exception {
		// TODO
		RequestBuilder request = get("/calculator/integerToBinary?number1=5");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals("101", result.getResponse().getContentAsString());
	}
	
	@Test
	void integerToHexadecimal() throws Exception {
		// TODO
		RequestBuilder request = get("/calculator/integerToHexadecimal?number1=55");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals("37", result.getResponse().getContentAsString());
	}
	
}
