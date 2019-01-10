package io;

import java.io.File;
import java.io.FilenameFilter;

public class FilenameFilterTest {

    public static void main(String[] args) {
        File file = new File(".");
        String[] nameList = file.list(new MyFilternameFilter());
//        String[] nameList = file.list();
        for (String name : nameList) {
            System.out.println(name);
        }
    }

    static class MyFilternameFilter implements FilenameFilter {

        @Override
        public boolean accept(File dir, String name) {
            // 如果文件以.java结尾，或者文件对应一个路径，返回true
            return name.endsWith(".java") || new File(name).isDirectory();
        }
    }
}
