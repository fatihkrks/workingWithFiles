import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {
    public static void main(String[] args) {
writeFile();
    }
    public static void writeFile(){
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\Vural\\Desktop\\files\\students.txt",true));
            writer.newLine();
            writer.write("Selam");
            System.out.println("Dosyaya yazıldı .");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
