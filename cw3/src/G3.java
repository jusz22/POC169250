import java.util.ArrayList;

public class G3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(7);
        list.add(4);
        System.out.println(minimumValue(list));
    }
    public static int minimumValue(ArrayList<Integer> list1){
        int temp = list1.get(0);
        for (Integer integer : list1) {
            if (temp > integer)
                temp = integer;
        }
        return temp;
    }
}
