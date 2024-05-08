public class ifelseclass {
    public static void main(String[] args) {
        /* if statementr*/
        if(true){
            System.out.println("True statemnt");
        }
        /* if taks boolean expression inside () */
        int num1 =10, num2 = 20;
        if(num1==num2){
            System.out.println(" equal");

        }else{
            System.out.println("Not equal");
        }
        /* note that else is optional */
        /* if else if */
        if (num1 == num2){
            System.out.println("equal");
        }else if (num1<num2){
            System.out.println("lesser");
        }else{
            System.out.println("Greater");
        }
        /* note that else should be at the last */
        /* if else if ladder */
        if(num1> num2){
            System.out.println("greater");
        }else if (num1 != num2){
            System.out.println(" not equal");
        }else if (num1==num2){
            System.out.println(" equal");
        }else{
            System.out.println(" default statement");
        }
        /* nested if statement */
        if(num1<0){
            if (num1> num2){
                System.out.println(" negative and greater");
            }else{
                System.out.println(" negative and lesser");
            }
        }else{
            if(num1> num2){
                    System.out.println("positive and greater");
            }else{
                System.out.println(" positive and lesser");
            
            }
        }
    
    
    }
 

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
int science = 35, english= 55, math = 89;
int total = science+english+math;
int avg= (science+english+math)/3;
if (science<35) && (english<35) && ()
