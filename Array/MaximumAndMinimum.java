package Array;

public class MaximumAndMinimum {
    public static void main(String[] args){
        // int a=Integer.MAX_VALUE;  THIS gives maximum possible integer
        // int b=Integer.MIN_VALUE;   THIS gives Minimum possible integer value
        int[] arr = arrayUtility.inputArray();
        int a= Max(arr);
        int b=Min(arr);
        System.out.println("Maximum and minimum elements of array are repectively :" + a +" and " + b);
    }

    public static int  Max(int[] arr){
        int i=0;
        int max=arr[0];
        while(i<arr.length){
            if(arr[i]>max){
                max=arr[i];
            }
            i++;
        }
        return max;
    }

    public static int Min(int[] arr){
        int i=0;
        int min=arr[0];
        while(i<arr.length){
            if(arr[i]<min){
                min=arr[i];
            }
            i++;
        }
        return min;
    }
}