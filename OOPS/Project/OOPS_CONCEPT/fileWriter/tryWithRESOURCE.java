package fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class tryWithRESOURCE {
    public static void main(String[] args)  {
        String fileName = "aman-0001.txt" ;
        try(FileWriter writer = new FileWriter(fileName)){
             ; // this is IO Exceptionnnnn ,, to handle this
            // try-catch can also be used...
            writer.write("I'm AMANDEEP ");
            writer.flush();
            System.out.println("file written successfully ");
        }
        catch(IOException e ){
            System.out.printf("occurred exception is %s" ,e.getMessage() );
        }


    }
}
