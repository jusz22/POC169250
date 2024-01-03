package artGallery;

import java.util.Arrays;

public class TestArtwork {
    public static void main(String[] args) {
        Artwork tab[] = new Artwork[5];
        tab[0] = new Artwork(1, "Sloneczniki", "Van Gogh");
        tab[1] = new Artwork(2, "Mona Lisa", "Da Vinci");
        tab[2] = new Artwork(3, "Scream", "idk");

        Arrays.sort(tab, new TitleComparator());
        for (Artwork elem : tab) {
            System.out.println(elem);
        }

    }
}
