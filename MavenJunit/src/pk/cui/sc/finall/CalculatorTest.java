package pk.cui.sc.finall;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	@Test
	void test() 
	{
	Calculator c=new Calculator();
	int result=c.findMax(1, 5, 7);
	assertEquals(7,result);

		
	}
	@Test
	void test2() 
	{
		Calculator c=new Calculator();
		int result=c.square(4);
		assertEquals(16,result);
	}
}
