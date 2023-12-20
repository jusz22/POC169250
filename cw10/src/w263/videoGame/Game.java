package w263.videoGame;

public class Game implements Comparable{
    private String title;
    private String developer;
    private int yearReleased;
    private String genre;

    public Game(String title, String developer, int yearReleased, String genre) {
        this.title = title;
        this.developer = developer;
        this.yearReleased = yearReleased;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", developer='" + developer + '\'' +
                ", yearReleased=" + yearReleased +
                ", genre='" + genre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Game game = (Game) o;
        return this.genre.compareTo(game.genre);
    }
}
