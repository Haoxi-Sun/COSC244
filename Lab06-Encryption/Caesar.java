import java.io.*;
import java.util.Scanner;

public class Caesar{
    public static void main(String[] args) throws FileNotFoundException, IOException{
        String size = args[0];
        int shift = Integer.parseInt(size);
        InputStreamReader input = new InputStreamReader(System.in);
        String string= "";
        int code;

        while ((code = input.read())!=-1){
            string += (char)code;
        }
        System.out.print(encrypt(string, shift));
    }

    public static String encrypt(String words, int shift){
        String r = "";

        for(int i=0; i<words.length(); i++){
            if((int)words.charAt(i) < 255){
                char ch = (char)((int)words.charAt(i)+shift);

                r += Character.toString(ch);
            }else{
                char ch = (char)((int)words.charAt(i)-255+shift);

                r += Character.toString(ch);
            }
        }
        return r;
    }
}
