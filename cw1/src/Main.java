public class Main {
    public static void main(String[] args) {
        System.out.println(szereg(5));
    }

    public static int szereg(int n){
        int a = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0)
                a = a + i;
            else
                a = a - i ;
        }
        return a;
    }
}