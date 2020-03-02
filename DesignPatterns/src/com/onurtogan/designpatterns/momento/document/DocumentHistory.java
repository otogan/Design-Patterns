package com.onurtogan.designpatterns.momento.document;

import java.util.ArrayDeque;
import java.util.Deque;

public class DocumentHistory {
    private Deque<DocumentMemento> mementos = new ArrayDeque<>();

    public void push(DocumentMemento memento) {
        mementos.push(memento);
    }

    public DocumentMemento pop() {
        return mementos.pop();
    }
}
