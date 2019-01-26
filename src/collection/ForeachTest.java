package collection;

import java.util.Collection;
import java.util.HashSet;

public class ForeachTest {
    public static void main(String[] args) {
        // 创建集合
        Collection<String> books = new HashSet<>();
        books.add("轻量级Java EE企业应用实战");
        books.add("疯狂Java讲义");
        books.add("疯狂Android讲义");

        for (String book : books) {
            System.out.println(book);
            if (book.equals("疯狂Android讲义")) {
                books.remove(book);
            }
        }
        System.out.println(books);

    }
}
