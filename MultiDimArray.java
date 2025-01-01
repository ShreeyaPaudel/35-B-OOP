public class MultiDimArray {
    public static void main(String[] args) {
        /* one D array , one square bracket[] */
        int[] oneDArray;
        /* two D array, two square bracket [] [] */
        int [] [] twoDArray;
        /* three D array, three aquare brackets [] [] [] */
        int [] [] [] threeDArray;
        /* memory alloc, must give size to each dimension */
        twoDArray = new int[2] [3];
        /* visual
         * [
         * [0,0,0], -> 0
         * [0,0,0], -> 1
         * ]
         * 
         */
        // twoDArray[0] -> access the oth index array 
        twoDArray [0] [0] =10;
        twoDArray [0] [1] = 20;
        twoDArray[1] [0] = 100;
        twoDArray [1] [2] = 200;
        // access in variable, 
        int arrayElement = twoDArray [0] [0];
        System.out.println(arrayElement);
        System.out.println(twoDArray[0][1]);


        /* Make the following array 
         * [
         * [10, -10],
         * [20, -20],
         * [-30, 8]
         * [40, 45]
         * [50, 56]
         * ]
         * Print the value 
         * 50, 56
         */
        int [] [] arrTwo = {
            {10, -10},
            {20, -20},
            {-30, 8},
            {40, 45},
            {50, 56}
        };
            }
    
}
