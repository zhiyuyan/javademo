package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

    public static void main(String[] args) {
        LinkedHashSet books = new LinkedHashSet();
        books.add("疯狂Java讲义");
        books.add("轻量级Java EE企业应用实战");
        System.out.println(books);
        // 删除疯狂Java讲义
        books.remove("疯狂Java讲义");
        // 重新添加疯狂java讲义
        books.add("疯狂Java讲义");
        System.out.println(books);
    }

}
