package com.onurtogan.designpatterns.iterator.browseHistory;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();

    public void push(String url) { urls.add(url); }

    public String pop() {
        var lastIndex = urls.size() - 1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastIndex);
        return lastUrl;
    }

    public Iterator<String> createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator<String> {
        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return index < history.urls.size();
        }

        @Override
        public String next() {
            return history.urls.get(index++);
        }
    }
}