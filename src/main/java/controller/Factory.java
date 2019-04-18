package controller;

import entities.MusicalComposition;
import entities.Styles;
import entities.music.Opera;
import entities.music.Song;
import entities.music.Symphony;
import entities.music.Track;

/**
 * Fabric pattern realization
 */
public class Factory {
    public static MusicalComposition createOne(String type, String name, Styles style, String author, int duration){
        MusicalComposition temp;
        if(type.equals("Opera"))
            temp = new Opera(name, style, author, duration);
        else if(type.equals("Song"))
            temp = new Song(name, style, author, duration);
        else if(type.equals("Symphony"))
            temp = new Symphony(name, style, author, duration);
        else
            temp = new Track(name, style, author, duration);
        return temp;
    }
}
