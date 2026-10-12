package collection;

import java.util.Collection;

public class utility {
    public static  void print (Collection collection){
        System.out.println("Collection is : ");
        for (Object coll : collection) {
            System.out.printf("%s \n" , coll.toString());
        }
        
    }
}
