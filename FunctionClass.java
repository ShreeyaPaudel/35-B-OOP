public class FunctionClass{
    /* function are made inside a class scope
    * aboveor below main, not inside 
    */
    void printSomething(){
        System.out.println("This function prints");
    }
    /* with return type */
    int returnInt(){
        int value = 10;
        return value;
    }
    double addValue(int num1, double num2){
        double sum = num1+num2;
        return sum;
    }
    /* make a function isEqual
     * that takes two double value and returns boolean
     * return if the values are equal or not 
     */
    
    boolean isEqual(double num1, double num2){
        boolean equal= num1 == num2;
        return equal;
    }
    
    public static void main(String[] args) {
        /* to call a normal non static function we need to create object
         * just remember the syntax for now
         */
        FunctionClass fc = new FunctionClass();
        /* Call function from object/ variable of FunctioClass  */
        fc.printSomething();
        /* can call multiple times */
        fc.printSomething();
        int returnFromFunction = fc.returnInt();
        System.out.println(" return from function is"+ returnFromFunction);
        double returnFromAdd = fc.addValue(10,20.2);
        System.out.println("Add returns"+ returnFromAdd);
        boolean returnFromBoolean = fc.isEqual(2,2);
        System.out.println("return from boolean is "+ returnFromBoolean);
    }
}
