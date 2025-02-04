package org.example.iterator;

/**
 * Container interface provides a method to obtain an iterator.
 */
public interface Container<T> {
    Iterator<T> iterator();
}
