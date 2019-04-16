package view;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Класс вывода в консоль
 *
 * @author benjamin
 */
public class View {

    private static String CONFIG_BUNDLE_NAME = "config";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(CONFIG_BUNDLE_NAME,
//                    new Locale("ua","UA"));
                    new Locale("en"));

    /**
     * Метод вывода сообщения в консоль
     *
     * @param message - сообщение вывода
     */
    public void printMessage(String message) {
        System.out.println(bundle.getString(message));
    }
    public void printString(String message){
        System.out.println(message);
    }
}
