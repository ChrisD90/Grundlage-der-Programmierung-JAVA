package task07_3;

public class Main {

	// wie oft kommt s1 in s2 vor
	public static void occurences(String s1, String s2) {

		int counter = 0;

		for (int i = 0; i < s2.length();) {
			if (s2.indexOf(s1, i) != -1) {
				counter++;
				i = s2.indexOf(s1, i) + 1;
			} else {
				i++;
			}
		}

		System.out.println(counter);

	}

	public static void caseSensitiveOccurence(String s1, String s2) {

		occurences(s1.toLowerCase(), s2.toLowerCase());
	}

	
	public static void main(String[] args) {
		occurences("toph", "Christoph von Christopherus");
		caseSensitiveOccurence("a", "Auf nach DA!");
	}

}
