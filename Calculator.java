package Week1.Day2;

public class Calculator {
    public int add(int num1, int num2, int num3) {
    	int Total = 0;
    	Total = num1 + num2 + num3;
    	return Total;
    }
    public int sub(int num1, int num2) {
    	int diff = 0;
    	diff = num1 - num2;
    	return diff;
    }
	public double mul(double num1, double num2) {
		double product=0;
		product = num1 *  num2;
		return product;
	}
	public float divide(float num1, float num2) {
		float result=0f;
		result = num1 /  num2;
		return result;
	}
	
}
