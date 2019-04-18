package entities.music;

import entities.MusicalComposition;
import entities.Styles;

public class Track extends MusicalComposition {

    public Track(String name, Styles style, String author, int duration) {
        super(name, style, author, duration);
    }

    public String play() {
        return "Playing track: " + this.getName();
    }
}
