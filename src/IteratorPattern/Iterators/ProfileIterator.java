package IteratorPattern.Iterators;

import IteratorPattern.Profile.Profile;

public interface ProfileIterator {
    boolean hasNext();
    Profile getNext();
    void reset();
}
