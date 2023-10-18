public class H8 {
    public static void main(String[] args) {
        String mainS = "alabama";
        String prefS = "ala";
        String sufiS = "bamasd";
        StartsEndsWith(prefS, sufiS, mainS);
    }
    public static void StartsEndsWith(String pref, String sufi, String main){
        if(main.startsWith(pref) && main.endsWith(sufi)){
            System.out.println("Napis zaczyna sie od prefiksu i konczy na sufiksie.");
        }
        else if (main.startsWith(pref))
            System.out.println("Napis zaczyna sie od prefiksu i nie konczy na sufiksie.");
        else if (main.endsWith(sufi))
            System.out.println("Napis konczy sie sufiksem i nie zaczyna na prefiksie.");
        else
            System.out.println("Napis nie zaczyna sie prefiksem i nie konczy na sufiksie.");
    }
}
