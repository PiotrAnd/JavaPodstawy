package training.core.ShallowVsDeepCopy;

public class Adres {
    private String city;
    private String steet;
    private int number;


    public Adres(String city, String street, int number) {
        this.city = city;
        this.steet = street;
        this.number = number;
    }

    @Override
    public String toString() {
        return city + " " + steet + " " + number;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.steet = street;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return steet;
    }

    public int getNumber() {
        return number;
    }


    }

