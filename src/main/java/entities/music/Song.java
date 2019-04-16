package entities.music;

import entities.MusicalComposition;
import entities.Styles;

public class Song extends MusicalComposition {

    public Song(String name, Styles style, String author, int duration) {
        super(name, style, author, duration);
    }

    public void play() {

    }

}
