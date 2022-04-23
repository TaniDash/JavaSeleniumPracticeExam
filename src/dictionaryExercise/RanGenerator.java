package dictionaryExercise;

import java.util.Random;
import java.util.Scanner;

public class RanGenerator {

	public static void main(String[] args) {

		int startCount = 100;
		int n = 0;
		int endCount = 1000;
		int arraysize = endCount - startCount;
		int numbers[] = new int[arraysize + 1];

		Random rn = new Random();

		for (int counter = startCount; counter <= endCount; counter++) {
			int c = n++;
			int num = rn.nextInt(1000);
			numbers[c] = num;
			System.out.println(numbers[c]);

		}
		int smallest = numbers[0];
		int largest = numbers[0];
		
//		Scanner ui = new Scanner(System.in);
//		System.out.println("Give the Nth smallest number : ");
//		int nthNum =ui.nextInt();

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest)
				largest = numbers[i];
			else if (numbers[i] < smallest)
				smallest = numbers[i];
		}
//		System.out.println("Largest Number is : " + largest);
		System.out.println("Smallest Number is : " + smallest);
	}

}
