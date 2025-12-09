package Java.Section2;

abstract class Shape{
    abstract void calculateArea();
}

class Circle extends Shape{

    @Override
    void calculateArea() {
        System.out.println("Circle");
    }
    
}

class Rectangle extends Shape{

    @Override
    void calculateArea() {
        System.out.println("Rectangle");
    }

}

public class Polymorphism {
    
}
