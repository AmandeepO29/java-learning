package challenges;

public class concatenateString {
    public static String concatenate(String ... str){
        String s;
        StringBuilder sb = new StringBuilder();
        for (String i : str) {
            sb.append(i).append(" ");

        }
        return sb.toString();
    }
     static void main(String[] args) {
        System.out.println(concatenate("prashant"));
        System.out.println(concatenate("aman" ,"deep" ,"bishnoi"));

    }
}
