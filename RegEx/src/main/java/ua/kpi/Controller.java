package ua.kpi;

import ua.kpi.entities.Address;
import ua.kpi.entities.Group;
import ua.kpi.entities.Note;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        view.printMessage(view.GREETINGS);
//        for (int i = 0; i < 3; i++) {
            Note note = new Note();
            note.setSecondName(inputWithValidation(scanner, view.SECOND_NAME, NAME_REGEX));
            note.setFirstName(inputWithValidation(scanner, view.FIRST_NAME, NAME_REGEX));
            note.setMiddleName(inputWithValidation(scanner, view.MIDDLE_NAME, NAME_REGEX));
            note.setNickName(inputWithValidation(scanner, view.NICKNAME, NICK_REGEX));
            note.setCommentary(inputWithValidation(scanner, view.COMMENTARY, COMMENT_REGEX));
            note.setGroup(Group.valueOf(inputWithValidation(scanner, view.GROUP, GROUP_REGEX)));
            note.setHomePhone(inputWithValidation(scanner, view.HOME_PHONE, PHONE_REGEX));
            note.setMobilePhone(inputWithValidation(scanner, view.MOB_PHONE, PHONE_REGEX));
            note.setEmail(inputWithValidation(scanner, view.EMAIL, EMAIL_REGEX));
            note.setSkypeLogin(inputWithValidation(scanner, view.SKYPE, NICK_REGEX));
            note.setAddress(inputAddressWithValidation(scanner));
            note.setInputDate(DATE_FORMAT.format(new Date()));
            note.setUpdateDate(DATE_FORMAT.format(new Date()));
            this.notebook.addNote(note);
//        }
        view.printMessage(notebook.getNotesList());
    }

    public String inputWithValidation(Scanner sc, String message, String regexp) {
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher;
        String input;

        view.printMessage(message);
        do {
            input = sc.next();
            matcher = pattern.matcher(input);
            if (!matcher.matches()) {
                view.printMessage(view.WRONG_INPUT);
            }
        } while (!matcher.matches());
        return input;
    }

    public Address inputAddressWithValidation(Scanner sc) {
        Address address = new Address();
        address.setIndex(inputWithValidation(sc, view.ADDRESS_INDEX, INDEX_REGEX));
        address.setCity(inputWithValidation(sc, view.ADDRESS_CITY, NAME_REGEX));
        address.setStreet(inputWithValidation(sc, view.ADDRESS_STREET, NAME_REGEX));
        address.setBuildNumber(inputWithValidation(sc, view.ADDRESS_BUILDING, NUMBER_REGEX));
        address.setFlatNumber(inputWithValidation(sc, view.ADDRESS_FLAT, NUMBER_REGEX));
        return address;
    }
}
