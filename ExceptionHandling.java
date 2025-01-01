public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println(" program start ");
        int num1 = 10;
        try{
            int num2 = 10/10; //arithmetic exception exists here 
        }catch  (ArithmeticException ex){
            // ex will have the system generated msg
            System.out.println(" cannot divide by zero ");
        }finally{
            System.out.println(" finnaly runs wether exception occurs or not");
        }
        // catch and finaly are original, but wither, or both should not be present after try
        int [] numA = new int [5];
        numA[0] = 100;
        try{
        numA[100] = 1000; // ArrayIndexOutOfBoundsException - exists here 
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(" Array is not long enough");
        }
        // any object can be assigned values of null
        String data = null;
        try{

        System.out.println(data.length());// null pointer exception
        }catch (NullPointerException ex){
            System.out.println(" null value");
        }
        // multi layered exception
        try{
            int numMulti = 100/0;// arithmetic exception
            String d2 = null; // null pointer exception
            System.out.println(d2.length());
        }catch(ArithmeticException ex){
            System.out.println("number error");
        }catch(NullPointerException ex){
            System.out.println("null ayo");
        }finally{
            System.out.println("try end");
        }
        // exception 
        try{
            int num3 = 10/0;
            int [] numArr2 = new int [100];
            numArr2[10000] = 10;
        
        }catch ( Exception ex){
            System.out.println(" i catch all exception");
        }
        // note if you dont know what kind of exception your code throws 
        // use exception 
        // throw manully throw exception
        //throwexample();

        
// Task
        // Find the exception and use try catch block finally accordingly
        //int number1 = 10;
        //int number2 = number1 - 10;
        //int number3 = number1 / number2;
        //String name;
        //System.out.println(name.length());
        //String[] names = new String[100];
        //names[0] = "Ram";
        //names[110] = "Shyam";
    //  Task end


    try {
        int number1 = 10;
        int number2 = number1 - 10;
        int number3 = number1 / number2; 
    } catch (ArithmeticException ex) {
        System.out.println("Cannot divide by zero");
    } finally {
        System.out.println("Division finally block executed.");
    }

    try {
        String name = null;
        System.out.println(name.length()); 
    } catch (NullPointerException ex) {
        System.out.println("Null value encountered");
    } finally {
        System.out.println("Name finally block executed.");
    }

    try {
        String[] names = new String[100];
        names[0] = "Ram";
        names[110] = "Shyam"; 
    } catch (ArrayIndexOutOfBoundsException ex) {
        System.out.println("Index out of bounds");
    } finally {
        System.out.println("Names finally block executed.");
    }

    try {
        checkTry();
    } catch (Exception e) {
    }
      System.out.println("program end ");
    }
    static void throwexample(){
        throw new ArithmeticException (" where is the number");

    }
    static void checkTry() throws  Exception{
        System.out.println(" when running this function wrap around try catch");

    }

}




   



    //try{
      //  int num1 = 10;
        //int num2 = num1 - 10;
        //int num3 = num1/num2; // arithmetic operation may occur

        //String name;
        //String[] names = new String [100];
        //names[0] ="Ram";

    //}catch (ArithmeticException ex){
        //System.out.println("ArithmeticException caught:" + ex.getmessage());

    //}catch (NullPointerException e){
        //System.out.println("NullPointerException caught:" + ex.getmessage());
    //}

//}  


  

