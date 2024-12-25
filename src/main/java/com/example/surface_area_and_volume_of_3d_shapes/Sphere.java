package com.example.surface_area_and_volume_of_3d_shapes;

public class Sphere implements Shapes3DInterface {
    private double radius;
    private String name;

    public Sphere(double radius) {
        this.radius = radius;
        this.name = "Sphere";
    }

    public String getName() {
        return name;
    }

    @Override
    public double surfaceArea() {
        return (4 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double volume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }

    @Override
    public String toString() {
        return name +
                ", radius=" + String.format("%.2f", radius) +
                ", volume=" + String.format("%.2f", volume()) +
                ", area=" + String.format("%.2f", surfaceArea()) +
                '}';
    }
}
