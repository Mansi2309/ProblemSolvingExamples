
public class CountOfCapitalAndSmallLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalString = "MAnsiVyas";
		int capitalCount = 0;
		int smallCount = 0;
		char[] charArray = originalString.toCharArray();
		for(int i=0 ; i< originalString.length(); i++) {
			if(originalString.charAt(i) >= 'A' && originalString.charAt(i) <= 'Z') {
				capitalCount = capitalCount + 1;
			}
			if(originalString.charAt(i) >= 'a' && originalString.charAt(i) <= 'z') {
				smallCount = smallCount +1;
			}
		}
		System.out.println("Capital count : " + capitalCount);
		System.out.println("Small count : " + smallCount);
	}

}
