package artGallery;

import java.util.Comparator;

public class ArtworkIdComparator implements Comparator<Artwork> {
    @Override
    public int compare(Artwork obj1, Artwork obj2){
        return Integer.compare(obj1.getArtworkId(), obj2.getArtworkId());

    }
}
