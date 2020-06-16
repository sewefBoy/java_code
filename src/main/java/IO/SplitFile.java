package IO;

import java.io.*;
import java.util.ArrayList;

public class SplitFile {
    public static void main(String[] args) throws IOException {

        //获取路径
        File file = new File("E:/11/node02.log");
        //File outfile = new File("E://20200528.log");
        System.out.println(file);
        //判断文件是否存在、并且有内容
        if(file.exists() && !(file.exists() && file.length() == 0)) {
            System.out.println("文件存在并且有内容");

            String str = null;
            try {
                //BufferedReader是可以按行读取文件
                FileInputStream inputStream = new FileInputStream(file);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

                File outfile = new File("E:/11/node/node0.log");
                FileOutputStream fileOutputStream = new FileOutputStream(outfile);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bw = new BufferedWriter(outputStreamWriter);

                int b = 0;
                int i = 0;
                while((str = bufferedReader.readLine()) != null){
                    i++;
                    if(i == 10000){
                        b++;
                        outfile = new File("E:/11/node/node"+b+".log");
                        fileOutputStream = new FileOutputStream(outfile);
                        outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                        bw = new BufferedWriter(outputStreamWriter);
                        i = 0;
                    }

                    bw.write(str);
                    bw.newLine();
                    bw.flush();
                }
                bufferedReader.close();
                inputStream.close();
                bw.close();
                outputStreamWriter.close();
                fileOutputStream.close();
                System.out.println("切割结束");
                //file.delete();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("文件不存在、或者文件无内容");

        }

    }

}
