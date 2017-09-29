package src.main.java.IT7320.Assignment3;

import junit.framework.TestCase;
import static org.mockito.Mockito.*;

public class MultiplyCalcImplementationTest extends TestCase {
	MultiplyCalcImplementation obj;
	int x, y;
	

	protected void setUp() throws Exception {
		obj = new MultiplyCalcImplementation();
		x=5;
		y=6;
		CalcInterface mockObj= mock(CalcInterface.class);
		when(mockObj.multiply(x,y)).thenReturn(x*y);
		obj.setIntObj(mockObj);	}

	protected void tearDown() throws Exception {
		obj=null;
		x=0;
		y=0;
		
	}

	public void testAddTwoNums() {
		assertEquals(30, obj.multiplyTwoNums(x, y));
	}

}
