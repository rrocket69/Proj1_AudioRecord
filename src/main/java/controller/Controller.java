package controller;

import model.Disc;
import view.View;

public class Controller {
    private Disc disc;
    private View view;

    public Controller(Disc disc, View view){
        this.disc = disc;
        this.view = view;
    }
    public void startAction(){
        view.printMessage("output.all.duration.data");
        view.printString(Long.toString(disc.calculateDuration()));

        view.printMessage("output.order.data");
        view.printString(disc.toString());
        disc.bubbleSortToStyle();
        view.printMessage("output.order.data");
        view.printString(disc.toString());

        view.printMessage("output.diapason.duration.data");
        view.printString(disc.findByDiapasonDuration(100000,200000));

    }
}
