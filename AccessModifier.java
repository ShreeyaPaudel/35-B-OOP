public class AccessModifier {
    public static void main(String[] args) {
       AccessExample ae = new AccessExample();
       ae.name = "Ram";
       ae.age = 12;
       //ae.salary = 1000.21; //
       ae. defaultFunction();
       ae.publicFunction();
       //ae.privateFunction(); //
       //ae.accessPrivate(); //
       ae.setsalary(1002.22);
       System.out.println(ae.getSalary());
       Dog d = new Dog();
        d.breed = "Shepard";
        d.setname ("Tommy");
        d.setage(5);
        System.out.println("Name " + d.getname());
        System.out.println("Breed " + d.breed);
        System.out.println("Age " + d.getage());

    }
    
}
// Task
// Make a class Dog 
// Make a private attribute name and age 
// make a public attribute breed
// Make a setter for name and age 
// Make a getter for name and age
// Make an objectfor dog
// fill all attribuute 
//Print the following using object
// name : XYZ 
// Breed : ABC
//Age : 10

class Dog{
    private String name;
    private int age;
    public String breed;
    void setname(String n){
        name = n;
    }
    String getname(){
        return name;
    }
    void setage (int a){
        age = a;
    }
    int getage(){
        return age;
    }
}


class AccessExample{
    String name; // Automatically default, package/folder can access
    public int age; // can be accessed from anywhere
    private double salary; // can only be accessed inside this class
    void setsalary(double s){
        salary = s;
    }
    double getSalary (){
        return salary;
    }

    // same concept in function 
    void defaultFunction(){
        System.out.println("i can be accessed inside a package ");
    }
    public void publicFunction(){
        System.out.println(" i can be accessed from anywhere ");
    }
    public void privateFunction(){
        System.out.println(" i can be onl;y accessed incide class ");
    }
    void acessPrivate(){
        System.out.println(salary);
        privateFunction();
    }

}
