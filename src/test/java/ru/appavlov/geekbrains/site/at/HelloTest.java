package ru.appavlov.geekbrains.site.at;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {

    @Test
    void name() {
        String hello = new Hello().hello();
        assertEquals("Hello", hello);
    }
}
