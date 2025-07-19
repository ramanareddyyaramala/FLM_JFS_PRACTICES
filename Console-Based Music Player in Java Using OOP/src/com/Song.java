package com;

public class Song {
	
	private int songId;
	
	private String title;
	
	private String artist;
	
	private double duration;
	
	private boolean isPlaying;
	
	private boolean isPaused;
	
	private boolean isStopped;

	public Song(int songId, String title, String artist, double duration) {
		super();
		this.songId = songId;
		this.title = title;
		this.artist = artist;
		this.duration = duration;
		this.isPlaying = false;
		this.isPaused = false;
		this.isStopped = true;
	}

	public int getSongId() {
		return songId;
	}

	public void setSongId(int songId) {
		this.songId = songId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	public boolean isPlaying() {
		return isPlaying;
	}

	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}

	public boolean isPaused() {
		return isPaused;
	}

	public void setPaused(boolean isPaused) {
		this.isPaused = isPaused;
	}

	public boolean isStopped() {
		return isStopped;
	}

	public void setStopped(boolean isStopped) {
		this.isStopped = isStopped;
	}


	@Override
	public String toString() {
		return "Song{id=" + songId + ", title='" + title + "', artist='" + artist + "', duration=" + duration+ '}';
	}


}

