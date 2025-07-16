package com.example.patterns.creational;

public class SimpleSingleton {
    private static SimpleSingleton instance = new SimpleSingleton();
    //конструктор
    private SimpleSingleton() {
    }
    //метод для получения экземпляра подключения
    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }
    //доп метод для получения данных
    public String getData() {
        return "Singleton Data";
    }
}

