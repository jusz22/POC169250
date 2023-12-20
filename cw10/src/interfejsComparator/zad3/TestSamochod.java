package interfejsComparator.zad3;

import java.util.Arrays;

public class TestSamochod {
    public static void main(String[] args) {
        Samochod[] tab = new Samochod[5];
        tab[0] = new Samochod("AA", 1927, 22242);
        tab[1] = new Samochod("BB", 2000, 22252);
        tab[2] = new Samochod("CC", 1927, 22212);
        tab[3] = new Samochod("DD", 1922, 22242);
        tab[4] = new Samochod("AA", 1934, 22262);
        Arrays.sort(tab, new rokProdukcjiComparator());
        for (int i = 0; i < 5; i++) {
            System.out.println(tab[i]);
        }
    }
}
