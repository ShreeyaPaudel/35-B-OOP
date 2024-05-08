public class FoorLoop {
    public static void main(String[] args) {
        /* For loop takesz initialization
         * condition
         * modiify/update
         */
        for (int index = 0; index<=5; index ++){
            System.out.println("For Index");
        }
        /* can use different update logic like
        *for (int index = 0; index<=5; index +=3
        */
        /* using decrement */
        for (int index=0; index>=0; index--){
            System.out.println("For index Decrement"+ index);
        }
        /*Task
         * make a multiplication table of 2
         * foe eg
         * 2*1 =2
         * 2*2 = 4
         * ..
         * 2*10= 20
         * note:loop from one to 10 and multiply the index
         */
        for ( int index =1; index <=10; index++){
            System.out.println("2x"+ index + "="+ 2*index);
        
            /* Nested for loop
         * Using for loop inside the scope of for loop */
        for(int outer = 0; outer < 2; outer ++){
            for(int inner = 3; inner > 0; inner--){
                System.out.println("Inner Index " + inner);
            }
            System.out.println("Outer Index " + outer);
        }

        }
        /* Task
         * Make a multiplication table like the following
         * Multiplication table of 10
         * 10 x 1 = 10
         * 10 x 2 = 20
         * ..
         * 10 x 10 = 100
         * ..
         * Multiplication table of 1
         * 1 x 1 = 1
         * 1 x 2 = 2
         * ..
         * 1 x 10 = 10
         */
    }
    
}
