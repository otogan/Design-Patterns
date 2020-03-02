package com.onurtogan.designpatterns.iterator.browseHistory;

public interface Iterator<T> {
    boolean hasNext();
    T next();
}
