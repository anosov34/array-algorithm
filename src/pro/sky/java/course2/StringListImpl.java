package pro.sky.java.course2;

public class StringListImpl implements StringList {
    private final String[] strings;
    private int size;

    public StringListImpl(String[] strings, int size) {
        this.strings = new String[100];
        this.size = size;
    }

    @Override
    public String add(String item) {
        if (size >= strings.length) {
            System.out.println("Array is full");
        }
        String newString  = new String(item);
        strings[size++] = newString;
        return  newString;
    }

    @Override
    public String add(int index, String item) {
        return null;
    }

    @Override
    public String set(int index, String item) {
        return null;
    }

    @Override
    public String remove(String item) {
        return null;
    }

    @Override
    public String remove(int index) {
        return null;
    }

    @Override
    public boolean contains(String item) {
        return false;
    }

    @Override
    public int indexOf(String item) {
        return 0;
    }

    @Override
    public int lastIndexOf(String item) {
        return 0;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean equals(StringList otherList) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public String[] toArray() {
        return new String[0];
    }
}
