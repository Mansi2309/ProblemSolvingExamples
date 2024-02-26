import java.util.Arrays;

public class AnagramString {

	//Two strings are called anagrams if they contain same set of characters but in different order.
	// "keep ? peek", "Mother In Law - Hitler Woman".
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isAnagram("Keep", "Peek");
		isAnagram("Mother In Law", "Hitler Woman");  
		isAnagram("Mother In Lassw", "Hitler Woman");  
	}

	private static void isAnagram(String str1, String str2) {
		// TODO Auto-generated method stub
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		boolean status = true;
		if(s1.length() != s2.length()) {
			status = false;
		}
		else {
			char[] charArray1 = s1.toLowerCase().toCharArray();
			char[] charArray2 = s2.toLowerCase().toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			status = Arrays.equals(charArray1, charArray2);
		}
		if(status) {
			System.out.println(str1 + " and " + str2 + " is Anagram");
		}
		else {
			System.out.println(str1 + " and " + str2 + " is not Anagram");
		}
	}

}
