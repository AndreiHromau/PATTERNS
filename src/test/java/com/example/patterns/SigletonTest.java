package com.example.patterns;

import com.example.patterns.creational.SimpleSingleton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class SigletonTest {
    @Test
    public void testSingletonInstance() {
            SimpleSingleton instance1 = SimpleSingleton.getInstance();
            SimpleSingleton instance2 = SimpleSingleton.getInstance();

        //убеждаемся, что получаем один и тот же экземпляр подключения
        assertSame(instance1, instance2);

        //доп метод для получения данных проверка
        assertEquals("Singleton Data", instance1.getData());
    }
}
