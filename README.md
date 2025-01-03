# Polymorphism in Java - 3D Shapes

## Description

This project demonstrates the concept of **polymorphism** in Java through the use of interfaces and inheritance. The program simulates three different 3D shapes: **Sphere**, **Cylinder**, and **Cube**. An interface `Shape3DInterface` defines methods for calculating the **surface area** and **volume** of 3D shapes, and each shape class implements this interface.

Random objects of different shapes are generated, and their surface areas and volumes are calculated and displayed.

## Key Concepts

- **Polymorphism**: This is the ability of a class to implement an interface and provide its specific implementation for the interface's methods. In this project, the `Shape3DInterface` is implemented by different shape classes, each with its own formulas for calculating surface area and volume.
  
## How the Program Works

1. **Shape3DInterface**: An interface that defines two methods:
   - `surfaceArea()`: Returns the surface area of the shape.
   - `volume()`: Returns the volume of the shape.

2. **Shape Classes**:
   - **Sphere**: Implements the surface area and volume formulas for a sphere.
   - **Cylinder**: Implements the surface area and volume formulas for a cylinder.
   - **Cube**: Implements the surface area and volume formulas for a cube.

3. **Random Object Generation**: 
   - The program randomly generates 10 objects of type **Sphere**, **Cylinder**, and **Cube**.
   - Random values for dimensions (radius, height, or side length) are generated using `Math.random()` or `Random` class.
   
4. **Output**: 
   - The name of each shape.
   - The surface area and volume of each shape.

## Shape Formulas

- **Sphere**:
  - Surface Area = `4πr²`
  - Volume = `(4/3)πr³`
  
- **Cylinder**:
  - Surface Area = `2πr(r + h)`
  - Volume = `πr²h`
  
- **Cube**:
  - Surface Area = `6a²`
  - Volume = `a³`

## Example of Generated Output
![Output Example](https://github.com/user-attachments/assets/3e4bcffa-23fd-4b19-8765-deffb212eb5b)

