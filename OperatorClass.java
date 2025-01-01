public class OperatorClass {

    public static void main(String[] args) {
        // /*Arithematic operatords */
        // int aNum1 = 10, aNum2 = 20;
        // int sum = aNum1 + aNum2; //"+" is an arithematic operator 
        // System.out.println("Addition is " + sum);
        // System.out.println("Substraction is " + (aNum1 - aNum2));
        // System.out.println("Multiplication is" + (aNum1 * aNum2));
        // System.out.println("Division is "+ (aNum1/aNum2));
        // System.out.println("Modulo is " + (aNum1 %  aNum2));
        // /* Assignment operator */
        // int asNum1 = 20; // = is used to assign a value to variable 
        // asNum1+=1; // same as aNum1= asNum1 + 1;
        // System.out.println("+= value is "+ asNum1);
        // System.out.println("-= value is " +(asNum1-=10));
        // System.out.println("*= value is " + (asNum1 *=10));
        // System.out.println("/= value is " + (asNum1/=2));
        // System.out.println("%= value is "+ (asNum1%=3));
        // /* Relational Operator */
        
        // /* Logical Operator */
        // int lNum1 = 20 , lNum2 = 20;
        // boolean lExpression1 = lNum1 == lNum2;
        // boolean lExpression2 = lNum1 > lNum2;
        // System.out.println("&& is used for AND" + (lExpression1 && lExpression2));
        // System.out.println("|| is used for OR" + (lExpression1 || lExpression2) );
        // System.out.println("! is used for NOT" + (!lExpression1));
        // /* Unary operator */
        // int uNum1 = 10;
        // uNum1++; // uNum = uNum + 1; // changes value in next line 
        // ++uNum1; // changes value in this same line 
        // System.out.println("--uNum1 unary is"+ --uNum1 );
        // System.out.println("uNum1-- unary is "+ uNum1--);
        // /* Ternary Operator */
        // int tNum1 = 20, tNum2 = 10;
        // String Output;
        // /* take following if else as example
        //  * if (tNum1> tNum2){
        //  * output = "True Statement";
        //  * }else{
        //  * output= "False Statement";
        //  * }
        //  */
        //  Output= tNum1> tNum2 ? "True Statement": "False Statement";
        //  /* hare ternary operator contains expression 
        //  *if expression is true it returns after the "?
        //  *if the expression is false it returns after the ":" 
        // */
        //  int intOutput = tNum2 == tNum1 ?-10:10;
        //  System.out.println(Output);
        //  System.out.println(intOutput);  
          
/* Task 1
 * wap to print whether a variable is greater or equal to 18
 */
int a = 20;
boolean b = a >= 10;
System.out.println(b);

// Ternary operators
int x= 20 , y = 10;
String output;
//output = x >= y ? "true statement" : "false statement";
int intoutput = x >= y ? 20:10;
//System.out.println(output);
System.out.println(intoutput);





/* Task 2
 * wap to print simple interest from variables 
 * make a 3 variable for amount, time and rate and save the calculation into si
 * Formula :si= amounnt * time * rate /100;// use float/ double 
 */


 int amount = 2000;
 int time = 2;
 int rate = 2;
 float si = (amount*time*rate / 100);
 System.out.println(" si is =" + si + ".");




/* task 3
 * wapn to print the area and perimeter of rectange 
 * area= length*breadth
 * perimeter = 2 * length + breadth
 */
int length = 2;
int breadth = 2;
int area = (length * breadth );
int perimeter = (2 * length + breadth);
System.out.println("area is " + area + " \n Perimeter is " + perimeter + "."); 



/* task 4 
 * complete the task 1 using ternary operators 
 */



 
    }
}