@Repository
public class SongRepository {
    private List<Song> list = new ArrayList<Song>();


    public SongRepository() {
        list.add(new Song(1, "Bohemian Rhapsody", "Queen", "A Night at the Opera", "1975"));
        list.add(new Song(2, "Imagine", "John Lennon", "Imagine", "1971"));
    }

    public List<Song> getAllSongs() {
        return list;
    }

    public Song getSongById(Integer id) {
        // TODO
        for (Song song : list) {
            if (song.getId().equals(id)) {
                return song;
            }
        }
    }

    public void addSong(Song s) {
        // TODO
        list.add(s);
    }

    public void updateSong(Song s) {
        // TODO

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(s.getId())) {
                list.set(i, s);
                return;
            }
        }
        list.add(s);
    }

    public void removeSong(Song s) {
        // TODO
        list.removeIf(song -> song.getId().equals(s.getId()));
    }
}