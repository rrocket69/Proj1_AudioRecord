package model;

import entities.MusicalComposition;

import java.util.ArrayList;

public class Disc {
    private ArrayList<MusicalComposition> records;

    public void addRecord(MusicalComposition composition){
        records.add(composition);
    }
}
