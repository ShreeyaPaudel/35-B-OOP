public class FirstOop {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Ram";
        p1.age = 12;
        p1.gender= 'M';
        System.out.println(p1.name);
        p1.introduction ();

        Person p2 = new Person();
        p2.name = "Shreeya";
        p2.age = 19;
        p2.gender = 'G';
        System.out.println(p2.name);
        p2.introduction ();

        Square s1 = new Square ();
        s1. sides=10;
        int s1Area = s1.area ();
        System.out.println(s1Area);
        s1.addSides(2);
        System.out.println(s1.area()); 
        
        rectangle R1 = new rectangle();
        R1.length = 10;
        R1.breadth = 5;
        double R1Area = R1.area();
        double R1Perimeter = R1.perimeter();
        System.out.println(R1Perimeter);
        System.out.println(R1Area);
        
        car C1 = new car();
        C1.name = "t123";
        C1.brand = "tesla" ;
        C1.year = 2024;
        C1.colour = "white";

        car C2 = new car();
        C2.name = "B109";
        C2.brand = "BMW" ;
        C2.year = 2024;
        

    }
    
}
// Task
// make a class Rectangle 
// make 2 attributes in double, length  and breadth
// make a function areaOfRectangle that returns length*breadth
// make a function perimeterOfRectanle that returs 2(length+breadth)
// make an object of Rectangle and print area and perimeter 

class rectangle {
    double length;
    double breadth;
    double area(){
        return length*breadth;
    }
    double perimeter(){
        return 2* (length * breadth);

    }
}
class car{
    // make attrubutes: name, brand, year, color
    // make a function modify() that take new color and set to old color
    // make a function expiry() that returns 100 added to year
    // make a function start() that prints(name is starting)
    // make a function stop() that print(name, bramd is stopping)
    // make a function detail() that print(name, brand, color and year)
    // make 3 objects of Car
    // Start all 3 objects
    // Stop only 1st object
    // Modify 2nd car to Green color
    // Print the expiry of 3rd Object
    // Print detail of all 3 objects
    String name;
    String brand;
    int year;
    String colour;

    void modify(String newcolour ){
        colour = newcolour;
    }
    int expiry(){
        return 100+year;
    }
    void start (){
        System.out.println(name+ "is starting ");
    }
    void stop(){
        System.out.println(name + "," + brand + " is stoping ");
    }
    void detail(){
        System.out.println(name + "," + brand + ","+ colour + "and " + year);
    }
    }



class Square {
    int sides;
    int area(){
        int area = sides*sides;
        return area;
    }
    void addSides(int val){
        sides=sides + val ; // sides will retain state/data
    }
}

class Person{
    //data/fields/attributes/ properties
    String name;
    int age;
    char gender;

    // procedures/functions/methods

    void introduction(){
        System.out.println("hi my name is " + name);

    }
    
}
