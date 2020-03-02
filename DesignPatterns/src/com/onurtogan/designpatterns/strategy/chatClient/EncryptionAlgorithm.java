package com.onurtogan.designpatterns.strategy.chatClient;

public interface EncryptionAlgorithm {
    String encrypt(String message);
}
