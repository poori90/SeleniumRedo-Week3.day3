package week3.day3;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {

		//syntax to store Array Literals 
		
		int[] number = {98,96,74,89,85};
		
		int[] num = {45,6,45754,234,56,77,88,99,22,33,44,55,66,26,57};
		// to find the length of Array
		
		int arrlength = number.length;
		System.out.println(arrlength);
		
		// to find the last Index Value 
		
		System.out.println("Last Array Value :" + " " + number[arrlength-1]);

		//To find the First Index Value 
		
		System.out.println("First Index Value : " + " " + number[0]);
		
		//To Sort the Array Values 
		
		Arrays.sort(num);
		System.out.println("After Sorting the Arrays value : " + " " + num[0]);
		
		// to iterate the Arrays Values - for Loop
		
		for(int i = 0;i < num.length ; i++) {
			System.out.println(num[i]);
		}
	}

}
