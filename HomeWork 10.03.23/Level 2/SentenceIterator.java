package HomeWork10_03_23;

import java.util.Iterator;

public class SentenceIterator implements Iterator<String> {
    private String[] words;
    private int currentIndex;
    public SentenceIterator(String sentence) {
    words = sentence.split(" ");
    }

    @Override
    public boolean hasNext() {
        return currentIndex < words.length;
    }

    @Override
    public String next() {
        return words[currentIndex++];
    }
}
