package training.core.collections.set;

import training.core.collections.set.SetEntry;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String>stringSet = new TreeSet<>();
        stringSet.add("Ala");
        stringSet.add("Ala");
        stringSet.add("Ola");
        stringSet.add("Ada");
        stringSet.add("Jan");
        System.out.println("Set size " + stringSet.size());
        System.out.println(stringSet);

        Set<SetEntry> setEntries = new TreeSet<>();
        setEntries.add(new SetEntry( "Ala"));
        setEntries.add(new SetEntry( "Ola"));
        setEntries.add(new SetEntry( "Jan"));
        System.out.println("Entries size " + setEntries.size());
    }
}
