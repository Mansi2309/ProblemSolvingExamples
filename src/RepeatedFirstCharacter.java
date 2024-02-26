
public class RepeatedFirstCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String originalString = "geae";
		String originalString = "geeksofgeeks";
		char[] charArray = originalString.toCharArray();
		int length = originalString.length();
		boolean flag = false;
		for(int i=0; i < length ; i++) {
			for(int j =(i+1) ; j<length; j++) {
				if(originalString.charAt(i) == originalString.charAt(j)) {
					System.out.println("character is : " + originalString.charAt(i));
					flag=true;
					return;
				}
			}
		}
		if(!flag) {
			System.out.println("No character repeat");
		}
	}

}
