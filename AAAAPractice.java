 import java.util.Scanner;
public class AAAAPractice {
    public static void main(String[] args) {
        /* // Type casting
        //Implicit
         * int a = 10;
         * long b = a;
         * float c = a;
         * System.out.println(a);
         * Sytsem.out.println (b);
         * System.out.println(c);
         * 
         * //Explicit
         * double x = 100.90;
         * int y = (int)x;
         * float z = (float) x;
         * System.out.println(y);
         * System.out.println(x)
         * System.out.println(z);
         */

        //  System.out.printf("hello %s, Nice",  "world");
        //  System.out.printf("\n This is shreeya and i am %d years old", 19);
        //  System.out.printf("\n My height is %f" , 5.2f);
        //  System.out.printf(" \n all these are %b" , true);

        //  Scanner scan = new Scanner (System.in);
        //  System.out.println("What is your name ");
        //  String name = scan.nextLine();
        //  System.out.println("enter your age");
        //  int age = scan.nextInt();
        //  System.out.println("My name is " + name + " and i am " + age + " years old");
        //  scan.close();

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

        //  Scanner scan1 = new Scanner(System.in);
        //  System.out.println("What is your name");
        //  String name = scan1.nextLine();
        //  System.out.println("\n Are you over 18?");
        //  Boolean status = scan1.nextBoolean();
        //  System.out.println("\n how many siblings");
        //  int sibling  = scan1.nextInt();
        //  System.out.println("Hello," + name + "\n over 18? " + status + "\n you have " +sibling + " number of sibling");
        //  scan1.close();

         /* Task 1
 * wap to print whether a variable is greater or equal to 18
 */
// int a = 20;
// boolean b = a >= 10;
// System.out.println(b);

// // Ternary operators
// int x= 20 , y = 10;
// String output;
// //output = x >= y ? "true statement" : "false statement";
// int intoutput = x >= y ? 20:10;
// //System.out.println(output);
// System.out.println(intoutput);





/* Task 2
 * wap to print simple interest from variables 
 * make a 3 variable for amount, time and rate and save the calculation into si
 * Formula :si= amounnt * time * rate /100;// use float/ double 
 */


//  int amount = 2000;
//  int time = 2;
//  int rate = 2;
//  float si = (amount*time*rate / 100);
//  System.out.println(" si is =" + si + ".");




/* task 3
 * wapn to print the area and perimeter of rectange 
 * area= length*breadth
 * perimeter = 2 * length + breadth
 */
// int length = 2;
// int breadth = 2;
// int area = (length * breadth );
// int perimeter = (2 * length + breadth);
// System.out.println("area is " + area + " \n Perimeter is " + perimeter + "."); 



/* task 4 
 * complete the task 1 using ternary operators 
 */


/* Task
consider the following marking
calculate the total and avg in a varaiblee 
if any of the marking is less than 35, print fail
if avg is less than 60, print third division 
if avg is less than 70, print second div
if avg is less than 80, print first div 
if avg is equal or greater than 80, print distinction 
if avg is less than 0 or more than 100, print invalid 
*/

// int aa = 20, bb = 20 , c = 20 ;
// int t = (aa+bb+c);
// float av = ( aa+bb+c /2);
// System.out.println("total is " + t + "\n average is " + av + ".");




// if ( t < 35 && av < 35){
//     System.out.println(" fail");
// }else if (av < 60 ){
//     System.out.println("third division");
// }else if ( av < 70 ){
//     System.out.println(" second division");
// }else if (av < 80){
//     System.out.println("first  year");
// }else if (av >= 80){
//     System.out.println("Distinction");
// }else if ( av < 0 || av>100){
//     System.err.println("Invalid");
// }



// Scanner scan3 = new Scanner (System.in);
// System.out.println("Enter year");
// int year = scan3.nextInt();

// if( year %4 == 0){
//     System.out.println("It is a leap year");
// }else if ( year %100 == 0 && year %400 == 0){
//     System.out.println("It is a leap year");
// }else {
//     System.out.println("It is not a leap year");

// }


//   //1. Write a program that asks your name and prints “Hello your name” five times. Use a loop.
     
//   Scanner scan7 = new Scanner (System.in);
//   System.out.println("What is your name");
//   String name = scan7.nextLine();
//   int count = 0;
//   while (count<5){
//       System.out.println("hello" + name + ".");
//       count ++;
//   }
     
//     }
    


//       Student st = new Student(676, "Shreeya Paudel", 3.85);
//       st.printProfile();
//       st.updateGpa(3.80);
//       System.out.println("Updated GPA");
//       st.printProfile();
//         // Creating a new bank account
//     }
// }

// class Student{
//   public int studentId;
//   public String name;
//   public double GPA;

//   public Student(int studentId, String name, double GPA ){
//     this.studentId = studentId;
//     this.name = name;
//     this.GPA = GPA;
//   }

//   public void updateGpa(double newGPA){
//     this.GPA = GPA;
//   }

//   public void printProfile(){
//     System.out.println("student id is" + studentId);
//     System.out.println("name is1" + name);
//     System.out.println("GPA is" + GPA);
//   }
// }



    }
}



 