
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalString = "Mansi";
		char[] charArray = originalString.toCharArray();
		int length = charArray.length;
		String reverseString = "";
		for(int i=length-1; i>=0 ; i--) {
			reverseString = reverseString + originalString.charAt(i);
		}
		System.out.println("Reverse String: " + reverseString);
		
		String stringCount = stringwithNumber("Chocolate",2);
		System.out.println("String with count : " + stringCount);
	}
	
	public static String stringwithNumber(String givenString, int number){

		int length = givenString.length();
		String newString ="";
		char[] charArrayOfString = givenString.toCharArray();
		for(int i=0; i < 3; i++){
			newString = newString + givenString.charAt(i);
		}
		StringBuilder stringWithCount = new StringBuilder();
		stringWithCount.append("");
		for(int i=0; i<number ;i++){
		stringWithCount.append(newString);
		}
		return stringWithCount.toString();
	}

}
