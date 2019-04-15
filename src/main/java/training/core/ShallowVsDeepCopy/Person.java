package training.core.ShallowVsDeepCopy;

public class Person {
    private String name;
    private Adres adres;

    public Person(String name, Adres adres) {
        this.name = name;
        this.adres = adres;
    }

    public Person(Person origin){
        this.name = origin.name;
        Adres adr = origin.getAdres();
        this.adres = new Adres(adr.getCity(),adr.getStreet(),adr.getNumber());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", adres=" + adres +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public String getName() {
        return name;
    }

    public Adres getAdres() {
        return adres;
    }
}

