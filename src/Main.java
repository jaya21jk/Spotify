import java.sql.SQLOutput;
import java.util.*;


public class Main {

    public static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Album1", "AC/DC");

        album.addSongToAlbum("Maro", 4.5);
        album.addSongToAlbum("Prema Vennela", 4.7);
        album.addSongToAlbum("Viillain", 5.0);

        albums.add(album);

        album = new Album("Album2", "Emenia");

        album.addSongToAlbum("Blunder", 4.5);
        album.addSongToAlbum("Drogon", 3.6);
        album.addSongToAlbum("Gangam", 5);

        albums.add(album);

        LinkedList<Song> playList_1 = new LinkedList<>();

        albums.get(0).addToPlayList("Maro", playList_1);
        albums.get(0).addToPlayList("Villain", playList_1);
        albums.get(1).addToPlayList("Blunder", playList_1);
        albums.get(1).addToPlayList("Drogon", playList_1);

        play(playList_1);


    }

    public static void play(LinkedList<Song> playList) {
        printMenu();

        System.out.println("Enter your option");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        ListIterator<Song> iterator = playList.listIterator();

        if(playList.size() > 0) {

            System.out.println("Playing the song" + playList.get(0).toString());
            printMenu();

        }
        else System.out.println("PlayList is empty");

    }
}