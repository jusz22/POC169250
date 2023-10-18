public class H3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Styrta Sie Pali ");
        System.out.println(noSpaceString(sb));
    }
    public static StringBuffer noSpaceString(StringBuffer word){
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == ' ')
                word.deleteCharAt(i);
        }
        return word;
    }
}
