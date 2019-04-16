package entities.music;

import entities.MusicalComposition;
import entities.Styles;

public class Symphony extends MusicalComposition {

    public Symphony(Styles style, String author, int duration){
        this.style = style;
        this.author = author;
        this.duration = duration;
    }
    public void play() {

    }

}
