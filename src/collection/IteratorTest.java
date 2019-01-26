package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {

    public static void main(String[] args) {
        // 创建集合
        Collection<Book> books = new HashSet<>();
        books.add(new Book("轻量级Java EE企业应用实战"));
        books.add(new Book("疯狂Java讲义"));
        books.add(new Book("疯狂Android讲义"));

        // 获取books集合对应的迭代器
        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.name);
            book.name = "测试字符串";
        }
        it = books.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.name);
        }
    }

    static class Book {
        String name;

        Book(String name) {
            this.name = name;
        }
    }

}
