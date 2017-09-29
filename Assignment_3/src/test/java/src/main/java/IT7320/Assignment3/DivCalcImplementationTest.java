package src.main.java.IT7320.Assignment3;

import junit.framework.TestCase;
import static org.mockito.Mockito.*;

public class DivCalcImplementationTest extends TestCase {
	DivCalcImplementation obj;
	int x, y;
	double c,d;
	

	protected void setUp() throws Exception {
		obj = new DivCalcImplementation();
		x=5;
		y=2;
		c=(double)x;
		d=(double)y;
		CalcInterface mockObj= mock(CalcInterface.class);
		//when(mockObj.div(x, y)).t
	when(mockObj.div(x, y)).thenReturn((double) (c/d));
//		when(mockObj.multiply(x,y)).thenReturn(x*y);
		obj.setIntObj(mockObj);	}

	protected void tearDown() throws Exception {
		obj=null;
		x=0;
		y=0;
		
	}

	public void testAddTwoNums() {
		assertEquals(2.5, obj.divTwoNums(x, y));
	}

}
