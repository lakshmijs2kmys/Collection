package practice;

public class palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String rev = new StringBuilder(str).reverse().toString();
        if(str.equals(rev)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }

        int left = 0;
        int right = str.length() -1;
        boolean p = true;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                p= false;
            }
            left++;
            right--;
        }
        System.out.println(str + " is palindrome: " + p);

        int n= 12321;
        int original = n;
        int reversed =0;
        while(n!=0){
            int digit = n %10;
            reversed = reversed *10 + digit;
            n= n/10;
        }
        if(original == reversed){
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
        int[] arr = {1,2,3,2,1};
        boolean isPalin = true; 
        int i=0, j= arr.length -1;
        while(i<j){
            if(arr[i] != arr[j]){
                isPalin = false;
                break;
            }
            i++;
            j--;
        }   
        System.out.println("Array is palindrome: " + isPalin);


    }
}
