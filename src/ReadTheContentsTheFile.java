import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTheContentsTheFile {
    public static void main(String[] args) {
readFile();
    }
    public static void readFile(){
        File file= new File("C:\\Users\\Vural\\Desktop\\files\\students.txt");
        try {
            Scanner reader= new Scanner(file);
            while(reader.hasNextLine()){
                String line=reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
