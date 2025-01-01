public class InheritanceConstructor {
    public static void main(String[] args) {
        polo p1 = new polo();
        p1.differentColour("Yellow");
        polo p2 = new polo ("red");
        polo p3 = new polo(10);
        // call constructor with overloaded param
    }
    
}
class Shirt{
    String Colour = "black";
    Shirt(){
        System.out.println(" makiing shirt");
    }
    Shirt (String colour){
        this.Colour = colour;
    }
}
class polo extends Shirt{
    String Colour = "white";
    String texture;
    polo(){
        // by default the construstor of parent is callled 
        // meaning super() or shirt() on firs line of execution
        super("white");
        System.out.println(" Making Polo shirt");
    }
    // constructor overloadinng
    // same name function/ constructor with different logic/param
    polo(String colour){
        this.Colour = Colour;
        this.texture = texture;
        System.out.println("constructor with one string");

    }
    polo(String colour, String texture){
        this.Colour = colour;
        this.texture = texture;
        System.out.println("constructor with two string");
    }
    polo (int num){
        System.out.println(num);
        System.out.println(" constructor with one int ");
    }


    void differentColour (String Colour){
        System.out.println(" param colour "+ Colour);
        System.out.println(" class"+ this.Colour);
        System.out.println("parent colour "+ super.Colour);
    }
}

    // TASK 
    // make a class pant
    // add two attribute colour and texture
    // make constructor or pant that takes colour and texture 
    // make a classs halfpant that extends pant
    // make a attribute colour and add default String white 
    // make a non param constructor of halfpant and \
    // call the parameterized constructor of parent pant with " black" and "wool"
    // make a function design() in halfpant that takes String colour\
    // change the parent colour to current colour of halfpant
    // change the current colour of half pant to provided parameter 
    // 

    class Pant {
        String color;
        String texture;
    }
    class HalfPant extends Pant {
        String color = "White"; // default color
        HalfPant() {
            super.color = "Black";
            super.texture = "Wool";
            System.out.println("HalfPant constructor");
            }
            void design(String color) {
                super.color = this.color;
                this.color = color;
            }
        }



