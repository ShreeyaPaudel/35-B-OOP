public class ArrayLoop {
    public static int arrayFinder(String[] array, String find){
        for (int index = 0; index<= array.length; index++){
            if (array[index]== find ){
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = new int[4];
        arr[0] = -10;
        arr[1] = 0;
        arr[2] = 10;
        arr[3] = 20;

        /* we need length of array first, use.length */
        int arrayLength = arr.length;
        /* Loop from 0 - (arrayLength - 1), 0-3 */
        for (int index = 0; index < arrayLength; index ++){
            System.out.println(arr[index]);
        }
        // or.use condition, index <= arrayLength - 1
        System.out.println(" Descending loop");
        for(int index = arrayLength - 1; index>=0; index--) {
            System.out.println(arr[index]);
        }

        /* loop the arr using while loop */
        int index =0;
        while (index < arrayLength){
            System.out.println(arr[index]);
            index +=1;
        }


        
         /* Make an array pf [ "john", "doe", "foo", "bar"]
         * Loop the array and find in which index is "Foo" on 
         * Print the index
         */

         /* make the function for the above name arrayFinder
          * takes array of string and string as parameter
          return index if 2nd valuee matches any eelemt of array 
          else return -1
          print the returned index value 
          */
          
        
    }
    
}
