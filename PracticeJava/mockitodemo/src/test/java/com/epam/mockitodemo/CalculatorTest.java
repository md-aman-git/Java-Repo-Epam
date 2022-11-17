package com.epam.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class CalculatorTest {
	Calculator calculator;
	
	@Mock
	CalculatorService service;
	
	@Rule public MockitoRule rule = MockitoJUnit.rule();
	
	@Before
	public void setUp() {
		calculator = new Calculator(service);
	}
	@Test
	
	public void testAdd() {
		when(service.add(2, 3)).thenReturn(5);
		assertEquals(10, calculator.perform(2, 3));
	}
}
