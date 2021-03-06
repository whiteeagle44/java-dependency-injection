package org.example;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape {
    public void drawShape() {
        System.out.println("Rectangle is drawn.");
    }
}
