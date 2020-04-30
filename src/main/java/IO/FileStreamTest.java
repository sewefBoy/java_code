package IO;

import java.io.*;

public class FileStreamTest {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream("a.txt");
            os = new FileOutputStream("b.txt");
            byte[] buffer = new byte[1024];
            int length = 0;
            while ((length = is.read(buffer)) != -1){
                os.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
