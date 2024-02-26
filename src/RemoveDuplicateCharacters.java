import java.util.HashMap;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeDuplicateCharacters("mmmmansi");
	}

	private static void removeDuplicateCharacters(String string) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();
		String stringWithoutDuplication = "";
		char[] charArray = string.toCharArray();
		int length = charArray.length;
		for(int i=0; i< length ; i++) {
			if(!(count.containsKey(string.charAt(i)))) {
				count.put(string.charAt(i), 1);
				stringWithoutDuplication = stringWithoutDuplication + string.charAt(i);
			}
		}
		System.out.println("stringWithoutDuplication: " + stringWithoutDuplication);
	}

}
