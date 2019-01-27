package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;

public class ListTest3 {

    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        books.add(new String("轻量级Java EE企业应用实战"));
        books.add(new String("疯狂Java讲义"));
        books.add(new String("疯狂Android讲义"));
        books.add(new String("疯狂iOS讲义"));
        System.out.println(books);
        books.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(books);

        books.replaceAll(new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return String.valueOf(s.length());
            }
        });
        System.out.println(books);
    }

}
