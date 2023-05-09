package org.example;

import java.util.Scanner;

public class ControlFlows {
    public static void main(String[] args) {
        // Problem-1: Playing the songs from a playlist
        // User input "next" to play the next song

        Scanner sc = new Scanner(System.in);
        boolean songIsOnRepeat = true;
        var songCounter=0;
        while (songIsOnRepeat) {
            System.out.printf("%s > Playing the current song, Song is on Rep\n", songCounter);
            System.out.println("Would you like to STOP the autoplay [yes/no] >");
            var autoPlayStopped = sc.next(); // getting user response

            if (autoPlayStopped.toLowerCase().equals("yes")) {
                songIsOnRepeat = false;
            } else {
                System.out.println("You didnt stopped the auto repeat");
            }
            songCounter++;
        }
        System.out.println("Playing the NEXT SONG ....");

    }
}
