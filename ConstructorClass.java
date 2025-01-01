public class ConstructorClass {
    public static void main(String[] args) {
        ConstructorExample ce = new ConstructorExample();
        System.out.println(" After Object");
        ParamConstructor pc = new ParamConstructor(10, 20);
        System.out.println(pc.data2);
        //task 2
        //task2 cont
    

    }
}

// Task
// Make a class cat 
// make 2 private attribute name, age
// Make 2 public attribute breed, colour
// Make a constructor to only set namee and age
// Make a getter for name and age
//Make a setter for age
// Make an object of cat
// fill the attributes
// add +1 to the current age 
//print the following
// name: ny
//Age: 4
//Breed : xy
// colour: orange

class cat{
    private String name;
    private int age;
    public String breed;
    public String colour;
    cat(String name, String age){
        this.name = name;
        
    } 
    void setAge (int age){
        this.age = age;
    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }

}

class ParamConstructor{
    private int data1;
    public int data2;
    void setData1 (int data1){
        this.data1 = data1 ;
    }
    ParamConstructor(int d1, int d2){
        this.data1 = d1;
        this.data2 = d2;
    }
}

class ConstructorExample{
    // Non parametarized constructor
    ConstructorExample(){
        System.out.println("I run in object creation");
        // Add more logic
        // Only called once, to set attributes value in most cases
}

}