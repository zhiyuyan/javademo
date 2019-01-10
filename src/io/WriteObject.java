package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {
        ObjectOutputStream oos = null;

        try {
            // 创建一个ObjectOutputStream输出流
            oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
            Person person = new Person("孙悟空", 500);
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
