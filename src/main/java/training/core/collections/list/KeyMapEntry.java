package training.core.collections.list;

public class KeyMapEntry {
    private Integer key;

    public KeyMapEntry(Integer key){
        this.key = key;
    }

    @Override//ctrl + o
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
