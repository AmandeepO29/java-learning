package toString_method;

public class stringManipulation {
    public static void main(String[] args) {
        String firstName = "Amandeep" ;
        String lastName =" Bishnoi" ;
        String fullName = firstName.concat(" ").concat(lastName) ;
        // System.out.printf(" Full name in uppercase is %S" , fullName);
        System.out.println(fullName.toUpperCase()); 

        // both ways have performed same action
}
}
