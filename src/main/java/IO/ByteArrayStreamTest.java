package IO;

import java.io.*;

public class ByteArrayStreamTest {
    public static void main(String[] args) {
        InputStream is = null;
        ByteArrayInputStream bais = null;
        ByteArrayOutputStream baos = null;
        try {
            is = new FileInputStream("a.txt");
            baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            is.read(buffer);
            bais = new ByteArrayInputStream(buffer);
            byte[] buffer2 = new byte[1024];
            bais.read(buffer2);
            baos.write(buffer2);
            System.out.println(baos.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                baos.close();
                bais.close();
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
