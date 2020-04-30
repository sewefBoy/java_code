package IO;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import java.io.*;

public class IoTest {
    public static void main(String[] args) {
        //FileStream();
//        audioStream();
//        byteArrayStream();
        //bufferWriter();
        readLine();
    }

    private static void bufferWriter() {
        File file = new File("虞美人.txt");
        if(file.exists()){
            file.delete();
        }
        try{
            file.createNewFile();
        } catch (IOException e){
            e.printStackTrace();
        }
        String str = "《虞美人》\n" +
                " 春花秋月何时了?\n" +
                " 往事知多少。\n" +
                " 小楼昨夜又东风，\n" +
                " 故国不堪回首月明中。\n" +
                " 雕栏玉砌应犹在，\n" +
                " 只是朱颜改。\n" +
                " 问君能有几多愁？\n" +
                " 恰似一江春水向东流。";
        BufferedWriter bw = null;
        BufferedReader br = null;
        try{
            bw = new BufferedWriter(new FileWriter(file));
            bw.write(str);
            bw.flush();
            char[] cbuf = new char[1024];
            br = new BufferedReader(new FileReader(file));
            int length = 0;
            while((length = br.read(cbuf,0,cbuf.length)) != -1){
                System.out.println(new String(cbuf,0,length));
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private static void byteArrayStream(){
        ByteArrayInputStream bais = null;
        InputStream is = null;
        byte[] buffer = new byte[1024];
        int length = 0;
        try {
            is = new FileInputStream("a.txt");
            while((length = is.read(buffer)) != -1){
                System.out.println(new String(buffer));
            }
            bais = new ByteArrayInputStream(buffer);
            byte[] buffer1 = new byte[1024];
            bais.read(buffer1);
            System.out.println(new String(buffer1));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void audioStream(){
        AudioInputStream ais = null;
        InputStream is = null;

        try {
            is = new FileInputStream("E:/BaiduNetdiskDownload/常老师springcloud/Jay周周所有歌曲 - 最全/第十四张 周杰伦的床边故事/MP3/周杰伦 - 英雄.mp3");
            ais = new AudioInputStream(is, new AudioFormat(AudioFormat.Encoding.ALAW,1024,1024,1024,1024,1024,true), is.available());
            byte[] buffer = new byte[1024];
            int length = 0;
            while((length = ais.read(buffer)) != -1){
                System.out.println(new String(buffer));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void FileStream() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:\\jdk api 1.8.CHM");
            fos = new FileOutputStream("jdk api 1.8.CHM");
            byte[] buffer = new byte[1024];
            int length = 0;
            while((length = fis.read(buffer))!=-1){
                fos.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void readLine(){
        File file = new File("C:\\Users\\12248\\Desktop\\新建文本文档1.txt");

        BufferedWriter bw = null;
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(file));
            bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\12248\\Desktop\\新建文本文档2.txt")));

            String line = "";
            while ((line = br.readLine()) != null) {
                if(line.length() == 0){
//                    bw.write("");
//                    bw.newLine();
                    System.out.println("--"+line);
                }
                else{
                    bw.write(new String(line.getBytes(),"UTF-8")+";");
                    bw.newLine();
                    System.out.println("++"+line);
                }
            }
            bw.flush();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
