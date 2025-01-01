public class ArrayClass{
    public static void main (String[] args){
        /* Array declaration */
        int[] myFirstArray;
        /* Memory alloc */
        myFirstArray = new int[5];
        /* Array declaration, memory alloc */
        int[] mySecondArray = new int[3];
        /* Array declaaration, memory allloc and initialization */
        int [] myThirdArray = {10, 20 , 30, 40};

        // Array index -> Position of elements/values
        // Starts with zero
        mySecondArray [0] = 10;
        mySecondArray [1] = 20;
        mySecondArray [2] = 100;
        // Access / store in new variable 
        int arrayElement = mySecondArray [0];
        System.out.println(" First Index" + arrayElement);
        System.out.println(" Second Index" + mySecondArray[1]);
    

        /* Task 1 
         * Make the following array named animals 
         * [" Cat" , "Dog", "Tiger", "Snake"]
         * prinnt " snake"
        */

        String[] myFourthArray = {" Cat" , "Dog", "Tiger", "Snake"} ;
        System.out.println(myFourthArray[3]);

    }
}