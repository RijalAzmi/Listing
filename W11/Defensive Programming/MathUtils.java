package W11;

public class MathUtils {
	public static int factorial(int n) throws IllegalArgumentException {
		if (n<0){
			throw new  IllegalArgumentException("the factorial function is not defined for negative integers");
		} else if (n>16){
			throw new  IllegalArgumentException("angka terlalu besar, masukkan angka dari 0-16 ");
		}
		
		int fac = 1;
		for (int i=n; i>0; i--)
			fac *= i;
		return fac;
	}
}
