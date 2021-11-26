package com.learn.java.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@AllArgsConstructor
public final class Rectangle extends Shape {
    private int width;
    private int height;

    @Override
    public void draw() {
        log.info("Draw a rectangle: width = {}, height = {}.", getWidth(), getHeight());
    }
}
