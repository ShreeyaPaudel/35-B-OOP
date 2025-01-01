public class ConstructorRevise {
    public static void main(String[] args) {
      NonParameterizedconstructor np = new NonParameterizedconstructor();
      System.out.println(np.data2);  
      parametarizedConstructor pc = new parametarizedConstructor(10, "ram2");
      System.out.println(pc.data2);
      pc.data2 = "changing";
      //pc.data1 = 100; //
      pc.setData1(100);
      // System.out.println(pc.data1);//  
      System.out.println(pc.getData1());
      song s1 = new song ("west coast", 02);
      song s2 = new song ("summertimme sadness", 3); 


    }
}

//Task 
// Make a class Song
// make 4 private property id, title, duration and artists
// make 2 public property album and description
// make constructor to set title and duration only
// make setter for id, duration and artists
// make getter for id, title, duration and artists
// make 2 object of Song
// Fill all the attributes
// Change the duration of 1st object
// Change the artists of 2nd object
// Print the following for both object
// Output
// Song 1
// Title: ABC
// Duration: 10
// Artists: XYZ
// Album: XX
// Description: Lorem Ipsum
// Song 2
// ..

class song{
    private int id;
    private String title;
    private int duration;
    private String artists;
    public String album;
    public String description;
    song (String title, int duration){
        this.title = title;
        this.duration = duration;

    }
    void settitle(String title){
        this.title=title;
    }
    void setid(String title){
        this.title=title;
    }
    void setduration(int duration){
        this.duration = duration;
    }
    int getid(){
        return id;
    }
    String gettitle(){
        return title;
    }
    int getduration(){
        return duration;
    }
    String getartists(){
        return artists;
}

}

class parametarizedConstructor{
    private int data1; //this.data1
    String data2;
    void setData1(int data1){
        this.data1 = data1;
    }
    // read only access to private property//
    int getData1(){
        return this.data1;

    }

    parametarizedConstructor(int data1, String data2){
        this.data1 = data1;
        this.data2 = data2;



    }
}

class NonParameterizedconstructor{
    private int data1;
    String data2;
    NonParameterizedconstructor(){
        data1 = 10;
        data2 = "ram";
        System.out.println(" running in object creation");
    }
}
