package com.onurtogan.designpatterns.momento.editor;

import java.util.LinkedList;

public class EditorHistory {
    private LinkedList<EditorState> states = new LinkedList<>();

    public void push(EditorState state) {
        states.push(state);
    }

    public EditorState pop() {
        return states.pop();
    }
}
