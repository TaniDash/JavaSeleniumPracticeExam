package dictionaryExercise;

import java.util.Random;
import java.util.Scanner;

public class RanGenerator {

	public static void main(String[] args) {
		
		Random rn = new Random();
		int max= 1000;
		int min= 100;
				
		int[] myArr = new int[500];
		System.out.println(myArr.length);
		
		for(int i=0; i<myArr.length; i++) {
			myArr[i]=rn.nextInt(max-min)+min;
		}
			for(int num : myArr) {
			System.out.println(num);
		}
		Scanner ui = new Scanner(System.in);
		System.out.println("Give the Nth smallest number : ");
		int myNum =ui.nextInt();
		
		for(int j=0; j<myArr.length; j++) {
			for(int k=1;k<myArr.length; k++ ) {
				int p =0;
				if(myArr[k-1]>myArr[k]) {
				p=myArr[k-1];
				myArr[k-1]=myArr[k];
				myArr[k]=p;
				}
			}
			
		}
	
		System.out.println(myArr[myNum-1]);

	}

}
