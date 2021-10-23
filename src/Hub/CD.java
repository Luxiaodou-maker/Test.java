package Hub;

public class CD {
    private String title;
    private String artist;
    private int numfTracks;
    private int playingTime;
    private boolean gotIt=false;
    private String comment;
    public CD(String title , String artist, int numfTracks, int playingTime, String comment){
        super();
        this.title=title;
        this.artist=artist;
        this.numfTracks=numfTracks;
        this.playingTime=playingTime;
        this.comment=comment;
    }

    public void print() {
        System.out.println(title+":"+artist);
    }
}
