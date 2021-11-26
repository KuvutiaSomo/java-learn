package com.learn.java.controllers;

import com.learn.java.classes.ShapeDemo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Getter
@Setter
public class ShapesController {
    private ShapeDemo shapeDemo;

    @GetMapping("/rectangle")
    public HttpStatus drawRectangle() {
        getShapeDemo().run();
        return HttpStatus.OK;
    }
}
