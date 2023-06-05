// Single Inheritance
class Vehicle {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

// Multilevel Inheritance
class Animal {
    public void eat() {
        System.out.println("I can eat!");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("I can bark!");
    }
}

class Labrador extends Dog {
    public void display() {
        System.out.println("I am a Labrador!");
    }
}

// Hierarchical inheritance example
class Shape {
    public void draw() {
        System.out.println("Drawing a shape...");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a circle...");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("Drawing a square...");
    }
}

public class inheritance {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        
        inheritance id = new inheritance();
        Shape shape = new Shape();
        Circle circle = new Circle();
        Square square = new Square();

        shape.draw();
        circle.draw();
        square.draw();

        Labrador lab = new Labrador();
        lab.eat();
        lab.bark();
        lab.display();
        
        Vehicle vh = new Vehicle();
        vh.honk();
        System.out.println(vh.brand + " " + id.modelName);
    }
}
