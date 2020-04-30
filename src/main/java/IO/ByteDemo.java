package IO;


import java.io.*;

public class ByteDemo {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream("D:/a.txt");
            os = new FileOutputStream("D:/b.txt");

            byte[] bytes = new byte[1024];
            int length = 0;
            while((length = is.read(bytes)) != -1){
                os.write(new String(bytes,0,length).getBytes());
            }
            os.flush();
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
