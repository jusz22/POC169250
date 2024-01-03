package artGallery;

public class Artwork {
    private int artworkId;
    private String title;
    private String aritstName;

    public Artwork(int artworkId, String title, String aritstName) {
        this.artworkId = artworkId;
        this.title = title;
        this.aritstName = aritstName;
    }

    public int getArtworkId() {
        return artworkId;
    }

    public String getTitle() {
        return title;
    }

    public String getAritstName() {
        return aritstName;
    }

    @Override
    public String toString() {
        return "Artwork{" +
                "artworkId=" + artworkId +
                ", title='" + title + '\'' +
                ", aritstName='" + aritstName + '\'' +
                '}';
    }
}
