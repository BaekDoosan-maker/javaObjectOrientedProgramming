import java.io.FileOutputStream;
import java.io.IOException;

public class Main03 {
    public static void main(String[] args)  {
        try(FileOutputStream out = new FileOutputStream("test.txt")){
            out.write("Hello Sparta".getBytes());
            out.flush();
        }catch(IOException e){
            System.out.println("IOEXeption 발생: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
