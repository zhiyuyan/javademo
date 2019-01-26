package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        Collection<String> books = new HashSet<>();
        books.add(new String("轻量级Java EE企业应用实战"));
        books.add(new String("疯狂Java讲义"));
        books.add(new String("疯狂iOS讲义"));
        books.add(new String("疯狂Ajax讲义"));
        books.add(new String("疯狂Android讲义"));
        books.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() < 10;
            }
        });
        System.out.println(books);
    }

}
