package interfejsComparator.zad1;

import java.util.Arrays;

public class TestOsoba {
    public static void main(String[] args) {
        Osoba[] tab = new Osoba[5];
        tab[0] = new Osoba("AA", 18, 112);
        tab[1] = new Osoba("BB", 21, 111);
        tab[2] = new Osoba("CC", 33, 183);
        tab[3] = new Osoba("DD", 44, 157);
        tab[4] = new Osoba("FF", 21, 172);
        Arrays.sort(tab, new wiekComparator());
        for(int i = 0; i < 5; i++){
            System.out.println(tab[i]);
        }
    }

}
