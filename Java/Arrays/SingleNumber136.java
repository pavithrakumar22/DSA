//Q.Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//Approach:Bitwise XOR
//we know that 0^0=0 and 1^1=0 that means xor of any two numbers is zero
//we also know that 0^1=1 and 1^0=1 that means xor of any number with zero is the number itself
//therefore as given there is only one number which is single and rest all numbers are repeating twice therefore xor of numbers which are repeating twice becomes zero and the xor of single number and zero will turn out the number itself and in this way we can get our answer
//Time Complexity:O(N)=>for-each loop
//Space Complexity:O(1)



import java.util.Scanner;
import java.util.ArrayList;

class SingleNumber136{
    static int singleNumber(int[] n){
        int res=0;
        for(int i: n){
            res^=i;
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,1,3,4,5};
        int ans=singleNumber(arr);
        System.out.println("The single Number present in the array is "+ans);
    }
}
