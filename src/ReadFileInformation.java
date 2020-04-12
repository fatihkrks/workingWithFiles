import java.io.File;
import java.io.IOException;

public class ReadFileInformation {

    public static void main(String[] args) {
createFile();
        getFileInfo();

    }
    public static void createFile(){
        File file= new File("C:\\Users\\Vural\\Desktop\\files\\students.txt");
        try {
            if (file.createNewFile()){
                System.out.println("Dosya Oluşturuldu");
            }
            else{
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void getFileInfo(){
        File file=new File("C:\\Users\\Vural\\Desktop\\files\\students.txt");
        if (file.exists()){
            System.out.println("Dosya adı :" + file.getName()); //file name read
            System.out.println("Dosya yolu : " + file.getAbsolutePath()); //file path
        }
    }
}
