package Bishnoi.Aman.fileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class reader {
    static void main(String[] args) {
        String fileName = "aman-0001.txt" ;
        int read = 0 ;
        try(FileReader reader = new FileReader(fileName)){
            do{
                read = reader.read();
                System.out.print((char) read);
            }while(read != -1) ;
        }
        catch (FileNotFoundException ee){
            System.out.printf("%s not found !!!" , fileName);
        }
        catch (IOException e) {
            System.out.printf(" exception occurred %s" ,e.getMessage() );
        }
    }
}