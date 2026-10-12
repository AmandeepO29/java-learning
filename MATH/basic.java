package MATH;

public class basic {
    public static void main(String[] args) {
        System.out.println(Math.abs(-99.3));
        System.out.println(Math.ceil(55.7));
        System.out.println(Math.floor(99.5));
        System.out.println(Math.round(66.456));
        System.out.println(Math.random());   
        // random  number between 0.0 and 1.0


        // now to generate random integerrrrrr numbers between 0 to 80 we will do the following !!!!!
        for(int i=0;i<=100;i++){
            int random=(int)Math.round(Math.random() * 80);
            System.out.println(random);
        }
        System.out.println(Math.PI);
    }
}
