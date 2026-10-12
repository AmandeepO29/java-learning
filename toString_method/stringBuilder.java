package toString_method;

import java.util.Scanner;

public class stringBuilder {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String[] arr= new String[] {
            "My " ," name ","is" ," AMANDEEP"
        };
        StringBuilder str= new StringBuilder();
        for (String sb : arr) {
            str.append(sb).append(" ");
        }
        System.out.println(str);
    }
}
