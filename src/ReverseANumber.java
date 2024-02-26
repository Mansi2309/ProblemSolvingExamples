
public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int reminder;
		int reverse = 0;
		while(num>0) {
			reminder = num%10;
			reverse = (reverse*10) + reminder;
			num = num /10;
		}
		System.out.println("reverse number: " + reverse);
	}

}
