package entities;

public abstract class MusicalComposition implements Playable{
    private String author;
    private int duration;
    private Styles style;
    private String name;

    public MusicalComposition(String name, Styles style, String author, int duration){
        this.name = name;
        this.style = style;
        this.author = author;
        this.duration = duration;
    }
    public int getDuration() {
        return duration;
    }

    public Styles getStyle() {
        return style;
    }

    public String getName() {
        return name;
    }
}
