package br.com.fatec.thiagofortunato;

import static org.junit.Assert.*;
import org.junit.Test;


public class AppTest {
	
	@Test
	public void sum(){
		Float value1 = new Float(1);
		Float value2= new Float(2);
		Float result = Operations.sum(value1,value2);
		
		assertEquals(new Float(3), result);		
	}
	
	@Test
	public void subtract(){
		Float value1 = new Float(1);
		Float value2= new Float(2);
		Float result = Operations.subtract(value1,value2);
		
		assertEquals(new Float(-1), result);		
	}
	
	@Test
	public void multiply(){
		Float value1 = new Float(1);
		Float value2= new Float(2);
		Float result = Operations.multiply(value1,value2);
		
		assertEquals(new Float(2), result);		
	}
	
	@Test
	public void divide(){
		Float value1 = new Float(1);
		Float value2= new Float(2);
		Float result = Operations.divide(value1,value2);
		
		assertEquals(new Float(0.5), result);		
	}
}
