package com.example.patterns.behaviour;

public class NoTollsRoute implements RoutingStrategy {
    @Override
    public String buildRoute(String startPoint, String endPoint) {
        return "Маршрут без платных дорог" + startPoint + " - " + endPoint;
    }
}
