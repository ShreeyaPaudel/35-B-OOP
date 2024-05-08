public class Switchcase {
    public static void main(String[] args) {
        char charValue = 'b';
        int intValue = 10;
        switch (charValue){
            case 'a':
                System.out.println("Apple");
                break;
            case 'b':
                switch(intValue){
                    case 10:
                        System.out.println("Ten");
                        break;
                    case 20:
                        System.out.println();  
                        break;  
                }
                System.out.println("Ball");
                break;
            case 'c' :
                System.out.println("cat");
                break;
            default:
                System.out.println("Invalid");
                break;

        }
        /* Task
         * Use switch case for the following
         * 0- Sunday
         * 1- monday
         * 2- Tuesday
         * 3- Wednesday
         * 4- Thursday
         * 5- friday
         * 6- saturday
         * rest- Invalid
         */
        int day = 4;
        switch (charValue){
            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case :
                System.out.println("invalid");
                break;

            

        }
    }
}
