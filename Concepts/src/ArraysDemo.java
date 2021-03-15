
public class ArraysDemo {
	public static void main(String[] args) {
		int[] scores = new int[20];
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		int[] numbers= {1,2,3,4};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			}
		boolean[] booleans = {true , false };
		for (boolean value : booleans ) {
			System.out.println(value);
		}
		String[] names = new String[10];
		for (String name : names) {
			name = new String("Ram");
			System.out.println(name);
		}
	}
}
