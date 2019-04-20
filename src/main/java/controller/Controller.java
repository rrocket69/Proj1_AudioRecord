package controller;

import model.Disc;
import sqlconnect.DBConnection;
import view.View;

public class Controller {
    private Disc disc;
    private View view;

    public Controller(Disc disc, View view){
        this.disc = disc;
        this.view = view;
    }
    public void startAction(){
        disc = new DBConnection().getRecordsFromDB(disc);

        //To initialize without db
//        disc.addSong(Factory.createOne("Song","Hey Jude", Styles.Rock, "The Beatles", 200000));
//        disc.addSong(Factory.createOne("Opera","Ghost of opera", Styles.Classical, "Webber", 500000));
//        disc.addSong(Factory.createOne("Track","Yo", Styles.HipHop, "Noname", 199999));
//        disc.addSong(Factory.createOne("Symphony","6th", Styles.Classical, "Mozart", 400001));
//        disc.addSong(Factory.createOne("Song","What a wonderful world", Styles.Jazz, "Lui Armstrong", 200001));

        view.printMessage("output.all.duration.data");
        view.printString(Long.toString(disc.calculateDuration()));

        view.printMessage("output.order.data");
        view.printString(disc.toString());
        disc.bubbleSortByStyle();
        view.printMessage("output.order.data");
        view.printString(disc.toString());

        view.printMessage("output.diapason.duration.data");
        view.printString(disc.findByDiapasonDuration(100000,200000));

        view.printString(disc.getPlayableImpl(1).play());

    }

}
