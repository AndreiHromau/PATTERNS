package com.example.patterns.behaviour;

public class FastestRoute  implements RoutingStrategy {
    @Override
    public String buildRoute(String startPoint, String endPoint) {
        return "Самый быстрый маршрут" + startPoint + " - " + endPoint;
    }
}
