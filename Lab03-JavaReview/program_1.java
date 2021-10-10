import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;

public class program_1{
    public static void main(String[]args){

        File file = new File("text.txt");
        FileInputStream fis = null;

        try{
            fis = new FileInputStream(file);
            int content;

            while((content = fis.read())!=-1){
                System.out.write(content);
            }
        }catch(IOException e){
            System.out.println("Error");
        }
    }
}
