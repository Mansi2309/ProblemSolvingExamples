
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalString = "545";
		String reverseString ="";
		char[] charArray = originalString.toCharArray();
		int length = charArray.length;
		for(int i = length-1;i>=0;i--) {
			reverseString = reverseString + originalString.charAt(i);
		}
		if(reverseString.equalsIgnoreCase(originalString)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
