public class D10 {
    public static void main(String[] args) {
        System.out.println(weird(1110));
    }
    public static int weird(int n){
        String s = Integer.toString(n);
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '1')
                return 0;
        }
        return 1;
    }
}
