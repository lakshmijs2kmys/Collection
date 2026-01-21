/*Shift All 1's to the Left (with Arbitrary Integers)
You're given an array of integers. You need to shift all 1s to the left,
 while maintaining the relative order of other elements, except that all the 1s come first.
 */
package practice;

import java.util.stream.IntStream;
import java.util.Arrays;

public class shift1ToLeft {
    public static void main(String[] args) {
        int[] arr = {3,1,1,6,8,9,1,1,5,1};
        int[] result = new int[arr.length];
        int index=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                result[index++]=1;
            } 
        }
        for(int a :arr){
            if(a!=1){
               result[index++]=a;
            }
        }
        
        for(int r : result){
            System.out.print(r + " ");
        }

        int[] r= IntStream.concat(Arrays.stream(arr).filter(i-> i==1), Arrays.stream(arr).filter(i-> i!=1)).toArray();
        System.out.println(Arrays.toString(r));
        int[] r1= IntStream.concat(Arrays.stream(arr).filter(i-> i!=1), Arrays.stream(arr).filter(i-> i==1)).toArray();
        System.out.println(Arrays.toString(r1));

    }

    
}
