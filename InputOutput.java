import java.util.Scanner;
/*
* or use 
*import java.util.*; // imports all utils
*/
public class InputOutput {
    public static void main(String[] args) {
        /* User output
         * System.out.println("Print next line ");
         * "sout" for shortcut
         */
        System.out.println("This string breaks line ");
        /* system.out.print */
        System.out.print("this will not break line.");
        System.out.print("This will continue");
        /* system.out.printf
        string formattter
        %s String, %integer, %f floating point, %boolean
        */
        System.out.printf("Hello %s, Nice", "World");
        System.out.printf("This is num %d", 10);
        /*You can use multiple formatter */
        System.out.printf("Num %f and bool %b", 10.3f, false);
        /* user input */
        Scanner scan = new Scanner (System.in);
        System.out.println(" the following takes whole sentence");
        String wholeWString = scan.nextLine();
        System.out.println(" The input is "+ wholeWString);
        System.out.println("The following takes integer");
        int intInput = scan.nextInt();
        System.out.println(" The input is"+ intInput);
        System.out.println(" the following takes double ");
        double doubleInput = scan.nextDouble();
        System.out.println("The input is "+ doubleInput);
        System.out.println("The following takes boolean");
        boolean booleanInput = scan.nextBoolean();
        System.out.println(" The input is "+ booleanInput);
        scan.close();// close after taking all the input

        /* task 
         * make a new scanner object/variable scan1
         * Prompt the following
         * what is your name?-> save as string, name 
         * are you over 18? -> save as boolean, status
         * how many sibings? save as int, sibling
         * Print the following
         * Hello, name 
         * over 18? status
         * you have sibling num of sibling 
         * // comment the previous scanner for ease of use
         */

         Scanner scan1 = new Scanner (System.in);
         System.out.println("what is your name ?");
         String name = scan1.nextLine();
         System.out.println("Are you over 18");
         boolean status =scan1.nextBoolean();
         System.out.println(" How many sibling ?");
         int sibling = scan1.nextInt ();
         System.err.println("Hello"+ name );
         System.err.println("over 18?"+ status );
         System.out.println("you have "+ sibling + " no siblings ");
         scan1.close();





    }

}
