package Array;

import java.util.Scanner;

public class arrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements in array :");
        int size=input.nextInt();
        int[] arr= new int[size];
        int i=0;
        while (i<size) {
            System.out.println("please enter element no. " + (i+1));
            arr[i]=input.nextInt();
            i++;
        }
        return arr;
    }
    public static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows and columns in array :");
        int rows=input.nextInt();
        int columns=input.nextInt();
        int[][] arr= new int[rows][columns];
        int i=0;
        while (i<rows) {
            int j=0;
            while(j<columns){
                System.out.println("please enter element of row  " + (i+1)+ " and column "+ j );
                arr[i][j]=input.nextInt();
                j++;
        }
        i++;
    }
        return arr;
    }
}

