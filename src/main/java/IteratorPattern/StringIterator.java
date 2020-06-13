package IteratorPattern;

import java.util.Arrays;

public class StringIterator implements Iterator {

    String[] strings;
    int currentIndex;

    public StringIterator(String[] strings){
        this.strings = strings.clone();
        currentIndex = 0;
    }

    @Override
    public boolean hasNext(){
        return strings.length >= currentIndex+1;
    }
    @Override
    public Object next(){
        return strings[currentIndex++];
    }

    @Override
    public void removeCurrent(){
        strings[currentIndex] = null;
    }
}
