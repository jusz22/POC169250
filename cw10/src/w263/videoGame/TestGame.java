package w263.videoGame;

import java.util.ArrayList;
import java.util.Collections;

public class TestGame {
    public static void main(String[] args) {
        ArrayList<Game> list = new ArrayList<>();
        list.add(new Game("dsa", "dsa", 3222, "AA"));
        list.add(new Game("dsa", "dsa", 2532, "BB"));
        list.add(new Game("dsa", "dsa", 2252, "CC"));
        list.add(new Game("dsa", "dsa", 2312, "DD"));
        list.add(new Game("dsa", "dsa", 2232, "A"));
        Collections.sort(list);
        for (var elem : list){
            System.out.println(elem);
        }

    }
}
