package com.onurtogan.designpatterns.strategy.chatClient;

public class ChatClientDemo {
    public static void main(String[] args) {
        var client = new ChatClient(new DES());
        client.send("Hello World");
    }
}
