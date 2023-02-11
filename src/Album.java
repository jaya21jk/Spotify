import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String ArtistName;

    ArrayList<Song> songs;

    public Album(String name, String artistName) {
        this.name = name;
        ArtistName = artistName;
        this.songs = new ArrayList<>(); // Initialize the arrayList when it calls constructor
    }

    public boolean findSong(String title) {

        for(Song song : songs) {

            if(song.getTitle().equals(title)) return true;

        }

        return false;
    }

    public void addSongToAlbum(String title, double duration) {

        if(findSong(title)) {
            System.out.println("This song is already present");
        }
        else{
            songs.add(new Song(title, duration));
            System.out.println("New song is Added");
        }

        return;

    }

    public void addToPlayList(int trackNo, LinkedList<Song> playList) {

        int index = trackNo - 1;

        if(index >= 0 && index < songs.size()) {

            Song song = this.songs.get(index);

            playList.add(song);

        }



    }

    public void addToPlayList(String title, LinkedList<Song> playList) {

        for(Song song : this.songs) {

            if(song.getTitle().equals(title)) {

                playList.add(song);

            }

        }

    }

}


