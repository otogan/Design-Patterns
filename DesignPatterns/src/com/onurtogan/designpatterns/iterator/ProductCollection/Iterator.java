package com.onurtogan.designpatterns.iterator.ProductCollection;

public interface Iterator<T> {
    boolean hasNext();
    T next();
}
