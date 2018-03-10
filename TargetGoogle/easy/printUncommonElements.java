import java.io.*;
import java.util.*;
class printUncommonElements{
	// main class
	public static void main(String args[]){
		// arrays to store the integers
		int intArrOne[];
		int intArrTwo[];

		intArrOne = takeArrayValuesFromUser();
		intArrTwo = takeArrayValuesFromUser();

		printArray(intArrOne);
	}

	// module to take values from the user
	public static int[] takeArrayValuesFromUser(){
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[sc.nextInt()];
		for(int count=0; count < arr.length; count++){
			arr[count] = sc.nextInt();
		}

		return arr;
	}

	// debuging purpose
	// module to print the 


}