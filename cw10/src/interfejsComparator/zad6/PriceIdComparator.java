package interfejsComparator.zad6;

import java.util.Comparator;

public class PriceIdComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if (Double.compare(o1.getPrice(), o2.getPrice()) != 0) {
            return Double.compare(o1.getPrice(), o2.getPrice());
        }
        return Integer.compare(o1.getId(), o2.getId());
    }
}
