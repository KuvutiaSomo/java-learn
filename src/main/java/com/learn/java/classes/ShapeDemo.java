package com.learn.java.classes;

import com.learn.java.common.Demo;
import org.springframework.stereotype.Service;

@Service
public class ShapeDemo implements Demo {

    @Override
    public void run() {
        Shape shape = new Rectangle(100, 200);
        shape.draw();
    }
}
