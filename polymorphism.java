public class polymorphism {
    public static void main(String[] args) {
        MathOperation mo = new MathOperation();
        System.out.println(mo.add(10,20));
        System.out.println(mo.add(10,20,50));
        mo.add();

        // Method overriding
        Document d1= new Document();
        d1.print("black");
        //polymorphism allow child object to be stored in 
        // Parent class variable
        Document d2 = new MsWord();
        d2.print("White");
        // Doing so will take the updated function and 
        // attribute from child object representation
        Document d3 = new Office365();
        d3.print("Yellow");
        // When Parent variable holds child object
        // only the attribute and function written in Parent
        // can be used
        // EG: d3.online; -> cannot be used
        
    }
    
}
// method overloading - compiletime polymorphism 
// making same function multiple times with diff in parameter
class MathOperation{
    int add(int num1, int num2){
        return num1 + num2;
    }
    // 1.  changing the number parameter
    int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    // 2. changing the data type of parameter 
    double add (double num1, double num2){
        return num1 + num2;
    }

        // note method overloading expects the unique in data type of parameter
        // cannot overload method just by changing vafriable 
        //eg int add(int a, int b) -> cannot do this s add with 2 int already made
        // cannot overload b just changing data type 
        // eg: double add(int num1, int num2) ->cannot do this as add with 2 int already made
    void add(){
        System.out.println("Invalid operation");
    }
}
// method Overrriding - runtime polymorphism 
// making the same function of ParentClass in ChildClass

class Document{
    public void print (String paper){
        System.out.println("Document Printing.");
    }
}

// method overriding is only possible in ChildClass
class MsWord extends Document{
    boolean online = false;
    @Override
    public void print (String paper){
        System.out.println(" Ms word is printing ");
    }
}

// method overriding can be done in multi level inheritance
class Office365 extends MsWord{
    boolean online = true;
    @Override
    public void print(String paper){
        System.out.println("online is printing");
    }
}


