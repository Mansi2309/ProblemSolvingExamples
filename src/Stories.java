import java.util.Arrays;
import java.util.HashMap;

public class Stories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] endings1 = { 6, 15, 21, 30 };
		int[][] choices1_1 = { { 3, 7, 8 }, { 9, 4, 2 }, };
		int[][] choices1_2 = { { 3, 14, 2 }, };
		int[][] choices1_3 = { { 5, 11, 28 }, { 9, 19, 29 }, { 14, 16, 20 }, { 18, 7, 22 }, { 25, 6, 30 }, };
		int[][] choices1_4 = { { 2, 10, 15 }, { 3, 4, 10 }, { 4, 3, 15 }, { 10, 3, 15 }, };

		int[] endings2 = { 11 };
		int[][] choices2_1 = { { 2, 3, 4 }, { 5, 10, 2 }, };
		int[][] choices2_2 = {};

		int[] endings3 = { 4 };
		int[][] choices3_1 = { { 10, 6, 8 }, };

		stories(endings1, choices1_1, 1);
		stories(endings1, choices1_1, 2);

		stories(endings1, choices1_2, 1);
		stories(endings1, choices1_2, 2);

		stories(endings1, choices1_3, 1);
		stories(endings1, choices1_3, 2);

		stories(endings1, choices1_4, 1);
		stories(endings1, choices1_4, 2);

		stories(endings2, choices2_1, 1);
		stories(endings2, choices2_1, 2);

		stories(endings2, choices2_2, 1);
		stories(endings2, choices2_2, 2);

		stories(endings3, choices3_1, 1);
		stories(endings3, choices3_1, 2);
	}

	private static void stories(int[] endings, int[][] choices, int option) {
		// TODO Auto-generated method stub
		final int startingPage = 1;
		HashMap<Integer, Integer> pageVisit = new HashMap<Integer, Integer>();
		int endingPage = 0;
		int currentPage = startingPage;
		while (true) {
			if (pageVisit.containsKey(currentPage)) {
				endingPage = -1;
				break;
			}
			pageVisit.put(currentPage, 1);
			Arrays.sort(endings);
			if (Arrays.binarySearch(endings, currentPage) >= 0) {
				endingPage = currentPage;
				break;
			}
			final Integer innerCurrentPage = new Integer(currentPage);
			int[] foundChoice = Arrays.stream(choices)
                    .filter(choiceArr -> choiceArr[0] == innerCurrentPage)
                    .findFirst()
                    .orElse(null);

			if (foundChoice != null) {
				currentPage = foundChoice[option];
				continue;
			}
			currentPage++;

		}
		System.out.println("Ending Page: " + endingPage);
	}
}
