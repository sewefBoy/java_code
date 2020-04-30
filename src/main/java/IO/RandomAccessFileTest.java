package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    /**
     * @param file      要读取的文件
     * @param blockSize 每块文件大小
     */
    public static void readFile(File file, int blockSize) {
        long fileSize = file.length();
        int blockNum = (int) Math.ceil(fileSize / blockSize);//分割多少块

        int beginPos = 0;
        int actualSize = (int) (blockSize > fileSize ? fileSize : blockSize);
        for (int i = 0; i < blockNum; i++) {
            beginPos = i * blockSize;
            if (i == blockNum - 1) {
                actualSize = (int) fileSize;
            } else {
                actualSize = blockSize;
                fileSize -= actualSize;
            }
            System.out.println(i + "---》起始位置是：" + beginPos + "---->读取的大小是：" + actualSize);

            readSplit(file, beginPos, actualSize);
        }
    }

    private static void readSplit(File file, int beginPos, int actualSize) {
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
            //表示从哪个偏移量开始读取数据
            randomAccessFile.seek(beginPos);
            byte[] buffer = new byte[1024];
            int length = 0;
            while ((length = randomAccessFile.read(buffer)) != -1) {
                if (actualSize > length) {
                    //System.out.println(new String(buffer, 0, length));
                    actualSize -= length;
                } else {
                    //System.out.println(new String(buffer, 0, actualSize));
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //File file = new File("d://applicationNode.properties");
        //readFile(file, 1024);

        if(false || true && true && true && true && true){
            System.out.println("qewrqwer");
        }
    }
}
