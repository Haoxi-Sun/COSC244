import java.io.*;
import java.util.Scanner;

public class BitLevel{
    public static void main(String[]args) throws FileNotFoundException, IOException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter key: ");
        byte[] key = scan.nextLine().getBytes();

        FileInputStream input = new FileInputStream(args[0]);
        FileOutputStream output = new FileOutputStream(args[1]);

        int code;
        String string = "";
        int i = 0;

        while((code=input.read())!=-1){
            output.write((byte)code ^ key[i]);
            i++;
            if(i==key.length) i=0;
            
        }
    }
}
