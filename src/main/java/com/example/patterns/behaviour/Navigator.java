package com.example.patterns.behaviour;

//строит маршрут с помощью указанной стратегии
public class Navigator {
    private RoutingStrategy strategy;

    //конструктор
    public Navigator(RoutingStrategy strategy) {
        this.strategy = strategy;
    }

    public RoutingStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(RoutingStrategy strategy) {
        this.strategy = strategy;
    }
}
