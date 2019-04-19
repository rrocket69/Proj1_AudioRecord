package model;


import entities.MusicalComposition;
import entities.Playable;

import java.util.ArrayList;


public class Disc {

    private ArrayList<MusicalComposition> songsArray = null;

    /**
     * Singleton realization
     */
    public Disc(){
        if(songsArray == null){
            songsArray = new ArrayList<>();
        }
    }

    /**
     * use to add tracks
     * @param composition recommended to build through factory
     */
    public void addSong(MusicalComposition composition) {
        songsArray.add(composition);
    }

    /**
     * Task1
     * @return duration of all tracks
     */
    public long calculateDuration() {
        long res = 0;
        for (MusicalComposition i : songsArray) {
            res += i.getDuration();
        }
        return res;
    }

    /**
     * Task2
     *
     */
    public void bubbleSortByStyle() {
        for (int j = 0; j < songsArray.size(); j++) {
            for (int i = 0; i < songsArray.size() - 1; i++) {
                if (songsArray.get(i).getStyle().
                        compareTo(songsArray.get(i + 1).getStyle()) > 0) {
                    MusicalComposition temp = songsArray.get(i);
                    songsArray.set(i, songsArray.get(i + 1));
                    songsArray.set(i + 1, temp);
                }
            }
        }
    }

    /**
     * Task3
     * @param first min barrier
     * @param second max barrier
     * @return String array of songs in given diapason
     */
    public String findByDiapasonDuration(long first, long second) {
        StringBuilder stringBuilder = new StringBuilder("[ ");
        for (MusicalComposition i : songsArray) {
            if (i.getDuration() > first && i.getDuration() < second)
                stringBuilder.append(i.toString()).append(" ");
        }
        return stringBuilder.append("]").toString();
    }

    public Playable getPlayableImpl(int num) {
        return songsArray.get(num);
    }

    /**
     *
     * @return current order of tracks
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[ ");
        for (MusicalComposition i : songsArray) {
            stringBuilder.append(i.toString()).append(", ");
        }
        return stringBuilder.append("]").toString();
    }

}
