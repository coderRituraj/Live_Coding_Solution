import java.util.HashMap;

public class Task1 {
	public static void greaterSubString(String s) {
		int n = s.length();
		HashMap<Character, Integer> hmap = new HashMap<>();
		String[] subArray = new String[2];
		int j = 0;
		String word = "";
		int currentLength = 0;
		int maxLength = 0;
		for (int i = 0; i < n; i++) {
			if (!hmap.containsKey(s.charAt(i))) {
				hmap.put(s.charAt(i), i);
				word = word + s.charAt(i);
				currentLength++;

			} else {
				if (maxLength < currentLength) {
					maxLength = currentLength;
				}
				// subArray[j] = word;
				System.out.println(word);
				j++;
				word = "";
				i = hmap.get(s.charAt(i));
				// i++;
				hmap.clear();

			}
		}

	}

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		greaterSubString(str);

	}
}


/*
Time complexity will be 0(n).

*/