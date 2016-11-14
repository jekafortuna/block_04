package ua.kpi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * Created on 11. November. 16.
 *
 * @author Evgeniy
 */
public class Controller {

    // Regexp
    public static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm:ss");
    public static final String NAME_REGEX = "^[A-Z]{1}[a-z]+$";
    public static final String NICK_REGEX = "^[a-zA-Z0-9]*$";
    public static final String COMMENT_REGEX = "^.*$";
    public static final String GROUP_REGEX = "(^FRIENDS$)|(^FAMILY$)|(^WORK$)";
    public static final String PHONE_REGEX = "^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";
    public static final String EMAIL_REGEX = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
    public static final String INDEX_REGEX = "^\\d{5}$";
    public static final String NUMBER_REGEX = "^\\d{1,3}$";

    Notebook notebook;
    View view;

    public Controller(Notebook notebook, View view) {
        this.notebook = notebook;
        this.view = view;
    }

    public void processUser(){
        Scanner scanner = new Scanner(System.in);

    }
}
