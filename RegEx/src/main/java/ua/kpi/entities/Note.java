package ua.kpi.entities;

/**
 * Created on 11. November. 16.
 *
 * @author Evgeniy
 */
public class Note {
    private String firstName;
    private String secondName;
    private String middleName;
    private String nuckName;
    private String commentary;
    private String group;
    private String homePhone;
    private String mobilePhone;
    private String email;
    private String skypeLogin;
    private Address address;
    private String inputDate;
    private String updateDate;

    public Note() {}

    public Note(String firstName, String secondName, String middleName,
                String nuckName, String commentary, String group, String homePhone,
                String mobilePhone, String email, String skypeLogin, Address address,
                String inputDate, String updateDate) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.nuckName = nuckName;
        this.commentary = commentary;
        this.group = group;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.email = email;
        this.skypeLogin = skypeLogin;
        this.address = address;
        this.inputDate = inputDate;
        this.updateDate = updateDate;
    }
}
