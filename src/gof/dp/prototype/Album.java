package gof.dp.prototype;

import java.util.ArrayList;

public class Album implements Cloneable{
    private ArrayList<Song> album;

    public Album(){
        album = new ArrayList<Song>();
    }

    public ArrayList<Song> getAlbum() {
        return album;
    }

    public void setAlbum(ArrayList<Song> album) {
        this.album = album;
    }

    public void addAlbum(Song song){
        album.add(song);
    }

    public String toString(){
        return album.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Album cloneAlbum = new Album();

        for (Song song: album) {
            cloneAlbum.addAlbum(song);
        }

        return cloneAlbum;
    }
}
