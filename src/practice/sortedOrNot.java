/*
You're given an array of integers. 
Determine whether the array is sorted in non-decreasing order 
(i.e., every element is less than or equal to the next).

Examples
Example 1:

arr = {1, 2, 2, 3, 4} 
Output: true 
Example 2:

arr = {1, 3, 2, 4} 
Output: false 
*/

package practice;
import java.util.Arrays;
import java.util.stream.IntStream;
public class sortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        boolean isSorted = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
           
            
        }
         System.out.println("array isSorted: " + isSorted +" "+Arrays.toString(arr));

         boolean sorted = IntStream.range(0, arr.length-1).allMatch(i-> arr[i]<= arr[i+1]);
            System.out.println("array Sorted: " + sorted +" "+Arrays.toString(arr));
    }

}
