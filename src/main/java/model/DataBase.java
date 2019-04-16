package model;

import entities.MusicalComposition;
import entities.Styles;
import entities.music.Opera;
import entities.music.Song;
import entities.music.Symphony;
import entities.music.Track;

public enum DataBase {
    RECORD_ONE(new Song("Hey Jude", Styles.Rock, "The Beatles", 200000)),
    RECORD_TWO(new Opera("Ghost of opera", Styles.Classical, "Webber", 500000)),
    RECORD_THREE(new Track("Yo", Styles.Hip_Hop, "Noname", 199999)),
    RECORD_FOUR(new Symphony("6th", Styles.Classical, "Mozart", 400001)),
    RECORD_FIVE(new Song("What a wonderful world", Styles.Jazz, "Lui Armstrong", 200001));

    private MusicalComposition musicalComposition;


    DataBase(MusicalComposition musicalComposition) {
        this.musicalComposition = musicalComposition;
    }

    public Styles getStyle() {
        return musicalComposition.getStyle();
    }

    public int getDuration() {
        return musicalComposition.getDuration();
    }
    public String getName(){
        return musicalComposition.getName();
    }
}
