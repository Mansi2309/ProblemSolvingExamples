import java.util.HashMap;

public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "mansimansi";
		HashMap<Character,Integer> countMap = new HashMap<>();
		for(int i =0; i<str.length(); i++) {
			if(countMap.containsKey(str.charAt(i))) {
				int count = countMap.get(str.charAt(i));
				countMap.put(str.charAt(i), count+1);
			}
			else {
				countMap.put(str.charAt(i), 1);
			}
		}
		System.out.println(countMap);
		}

	public static String removeAllDigit(String str) {
		char[] charArray = str.toCharArray();
		String result ="";
		for(int i=0;i<charArray.length;i++) {
			if(!(Character.isDigit(charArray[i]))){
				result = result + charArray[i];
			}
		}
		return result;
	}
}
