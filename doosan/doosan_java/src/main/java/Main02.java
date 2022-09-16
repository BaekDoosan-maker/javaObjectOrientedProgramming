import java.io.FileOutputStream;
import java.io.IOException;

public class Main02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("test.txt");
        try {
            out.write("Hello Sparta".getBytes());
            out.flush();

        } catch (IOException e) {
            System.out.println("IOEXception 발생 : " + e.getMessage());
            e.printStackTrace();
        }
        out.close();
    }
}

