import java.util.ArrayList;

public class G10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(5);
        list.add(1);
        System.out.println(copyArray(list));
    }
    public static ArrayList<Integer> copyArray(ArrayList<Integer> list) {
        ArrayList<Integer> copiedArray = new ArrayList<>();
        for (Integer integer : list)
            copiedArray.add(integer);
        return copiedArray;
    }
}
