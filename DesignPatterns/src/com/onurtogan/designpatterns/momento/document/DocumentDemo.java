package com.onurtogan.designpatterns.momento.document;

public class DocumentDemo {
    public static void show() {
        var document = new Document();
        var history = new DocumentHistory();

        document.setContent("Hello");
        history.push(document.createMemento());

        document.setFontName("Font 1");
        history.push(document.createMemento());

        document.setFontSize(10);

        System.out.println(document);

        document.restore(history.pop());
        System.out.println(document);

        document.restore(history.pop());
        System.out.println(document);
    }
}
