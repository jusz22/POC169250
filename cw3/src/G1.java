import java.util.ArrayList;

public class G1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            list1.add(i);
        }
        for(int j = 9; j >=0; j--){
            System.out.println(list1.get(j));
        }
    }

}
