package entities.music;

import entities.MusicalComposition;
import entities.Styles;

public class Song extends MusicalComposition {

    public Song(Styles style, String author, int duration){
        this.style = style;
        this.author = author;
        this.duration = duration;
    }
    public void play() {

    }

}
