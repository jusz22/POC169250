public class H17 {
    public static void main(String[] args) {
        StringBuffer word = new StringBuffer();
        word.append("lalalalalalla");
        System.out.println(capitalizeEverySecond(word));
    }
    public static StringBuffer capitalizeEverySecond(StringBuffer word){
        for(int i = 1; i < word.length(); i+=2){
            char c = word.charAt(i);
            word.setCharAt(i, Character.toUpperCase(c));
        }
        return word;
    }
}
