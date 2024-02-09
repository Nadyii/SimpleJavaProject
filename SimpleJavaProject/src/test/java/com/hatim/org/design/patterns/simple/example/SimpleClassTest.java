package com.hatim.org.design.patterns.simple.example;

import com.hatim.org.design.patterns.simple.example.SimpleClass;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SimpleClassTest {

	@Test
	public void testAddtion() {

    	SimpleClass simpleClass= new SimpleClass();
        
		int additionResult = simpleClass.add(2,5);
		
	    assertEquals(7, additionResult);
		
		
	}


	
}


 
	