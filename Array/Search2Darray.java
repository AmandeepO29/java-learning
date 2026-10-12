package Array;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class Search2Darray {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int[][]arr=arrayUtility.input2DArray();
        System.out.println("Enter key to search : ");
        int key=input.nextInt();
        boolean isFound = Search(arr,key);
        if(isFound)
            System.out.println("element found in array ");
        else
            System.out.println("Element not found in array");
    }
    public static boolean Search(int[][]arr , int key){
        int i=0;
        while(i<arr.length){
            int j=0;
            while(j<arr.length){
                if(arr[i][j]==key){
                return true;
            }
            j++;
            }
            i++;
        }
        return false;
    }
}
