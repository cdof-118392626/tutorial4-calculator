package com.example.demo;

import com.example.demo.Models.Calculator;
import static junit.framework.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorSampleAppApplicationTests {

	@Test
	public void contextLoads() {
            assertEquals(true, true);
	}
        @Test
        public void createCalcObject() {
            Calculator c = new Calculator(2, 3, "+");
            double result = c.calculateResult();
            assertEquals(5.0, result, 0.01);
            
        }
        
        @Test
        public void calcMultiply() {
            Calculator c = new Calculator(2, 3, "*");
            double result = c.calculateResult();
            assertEquals(6.0, result, 0.01);
            
        }
        
        @Test
        public void calcSubtract() {
            Calculator c = new Calculator(2, 3, "-");
            double result = c.calculateResult();
            assertEquals(-1.0, result, 0.01);
            
        }
}
