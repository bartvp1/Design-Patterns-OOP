package IteratorPattern;

public class IteratorPattern {

    public static void main(String[] args) {
        String[] strings = new String[]{"aa", "bb", "cc"};
        StringIterator it = new StringRepository(strings).getIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
