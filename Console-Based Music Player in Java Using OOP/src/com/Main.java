package com;

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        MusicPlayer musicPlayer = new MusicPlayer();
        
        boolean running = true;

        while (running)
        {
            System.out.println("\n========= MUSIC PLAYER MENU =========");
            
            System.out.println("1. Add New Song");
            System.out.println("2. Update Existing Song");
            System.out.println("3. Delete Song");
            System.out.println("4. Display All Songs");
            System.out.println("5. Create New Playlist");
            System.out.println("6. Add Song to Playlist");
            System.out.println("7. Display All Playlists");
            System.out.println("8. Display Songs in Playlist");
            System.out.println("9. Play Song in Playlist");
            System.out.println("10. Pause Song in Playlist");
            System.out.println("11. Stop Song in Playlist");
            System.out.println("12. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();                                  

            if (choice == 1) {
                System.out.print("Enter Song ID: ");
                int id = sc.nextInt(); sc.nextLine();
                
                System.out.print("Enter Title: ");
                String title = sc.nextLine();
                
                System.out.print("Enter Artist: ");
                String artist = sc.nextLine();
                
                System.out.print("Enter Duration: ");
                double duration = sc.nextDouble(); sc.nextLine();
                
                musicPlayer.addSong(new Song(id, title, artist, duration));

            } else if (choice == 2) {
            	
                System.out.print("Enter Existing Song Title: ");
                String oldTitle = sc.nextLine();
                
                System.out.print("Enter New Song ID: ");
                int id = sc.nextInt();  sc.nextLine();
                
                System.out.print("Enter New Title: ");
                String title = sc.nextLine();
                
                System.out.print("Enter New Artist: ");
                String artist = sc.nextLine();
                
                System.out.print("Enter New Duration: ");
                double duration = sc.nextDouble(); sc.nextLine();
                
                musicPlayer.updateSong(oldTitle, new Song(id, title, artist, duration));

            } else if (choice == 3) {
                System.out.print("Enter Song Title to Delete: ");
                String title = sc.nextLine();
                musicPlayer.deleteSong(title);

            } else if (choice == 4) {
                musicPlayer.displayAllSongs();

            } else if (choice == 5) {
                System.out.print("Enter Playlist Name: ");
                String name = sc.nextLine();
                musicPlayer.createPlaylist(name);

            } else if (choice == 6) {
                System.out.print("Enter Playlist Name: ");
                String name = sc.nextLine();

                Playlist playlist = musicPlayer.getplaylist(name); // Check if playlist exists
                if (playlist == null) {
                    System.out.println("Playlist not found.");
                    continue;                                     // Skip asking for song title
                }

                System.out.print("Enter Song Title to Add: ");
                String title = sc.nextLine();

                Song songToAdd = musicPlayer.getSongByTitle(title);
                if (songToAdd != null) {
                    musicPlayer.addSongToPlaylist(name, songToAdd);
                } else {
                    System.out.println("Song not found.");
                }


            }else if (choice == 7) {
                musicPlayer.displayAllPlaylists();

            } else if (choice == 8) {
                System.out.print("Enter Playlist Name: ");
                String name = sc.nextLine();
                
                Playlist p = musicPlayer.getplaylist(name);
                if (p != null) {
                    p.displaySongs();
                } else {
                    System.out.println("Playlist not found.");
                }

            } else if (choice == 9) {
                System.out.print("Enter Playlist Name: ");
                String name = sc.nextLine();
                musicPlayer.playPlaylist(name);

            } else if (choice == 10) {
                System.out.print("Enter Playlist Name: ");
                String name = sc.nextLine();
                
                Playlist p = musicPlayer.getplaylist(name);
                if (p != null) {
                    System.out.print("Enter Song Title to Pause: ");
                    String title = sc.nextLine();
                    p.pause(title);
                }

            } else if (choice == 11) {
                System.out.print("Enter Playlist Name: ");
                String name = sc.nextLine();
                
                Playlist p = musicPlayer.getplaylist(name);
                if (p != null) {
                    System.out.print("Enter Song Title to Stop: ");
                    String title = sc.nextLine();
                    p.stop(title);
                }

            } else if (choice == 12) {
                running = false;
                System.out.println("Exiting music player...");
            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
