package model;

import entities.MusicalComposition;
import entities.Styles;
import entities.music.Opera;
import entities.music.Song;
import entities.music.Symphony;
import entities.music.Track;

public enum DataBase {
    RECORD_ONE(new Song(Styles.Rock,"The Beatles",200000)),
    RECORD_TWO(new Opera(Styles.Classical,"Webber", 500000)),
    RECORD_THREE(new Track(Styles.Hip_Hop, "Noname", 199999)),
    RECORD_FOUR(new Symphony(Styles.Classical,"Mozart",400000)),
    RECORD_FIVE(new Song(Styles.Jazz,"Lui Armstrong",200001));

    private MusicalComposition musicalComposition;

    DataBase(MusicalComposition musicalComposition){
        this.musicalComposition = musicalComposition;
    }
}
