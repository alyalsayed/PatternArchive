package org.example.iterator;

/**
 * NameRepository is a concrete container that holds a list of names.
 */
public class NameRepository implements Container<String> {
    private String[] names = {"John", "Jane", "Adam", "Eve"};

    @Override
    public Iterator<String> iterator() {
        return new NameIterator();
    }

    /**
     * NameIterator is a concrete implementation of the Iterator interface for the names array.
     */
    private class NameIterator implements Iterator<String> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
