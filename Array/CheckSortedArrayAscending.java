package Array;

public class CheckSortedArrayAscending {
    public static void main( String[ ] args){
        int[] arr=arrayUtility.inputArray();
        Sortness(arr);
    }
    public static void Sortness(int[] arr){
        int i=0;
        int j=0;
        while(i<((arr.length) -1)){
            if(arr[i]<arr[i+1]){
                j+=1;
            }
            i++;
            }

        if(j==arr.length -1){
            System.out.println("array is sorted");
        }
        else
            System.out.println("array is unsorted");
    }
}


