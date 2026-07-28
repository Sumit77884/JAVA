abstract class Shape{
    abstract double calculateArea();
    void display(){
        System.out.println("This is shape.");
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    double calculateArea(){
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape{
    double length;
    double width;
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    double calculateArea(){
        return length*width;
    }
}

abstract class a {
    abstract void someMethod();
}
class b extends a {
    void someMethod() {
        System.out.println("Implementation of abstract method");
    }
}
interface Drivable {
    void drive();
}

class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void move() {
        System.out.println(brand + " is moving at " + speed + " km/h");
    }
}

class Car extends Vehicle implements Drivable {
    int seats;

    Car(String brand, int speed, int seats) {
        super(brand, speed);
        this.seats = seats;
    }

    public void drive() {
        System.out.println("Car is being driven");
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Seats: " + seats);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 120, 5);
        myCar.move();
        myCar.drive();
        myCar.display();
        b obj = new b();
        obj.someMethod();
        Circle AREA=new Circle(4);
        System.out.println(AREA.calculateArea());
        Rectangle Area_2=new Rectangle(5, 8);
        System.out.println(Area_2.calculateArea());
        
    }
}
/*
 Re
 */
