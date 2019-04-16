import controller.Controller;
import model.Disc;
import view.View;

public class Main {
    public static void main(String [] args) {
        new Controller(new Disc(), new View()).startAction();
    }
}
