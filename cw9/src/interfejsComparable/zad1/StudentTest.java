package interfejsComparable.zad1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("Ala", 3, 1999));
        arrayList.add(new Student("Ola", 5, 2000));
        arrayList.add(new Student("Maciej", 3, 2002));
        arrayList.add(new Student("Dawid", 2, 2003));
        arrayList.add(new Student("Anna", 1, 2004));
        arrayList.add(new Student("Marcelina", 6, 2005));

        for(var elem: arrayList){
            System.out.println(elem);
        }

        Collections.sort(arrayList);
        System.out.println("");

        for(var elem: arrayList){
            System.out.println(elem);
        }

    }
}
