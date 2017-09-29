package src.main.java.IT7320.Assignment3;

public class SubtractCalcImplementation {
	
	CalcInterface intObj;
	public int subtractTwoNums(int c,int d)
	{
		return intObj.subtract(c,d);
		
	}

	public void setIntObj(CalcInterface intObj) {
		this.intObj = intObj;
	}
	
}
