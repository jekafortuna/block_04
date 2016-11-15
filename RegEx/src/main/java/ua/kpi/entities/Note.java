package ua.kpi.entities;

import ua.kpi.Controller;

import java.util.Date;

/**
 * Created on 11. November. 16.
 *
 * @author Evgeniy
 */
public class Note {
    private String firstName;
    private String secondName;
    private String middleName;
    private String nickName;
    private String commentary;
    private Group group;
    private String homePhone;
    private String mobilePhone;
    private String email;
    private String skypeLogin;
    private Address address;
    private String inputDate;
    private String updateDate;

    public Note() {}

    public Note(String firstName, String secondName, String middleName,
                String nickName, String commentary, Group group, String homePhone,
                String mobilePhone, String email, String skypeLogin, Address address,
                String inputDate, String updateDate) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.nickName = nickName;
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

    public String getSimpleName(){
        StringBuilder sb = new StringBuilder(this.secondName);
        sb.append(" ");
        sb.append(this.firstName.charAt(0));
        sb.append(". ");
        sb.append(this.middleName.charAt(0));
        sb.append(". ");

        return sb.toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        this.setUpdateDate(Controller.DATE_FORMAT.format(new Date()));
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
        this.setUpdateDate(Controller.DATE_FORMAT.format(new Date()));
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
        this.setUpdateDate(Controller.DATE_FORMAT.format(new Date()));
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
        this.setUpdateDate(Controller.DATE_FORMAT.format(new Date()));
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
        this.setUpdateDate(Controller.DATE_FORMAT.format(new Date()));
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
        this.setUpdateDate(Controller.DATE_FORMAT.format(new Date()));
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
        this.setUpdateDate(Controller.DATE_FORMAT.format(new Date()));
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        this.setUpdateDate(Controller.DATE_FORMAT.format(new Date()));
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        this.setUpdateDate(Controller.DATE_FORMAT.format(new Date()));
    }

    public String getSkypeLogin() {
        return skypeLogin;
    }

    public void setSkypeLogin(String skypeLogin) {
        this.skypeLogin = skypeLogin;
        this.setUpdateDate(Controller.DATE_FORMAT.format(new Date()));
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
        this.setUpdateDate(Controller.DATE_FORMAT.format(new Date()));
    }

    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate;
        this.setUpdateDate(Controller.DATE_FORMAT.format(new Date()));
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Note {" +
                "firstName = '" + firstName + '\'' +
                ", secondName = '" + secondName + '\'' +
                ", middleName = '" + middleName + '\'' +
                ", nickName = '" + nickName + '\'' +
                ", commentary = '" + commentary + '\'' +
                ", group = '" + group + '\'' +
                ", homePhone = '" + homePhone + '\'' +
                ", mobilePhone = '" + mobilePhone + '\'' +
                ", email = '" + email + '\'' +
                ", skypeLogin = '" + skypeLogin + '\'' +
                ", address = " + address +
                ", inputDate = '" + inputDate + '\'' +
                ", updateDate = '" + updateDate + '\'' +
                '}';
    }
}
