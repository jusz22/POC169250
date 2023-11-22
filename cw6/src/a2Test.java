import pl.edu.uwm.a2.Vector;

import java.util.ArrayList;

public class a2Test {
    public static void main(String[] args) {
        Vector vector1 = new Vector();
        ArrayList<Vector> vectors = new ArrayList<>();
        vectors.add(vector1);
        vectors.get(0).loadFile();
    }

}
