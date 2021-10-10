import java.io.*;
import java.util.Scanner;

public class program_3{
    public static void main(String[]args){
        File file = new File("text.txt");
        Scanner scan = null;

        try{
            scan = new Scanner(file);
            String line;
            while(scan.hasNextLine()){
                line = scan.nextLine();
                System.out.println(line.toUpperCase());
            }
        }catch(IOException e){
            System.out.println("Error");
        }
    }
}
