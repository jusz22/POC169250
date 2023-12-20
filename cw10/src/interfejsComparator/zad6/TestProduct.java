package interfejsComparator.zad6;

import java.util.ArrayList;

public class TestProduct {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(54, "aa", 1222));
        list.add(new Product(21, "bb", 1932));
        list.add(new Product(12, "cc", 1932));
        list.add(new Product(33, "dd", 1342));
        list.add(new Product(11, "ee", 1512));

        list.sort(new PriceIdComparator());
        for (var elem:
             list) {
            System.out.println(elem);
        }

    }
}
