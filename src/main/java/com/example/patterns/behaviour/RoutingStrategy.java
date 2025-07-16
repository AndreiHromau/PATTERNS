package com.example.patterns.behaviour;

//интерфейс стратегии
public interface RoutingStrategy {
    String buildRoute(String startPoint, String endPoint);
}
