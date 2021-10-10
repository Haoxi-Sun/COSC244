import java.io.*;

public class program_2{
    public static void main(String[]args){
        BufferedReader buffer = null;

        try{
            String line;
            buffer = new BufferedReader(new FileReader("text.txt"));

            while((line = buffer.readLine())!=null){
                StringBuilder sb = new StringBuilder(line);
                System.out.println(sb.reverse());
            }
        }catch(IOException e){
            System.out.println("Error");
        }
    }
}
