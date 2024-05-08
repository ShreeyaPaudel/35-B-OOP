import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        /*ncheck the same condition in whie for differenvce */
        int counter = 0;
        while(counter <0){
            System.out.println("the condition is false, it wont run");
        }
        do{
            System.out.println(" this runs first and then checks the condition");

        }while(counter<0);
        /* do while run at least once, even if the condition is false  */
        /* Task 
         * prompt user to enter a number
         * run loop and ask user the integer until the integer is negative
         */
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert a number");
        int inputInt = scan.nextInt();
        while(inputInt <-1000 || inputInt > 0){
            System.out.println("Number between -100-0only");
            inputInt = scan.nextInt();
        }
        System.out.println(("Condition Matched " + inputInt));
    scan.close();
    
}
}
