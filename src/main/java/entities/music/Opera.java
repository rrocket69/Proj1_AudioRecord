package entities.music;

import entities.MusicalComposition;
import entities.Styles;

public class Opera extends MusicalComposition {

    public Opera(String name, Styles style, String author, int duration) {
        super(name, style, author, duration);
    }

    public String play() {
        return "Playing opera: " + this.getName();
    }

}
