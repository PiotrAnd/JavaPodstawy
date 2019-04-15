package training;

public class StringTrainig {

    public static void main(String[] args) {
        String napis = "Ala ma kota a kot jest łaciaty i mruczy na widok Ali.";

        System.out.println("Operacja na obiekcie typu String");
        System.out.println("Baza: " + napis);
        System.out.println("Długość: " + napis.length());
        System.out.println("znak na pozycji 4: " + napis.charAt(4));
        System.out.println("Zawiera słowo \"mruczek\": " + napis.contains("mruczek"));
        System.out.println("Zawiera słowo \"jest\":" + napis.contains("jest"));
        System.out.println("Zmiana właściciela " + napis.replaceAll("Al", "Ol"));
        System.out.println("Słowo \"kot\" jest na pozycji: " + napis.indexOf("kot"));

        StringBuilder sb = new StringBuilder();
        sb.append("Ala")
                .append("ma")
                .append(77)
                .append(" kotów.");
        String drugiNapis = new String(sb);

        System.out.println(drugiNapis);

        StringBuffer sBuff = new StringBuffer();
        sBuff.append("Ola")
                .append("ma")
                .append(66) //tutaj mogę wpisać komentarze jednolinijkowy
                .append("kanarków.").reverse();
        System.out/*ten typ komentzarza mogę wstawić wszędzie*/.println(sBuff);

        System.out.println("Porównania zmiennych");
        String tekst_1 = "Ala";
        String tekst_2 = "aLa";
        String tekst_3 = new String( "Ala");
        System.out.printf("\tPorównuję %s z %s co daje wynik %s\n",
                tekst_1,
                tekst_2,
                tekst_1.equals(tekst_2));
        System.out.printf("\tPorównuję %s z %s co daje wynik %s\n",
                tekst_1,
                tekst_2,
                tekst_1.equalsIgnoreCase(tekst_2));
        System.out.printf("\tPorównuję %s z %s co daje wynik %s\n",
                tekst_1,
                tekst_3,
                tekst_1.equals(tekst_3));
        System.out.printf("\tPorównuję %s z %s co daje wynik %s\n",
                tekst_1,
                tekst_3,
                tekst_1.equalsIgnoreCase(tekst_3));
        System.out.printf("\tPorównuję %s z %s co daje wynik %s\n",
                tekst_1,
                tekst_3,
                tekst_1 == (tekst_3));

    }
}
