package IO;

import java.io.*;
import java.util.ArrayList;

public class SplitFile {
    public static void main(String[] args) throws IOException {

        //��ȡ·��
        File file = new File("E:\\11\\node.log");
        //File outfile = new File("E://20200528.log");
        System.out.println(file);
        //�ж��ļ��Ƿ���ڡ�����������
        if(file.exists() && !(file.exists() && file.length() == 0)) {
            System.out.println("�ļ����ڲ���������");

            String str = null;
            try {
                //BufferedReader�ǿ��԰��ж�ȡ�ļ�
                FileInputStream inputStream = new FileInputStream(file);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

                File outfile = new File("E:\\11\\node\\node.log");
                FileOutputStream fileOutputStream = new FileOutputStream(outfile);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bw = new BufferedWriter(outputStreamWriter);

                int b = 0;
                int i = 0;
                while((str = bufferedReader.readLine()) != null){
                    i++;
                    if(i == 30000){
                        b++;
                        outfile = new File("E:\\11\\node\\node"+b+".log");
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
                System.out.println("�и����");
                //file.delete();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("�ļ������ڡ������ļ�������");

        }

    }

}
