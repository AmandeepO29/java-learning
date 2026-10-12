package Array;

import java.util.Scanner;

public class sumAndAverage {
    public static void main(String[] args){
        int[] ar =arrayUtility.inputArray();
        long sum = sum(ar);
        int average = average(ar);
        System.out.println("Sum of array is : " + sum);
        System.out.println("Average of array is :"+ average);
    }
    public static long sum(int[] ar){
        long sum=0;
        int i=0;
        while(i<ar.length){
            sum+=ar[i];
            i++;
        }
        return sum;
    }

    public static int average(int[] ar){
        long sum=sum(ar);
        return (int) (sum/(ar.length));
    }
}