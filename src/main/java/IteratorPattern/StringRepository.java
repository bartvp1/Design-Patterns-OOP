package IteratorPattern;

public class StringRepository implements Iterable {

    String[] strings;

    public StringRepository(String[] strings){
        this.strings = strings;
    }

    @Override
    public StringIterator getIterator() {
        return new StringIterator(strings);
    }
}
