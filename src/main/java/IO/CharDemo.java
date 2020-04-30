package IO;

import java.io.*;

public class CharDemo {
    public static void main(String[] args) {
        Reader reader = null;
        Writer wirte = null;

        try {
            reader = new FileReader("D:/a.txt");
            wirte = new FileWriter("D:/c.txt");
            char[] chars = new char[1024];
            int length = 0;
            while ((length = reader.read(chars)) != -1){
                wirte.write(chars);
            }
            wirte.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                wirte.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
