package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Playlist implements Playable {

    private int playlistId;
    private String playlistName;
    private List<Song> songs;

    public Playlist(int playlistId, String playlistName) {
        this.setPlaylistId(playlistId);
        this.playlistName = playlistName;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
        System.out.println(song.getTitle() + " added to playlist.");
    }

    public void removeSong(String title) {
        boolean found = songs.removeIf(song -> song.getTitle().equalsIgnoreCase(title));
        if (found) {
            System.out.println(title + " removed from playlist.");
        } else {
            System.out.println("Song not found.");
        }
    }

    public void removeSong(int songId) {
        Iterator<Song> it = songs.iterator();
        while (it.hasNext()) {
            Song s = it.next();
            if (s.getSongId() == songId) {
                it.remove();
                System.out.println("Removed song: " + s.getTitle());
                return;
            }
        }
        System.out.println("Song ID not found: " + songId);
    }

    public void displaySongs() {
        System.out.println("Playlist: " + playlistName);
        for (Song song : songs) {
            String status = song.isPlaying() ? "Playing" :
                            song.isPaused() ? "Paused" :
                            song.isStopped() ? "Stopped" : "Unknown";
            System.out.println("- [" + song.getSongId() + "] " + song.getTitle() + " [" + status + "]");
        }
    }

    @Override
    public void play(String title) {
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                song.setPlaying(true);
                song.setPaused(false);
                song.setStopped(false);
                System.out.println("Playing: " + song.getTitle());
                return;
            }
        }
        System.out.println("Song not found: " + title);
    }

    @Override
    public void play(int songId) {
        for (Song song : songs) {
            if (song.getSongId() == songId) {
                song.setPlaying(true);
                song.setPaused(false);
                song.setStopped(false);
                System.out.println("Playing: " + song.getTitle());
                return;
            }
        }
        System.out.println("Song ID not found: " + songId);
    }

    @Override
    public void pause(String title) {
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                song.setPlaying(false);
                song.setPaused(true);
                song.setStopped(false);
                System.out.println("Paused song: " + title);
                return;
            }
        }
        System.out.println("Song not found: " + title);
    }

    @Override
    public void pause(int songId) {
        for (Song song : songs) {
            if (song.getSongId() == songId) {
                song.setPlaying(false);
                song.setPaused(true);
                song.setStopped(false);
                System.out.println("Paused song: " + song.getTitle());
                return;
            }
        }
        System.out.println("Song ID not found: " + songId);
    }

    @Override
    public void stop(String title) {
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                song.setPlaying(false);
                song.setPaused(false);
                song.setStopped(true);
                System.out.println("Stopped song: " + title);
                return;
            }
        }
        System.out.println("Song not found: " + title);
    }

    @Override
    public void stop(int songId) {
        for (Song song : songs) {
            if (song.getSongId() == songId) {
                song.setPlaying(false);
                song.setPaused(false);
                song.setStopped(true);
                System.out.println("Stopped song: " + song.getTitle());
                return;
            }
        }
        System.out.println("Song ID not found: " + songId);
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }
}
