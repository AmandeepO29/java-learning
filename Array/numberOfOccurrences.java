package Array;

import java.util.Scanner;

public class numberOfOccurrences {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int[] arr= arrayUtility.inputArray();
        System.out.println("Enter element to find number of occurrences : " );
        int key = input.nextInt();
        int a =ocurences(arr, key);
        System.out.println(" element "+ key + " was found "+ a + " times in array");
    }
    public static int ocurences (int[] arr , int key){
        int i=0;
        int j=0;
        while(i<arr.length){
            if (arr[i]==key){
                j+=1;
            }
            i++;
        }
        return j;
    }
}
