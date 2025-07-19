package com;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Song> allSongs;
    private List<Playlist> playlists;
    

    public MusicPlayer() {
        this.allSongs = new ArrayList<>();
        this.playlists = new ArrayList<>();
       
    }

    // 1. Add Song
    public void addSong(Song song) {
        allSongs.add(song);
        System.out.println("Song added: " + song.getTitle());
    }

    // 2. Update Song
    public void updateSong(String title, Song updatedSong) {
        for (int i = 0; i < allSongs.size(); i++) {
            if (allSongs.get(i).getTitle().equalsIgnoreCase(title)) {
                allSongs.set(i, updatedSong);
                System.out.println("Song updated: " + updatedSong.getTitle());
                return;
            }
        }
        System.out.println("Song not found: " + title);
    }

    // 3. Delete Song
    public void deleteSong(String title) {
        boolean removed = allSongs.removeIf(song -> song.getTitle().equalsIgnoreCase(title));
        if (removed) {
            System.out.println("Song deleted: " + title);
        } else {
            System.out.println("Song not found: " + title);
        }
    }

    // 4. Display All Songs
    public void displayAllSongs() {
        if (allSongs.isEmpty()) {
            System.out.println("No songs found.");
        } else {
            System.out.println("All Songs:");
            for (Song song : allSongs) {
                System.out.println("- " + song.getTitle());
            }
        }
    }

    // 5. Create Playlist
    public void createPlaylist(String name) {
        playlists.add(new Playlist(playlists.size() + 1, name));
        System.out.println("Playlist created: " + name);
    }
    
    

    // 6. Add Song to Playlist
    
    public void addSongToPlaylist(String playlistName, Song song) {
        Playlist playlist = getplaylist(playlistName);

        if (playlist == null) {
            System.out.println("Playlist not found.");
        } else {
            playlist.addSong(song);
            System.out.println("Song added to playlist: " + playlistName);
        }
    }

    

    // 7. Delete Playlist
    public void deletePlaylist(String name) {
        boolean removed = playlists.removeIf(playlist -> playlist.getPlaylistName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println("Playlist deleted: " + name);
        } else {
            System.out.println("Playlist not found: " + name);
        }
    }
    

    // 8. Play Playlist
    public void playPlaylist(String name) {
        for (Playlist playlist : playlists) {
            if (playlist.getPlaylistName().equalsIgnoreCase(name)) {
                if (playlist.getSongs().isEmpty()) {
                    System.out.println("Playlist '" + name + "' is empty.");
                } else {
                    System.out.println("Playing playlist: " + name);
                    for (Song song : playlist.getSongs()) {
                        System.out.println("Playing: " + song.getTitle());
                    }
                }
                return;
            }
        }
        System.out.println("Playlist not found: " + name);
    }

    // 9. Get Playlist
    public Playlist getplaylist(String name) {
        for (Playlist playlist : playlists) {
            if (playlist.getPlaylistName().equalsIgnoreCase(name)) {
                return playlist;
            }
        }
        System.out.println("Playlist not found: " + name);
        return null;
    }

    // 10. Display All Playlists
    public void displayAllPlaylists() {
        if (playlists.isEmpty()) {
            System.out.println("No playlists found.");
            return;
        }
        System.out.println("All Playlists:");
        for (Playlist playlist : playlists) {
            System.out.println("- " + playlist.getPlaylistName());
        }
    }

    // 11. Get Song by Title
    public Song getSongByTitle(String title) {
        for (Song song : allSongs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                return song;
            }
        }
        return null;
    }

}
