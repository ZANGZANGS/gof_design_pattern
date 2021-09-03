package gof.dp.prototype;

public class Song {
    private String singer;
    private String title;

    //생성자
    public Song(String singer, String title) {
        this.singer = singer;
        this.title = title;
    }

    /* getter, setter */
    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return title + "<" + singer + ">";
    }

}
