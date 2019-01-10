package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // 创建字节输入流
            fis = new FileInputStream("src\\io\\FileOutputStreamTest.java");
            // 创建字节输出流
            fos = new FileOutputStream("newFile.txt");
            byte[] bbuf = new byte[32];
            int hasRead = 0;
            // 循环从输入流中取出数据
            while ((hasRead = fis.read(bbuf)) > 0) {
                // 每读取一次，即写入文件输出流，读多少，写多少
                fos.write(bbuf, 0, hasRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 使用finally块来关闭文件输入流
            if (fis != null) {
                fis.close();
            }
            // 使用finally块来关闭文件输出流
            if (fos != null) {
                fos.close();
            }
        }
    }

}
