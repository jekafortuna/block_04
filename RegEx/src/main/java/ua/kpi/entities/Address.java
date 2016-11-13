package ua.kpi.entities;

/**
 * Created on 11. November. 16.
 *
 * @author Evgeniy
 */
public class Address {
    private String index;
    private String city;
    private String street;
    private String buildNumber;
    private String flatNumber;

    public String getPostFormatAddress(){
        StringBuilder sb = new StringBuilder(this.index);
        sb.append(" ");
        sb.append(this.city);
        sb.append(" ");
        sb.append(this.street);
        sb.append(" ");
        sb.append(this.buildNumber);
        sb.append(" ");
        sb.append(this.flatNumber);

        return sb.toString();
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }
}
