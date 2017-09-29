package src.main.java.IT7320.Assignment3;

public class MultiplyCalcImplementation {

	CalcInterface intObj;
	public int multiplyTwoNums(int e,int f)
	{
		return intObj.multiply(e,f);
		
	}

	public void setIntObj(CalcInterface intObj) {
		this.intObj = intObj;
	}
	
}
