import java.util.Arrays;

public class Sortage {

	public static void main(String[] args) {
		int[] myArray = { 5, 2, 7, 3, 87,9,90,76 };
		sort(myArray);
		System.out.println(Arrays.toString(myArray));
	}

	public static void sort(int[] arr) {
		int j = 0;
		int rand;
		for (int count = 0; count < arr.length; count++) {
			j++;
			for (int i = 0; i < arr.length - j; i++) {
				if (arr[i] > arr[i + 1]) {
					rand = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = rand;
				}
			}
		}
	}
}