public class InterfaceClass {
    public static void main(String[] args) {
        
    }
    
}
// interface is made as class replacing with "interface"
// interface cannot be made object of 
interface AnimalDo{
    public void move ();
    public boolean eat(String food);
    // functions of interface is automatically public and abstract
}
interface MammalDo extends AnimalDo{
    public int legs();
}
// can be extendedinto miltiple layer
interface DogDo extends MammalDo{
    public void bark();

}
interface DomesticAnimalDo{
    public void pet();
}
// class can extend mulltiple interface 

class Husky implements DogDo, DomesticAnimalDo{
    // when implementing multiple interface all the function from implemented interfaces
    // should beoverriden
    @Override
    public void pet(){
        System.out.println("huslky llikes pet");
    }
    // when impkementing interface that extends another interface 
    // must override all the function made on top of it
    @Override
    public void bark(){
        System.out.println("BOW WOW");
    }
    @Override
    public int legs(){
        return 4;
    }
    @Override
    public void move(){
        System.out.println("husky move fast");
    }
    @Override
    public boolean eat(String food){
        System.out.println("husky eat fish");
        return false;

    }

}

// implements keyword to use interface 
class Wolf implements AnimalDo{
    // when implementing interface, all the function should be overridden
    @Override
    public void move(){
        System.out.println("would move fast");
    }
    @Override
    public boolean eat (String food){
        System.out.println("wolf eat meat");
        return false;
    }
}
class cow implements AnimalDo{
    @Override
    public void move(){
        System.out.println(" cow move slow ");


    }
    @Override
    public boolean eat(String food){
        System.out.println("cow eat grass");
        return true;
    }
}
/*
 * Task
 * Make an interface Media
 * make the following functions
 * void play()
 * void pause()
 * void next()
 * void previous()
 * String nowPlaying()
 * 
 * Make an interface DigitalMedia extending Media
 * make the following functions
 * double size()
 * double remaining(double current)
 * 
 * Make an interface OnlineAsset
 * make the following functions
 * void download()
 * 
 * Make a class Spotify and implement DigitalMedia and OnlineAsset
 */

interface media{
    public void play();
    public void pause();
    public void next();
    public void previous();
    public String NowPlaying();

}




