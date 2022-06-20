/**
 * 
 */
package assignments;
import java.util.*;

/**
 * @author Desmond Nnebue
 *
 */
public class BenchmarkingSortingAlgorithms {
	int maxArraySize=100000; // Array Size
	int[] arrayOne = new int[maxArraySize]; // First Array
	int[] arrayTwo = new int[maxArraySize]; // Second Array

	/**
	 * Constructor subroutine. It constructs an array of random numbers and create another array which is a clone of the first one.
	 */
	public BenchmarkingSortingAlgorithms() {
		for (int i=0; i<arrayOne.length; i++) {
			arrayOne[i]=(int)(Integer.MAX_VALUE * Math.random());
		};
		arrayTwo = arrayOne.clone();
		
	}
	
	/**Selection algorithm that returns a sorted array.
	 * @param arr An unsorted array of integers
	 * @return arr A sorted version of the initial array.
	 * This
	 */
	public int[] selectionSort(int[] arr) {
		// Sort an array into increasing order, using selection sort
		
		for (int lastPlace = arr.length-1; lastPlace > 0; lastPlace--) {
			// Find the largest item among A[0], A[1], ...,
			// A[lastPlace], and move it into position lastPlace
			// by swapping it with the number that is currently
			// in position lastPlace.
			int maxLoc = 0; // Location of largest item seen so far.
			for (int j = 1; j <= lastPlace; j++) {
				if (arr[j] > arr[maxLoc]) {
					// Since A[j] is bigger than the maximum we’ve seen
					// so far, j is the new location of the maximum value
					// we’ve seen so far.
					maxLoc = j;
				}
			}
			int temp = arr[maxLoc]; // Swap largest item with A[lastPlace].
			arr[maxLoc] = arr[lastPlace];
			arr[lastPlace] = temp;
			} // end of for loop
		return arr;
		}
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BenchmarkingSortingAlgorithms algo = new BenchmarkingSortingAlgorithms();
	
		long startTime = System.currentTimeMillis();
		algo.selectionSort(algo.selectionSort(algo.arrayOne));
		long runTime = System.currentTimeMillis() - startTime;
		
		System.out.println("Time taken to sort the first array: " + runTime/1000 + "secs") ;
		
		
		long startTime1 = System.currentTimeMillis();
		Arrays.sort(algo.arrayTwo);
		long runTime1 = System.currentTimeMillis() - startTime1;
		
		System.out.println("Time taken to sort the second array: " + runTime1/1000 + "secs") ;
	}

}
