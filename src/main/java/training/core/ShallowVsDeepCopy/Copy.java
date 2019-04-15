package training.core.ShallowVsDeepCopy;

public class Copy {
    public static void main(String[] args) {
        Person father = new Person("John", new Adres("B-stok", "KEN", 12));
        Person son = new Person(father);
        son.setName("William");
        System.out.println(father);
        System.out.println(son);
        System.out.println("------------------------------------------------");
        son.getAdres().setCity("Wawa");
        son.getAdres().setStreet("Rondo ONZ");
        son.getAdres().setNumber(125);
        System.out.println(father);
        System.out.println(son);

    }

}
