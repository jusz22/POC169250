import java.util.Random;

public class E1 {
    public static void main(String[] args) {
        System.out.println(generateRandomInt());
    }
    public static int generateRandomInt(){
        Random rand = new Random();
         int int_rand = rand.nextInt(101);
        return int_rand;
    }
}
