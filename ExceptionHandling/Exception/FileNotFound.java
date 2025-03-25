package ExceptionHandling.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFound {
    public static void main(String[] args) {
        //FileNotFoundException
        try {
            //exception will come here: problem
            FileInputStream fis = new FileInputStream("Exception.java");
            System.out.println("File is found.");
        } catch (FileNotFoundException e){
            //we resolve the exception here: solution
            System.out.println(e.getMessage());
        }
        System.out.println("Program Ends!");
    }
}
