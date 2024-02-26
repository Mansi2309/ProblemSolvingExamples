
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int factorial =1;
		// 5! = 5*4*3*2*1
		for(int i = 1; i<=num; i++) {
			factorial = factorial * i;
		}
		
		System.out.println("Factorial of num is : " + factorial);
	}

}
