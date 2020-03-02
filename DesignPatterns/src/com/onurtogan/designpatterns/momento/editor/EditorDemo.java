package com.onurtogan.designpatterns.momento.editor;

public class EditorDemo {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new EditorHistory();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}
