public class ic {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        cc.firstname = "XYZ";
        cc.lastname = "ANC";
        cc.expenses = 100.11;
        //cc.salary = 10000; //
        cc.info();
        cc.detail();
    
        
    }
    
}

class AnimalClass{
    public String name;
    void specks(){
        System.out.println(name);
    }

}
class MammalClass extends AnimalClass{
    public String breed;
    void fur(){
        System.out.println(breed);
    }
}
class ReptileClass extends AnimalClass{
    public String eggs;
    void sheds(){
        System.out.println(eggs);
    }
}



class ParentClass{
    public String lastname;
    private int salary;
    protected double expenses;
    void info(){
        System.out.println("Parent Function" + lastname);
    }
}
// To use inheritance use the keyword "extends"
// single level inheritance, one parent/super - one child/sub
class ChildClass extends ParentClass{
    String firstname;
    void detail(){
        System.out.println(firstname + " " + lastname);
}
}
// multi level inheritance, nested class, child class has another child class
class GrandChildClass extends ChildClass{
    String middlename;
    void description(){
        System.out.println(firstname + "" + middlename + "" + lastname );
    }
}
// tree/ hierarcial inheritance
class BrotherClass extends ParentClass {
    String address;
    void living(){
        System.out.println(lastname + " "+ address);
    }
}

