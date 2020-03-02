package com.onurtogan.designpatterns.iterator.browseHistory;

public class BrowserHistoryDemo {
    public static void main(String[] args) {
        var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()) {
            var url = iterator.next();
            System.out.println(url);
        }
    }
}
