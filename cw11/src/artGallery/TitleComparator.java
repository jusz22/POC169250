package artGallery;

import java.util.Comparator;

public class TitleComparator implements Comparator<Artwork> {

    public int compare(Artwork obj1, Artwork obj2){
        return obj1.getTitle().compareTo(obj2.getTitle());
    }
}
