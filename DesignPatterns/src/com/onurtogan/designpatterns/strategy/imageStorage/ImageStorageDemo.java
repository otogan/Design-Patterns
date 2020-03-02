package com.onurtogan.designpatterns.strategy.imageStorage;

public class ImageStorageDemo {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a");
    }
}
