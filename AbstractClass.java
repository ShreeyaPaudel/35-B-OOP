public class AbstractClass {
    public static void main(String[] args) {
        Samsung s1 = new Samsung();
        s1.sms();
        s1.call("9800000000");
        Apple a1 = new Apple();
        a1.sms();
        a1.call("9800000000");

        
    }
    
}
//To make abstract class keyword "abstract" begore"class"
//if you make abstract class, cannot make object of it
abstract class SmartPhone{
    //abstract class may or may not contain abstract functions
    //to make abstract function use "abstract" before making function
    //abstract class do not have a body
    abstract void sms();
    abstract public boolean call(String number);
    //abstract clas can have normal funtions
    void imei(){
        System.out.println("Imei number");

    }
}
//abstract class can only be used in sub/child class
class Samsung extends SmartPhone{
    //when extending abstract classs we have to implement/override
    //all the abstract function of abstrcat class
    @Override
    void sms(){
        System.out.println("Samsung way of sending sms");
    }
    @Override
    public boolean call(String number){
        System.out.println("Samsung calling to " + number);
        return true;
    }

}

   
//Make a class apple extending smartphone
//make object of samsung and apple
//call sms() and call()  function of them
class Apple extends SmartPhone{
    @Override
    void sms(){
        System.out.println("Apple way of sending sms");

    }
    @Override
    public boolean call(String number){
        System.out.println("Apple way of calling to " + number);
        return true;
 }

 
}



/*
You are building a shape hierarchy for a drawing application. 
Design an abstract class named "Shape" with the following abstract methods:

calculateArea(): 
This method should calculate and return the area of the shape.

calculatePerimeter(): 
This method should calculate and return the perimeter of the shape.

Implement the abstract class and provide concrete implementations for
 the abstract methods. Create subclasses for different shapes such as "Circle,"
  "Rectangle," and "Triangle." 
  Each subclass should provide specific implementations for 
  calculating the area and perimeter of that shape. 
  Create instances of each shape class and demonstrate 
  how you can calculate their respective areas and perimeters.
*/

abstract class shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends shape{
    double radius = 20;
    @Override 
     double calculateArea(){
        return 22/7 * this.radius * this.radius;
    }
    @Override 
    double calculatePerimeter(){
        return 2 * 22/7 * this.radius;
    }
}

class Rectangle extends shape{
    double length = 10;
    double breadth = 12;
    @Override
    double calculateArea(){
        return this.length * this.breadth;
    }
    @Override 
    double calculatePerimeter(){
        return 2 * (this.length + this.breadth);
    }
}


    






