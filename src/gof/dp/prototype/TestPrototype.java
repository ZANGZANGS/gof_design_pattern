package gof.dp.prototype;

public class TestPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Album album = new Album();

        album.addAlbum(new Song("BTS", "dynamite"));
        album.addAlbum(new Song("aespa", "next level"));
        album.addAlbum(new Song("akmu(whith iu)", "낙하"));

        System.out.println(album.toString());

        Album album2 = (Album)album.clone();

        album2.addAlbum(new Song("이무진", "신호등"));

        System.out.println("===== 앨범 깊은 복사 후 =====");
        System.out.println(album.toString());
        System.out.println(album2.toString());

    }

}
