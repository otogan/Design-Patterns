package com.onurtogan.designpatterns.state.directionService;

public class DirectionServicesDemo {
    public static void show() {
        var service = new DirectionService(new Walking());
        service.getEta();
        service.getDirection();
    }
}
