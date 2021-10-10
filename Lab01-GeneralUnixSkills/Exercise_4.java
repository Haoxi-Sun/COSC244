import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise_4{

    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        File file = new File("input.txt");
        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                String word = scanner.next();
                word = word.replaceAll("(\\W|^_)","").toLowerCase();
                list.add(word);
            }
        }catch(FileNotFoundException e){
            System.out.println("The file not found.");
        }
        Collections.sort(list);

        String pre = list.get(0);
        int count = 0;
        ArrayList<String> new_list = new ArrayList<String>();
        for(String s : list){
            if(!pre.equals(s)){
                new_list.add(String.valueOf(count)+" "+pre);
                count = 1;
                pre = s;
            }else{
                count++;
            }
        }

        Collections.sort(new_list);
        for(String i:new_list){
            System.out.println(i);
        }
    }

}
