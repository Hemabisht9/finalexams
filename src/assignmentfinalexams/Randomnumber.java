package assignmentfinalexams;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Randomnumber {

	public static void main(String[] args) {
		//Generate 500 random numbers and print the nth smallest number in a programming language of your choice. (Ask user for the Nth smallest number)
       Random rnum = new Random();
       int [] randomNumbers = new int [500];
       for (int counter = 0; counter < randomNumbers.length; counter++) {
       randomNumbers [counter] = rnum.nextInt(500);
       }
       
       System.out.println("Give me a number");
       Scanner a = new Scanner(System.in);
       int num =  a.nextInt();
       
       Arrays.sort(randomNumbers);
       
       int nthsmallest = randomNumbers[num - 1];
       System.out.println("Generated random number");
       for (int number : randomNumbers) {
    	   System.out.println(number + " ");
       }
       System.out.println("\n" + num + "th smallest number " + nthsmallest);

	}

}
