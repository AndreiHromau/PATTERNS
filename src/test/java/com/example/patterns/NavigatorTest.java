package com.example.patterns;

import com.example.patterns.behaviour.FastestRoute;
import com.example.patterns.behaviour.Navigator;
import com.example.patterns.behaviour.NoTollsRoute;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NavigatorTest {

    @Test
    void testBuildRouteWithDifferentStrategies() {
        Navigator navigator = new Navigator(new FastestRoute());
        assertEquals("Самый быстрый маршрутA - B", navigator.getStrategy().buildRoute("A", "B"));

        navigator.setStrategy(new NoTollsRoute());
        assertEquals("Маршрут без платных дорогA - B", navigator.getStrategy().buildRoute("A", "B"));
    }
}

