package ua.kpi;

/**
 * Created on 11. November. 16.
 *
 * @author Evgeniy
 */
public class View {
    // Text's constants
    public static final String GREETINGS = "Welcome!";
    public static final String FIRST_NAME = "Input first name: ";
    public static final String SECOND_NAME = "Input second name: ";
    public static final String MIDDLE_NAME = "Input middle name: ";
    public static final String NICKNAME = "Input nickname: ";
    public static final String COMMENTARY = "Input commentary if needed: ";
    public static final String GROUP = "Input group (FRINDS, FAMILY, WORK): ";
    public static final String HOME_PHONE = "Input number of the home phone '+38(044)000-00-00': ";
    public static final String MOB_PHONE = "Input number of the mobile phone '+38(050)000-00-00': ";
    public static final String EMAIL = "Input email: ";
    public static final String SKYPE = "Input skype login : ";
    public static final String ADDRESS_INDEX = "Input index (5-digit number): ";
    public static final String ADDRESS_STREET = "Input street: ";
    public static final String ADDRESS_CITY = "Input city: ";
    public static final String ADDRESS_BUILDING = "Input number of the building: ";
    public static final String ADDRESS_FLAT = "Input number of the flat: ";
    public static final String WRONG_INPUT = "Wrong input! Please, repeat!";

    // Print method
    public void printMessage(String message){
        System.out.println(message);
    }
}
