public class PracticeProblem {

	public static int[] createIntArray() {
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		return num;
	}
	
	public static String[] createArray(String first, String second, String third, String fourth) {
		String[] words = new String[4];
		words[0] = first;
		words[1] = second;
		words[2] = third;
		words[3] = fourth;
		return words;
	}

	public static String getElement(int n, String[] arr) {
		return arr[n];
	}

	public static void replaceElement(int n, double value, double[] arr) {
		arr[n] = value;
	}



}
