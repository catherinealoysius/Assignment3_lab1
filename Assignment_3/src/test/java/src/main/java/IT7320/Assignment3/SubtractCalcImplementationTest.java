package src.main.java.IT7320.Assignment3;

import junit.framework.TestCase;
import static org.mockito.Mockito.*;

public class SubtractCalcImplementationTest extends TestCase {
	SubtractCalcImplementation obj;
	int x, y;
	

	protected void setUp() throws Exception {
		obj = new SubtractCalcImplementation();
		x=5;
		y=3;
		CalcInterface mockObj= mock(CalcInterface.class);
		when(mockObj.subtract(x,y)).thenReturn(x-y);
		obj.setIntObj(mockObj);	}

	protected void tearDown() throws Exception {
		obj=null;
		x=0;
		y=0;
		
	}

	public void testSubtactTwoNums() {
		assertEquals(2, obj.subtractTwoNums(x, y));
	}

}
