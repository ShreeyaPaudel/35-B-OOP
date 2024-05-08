public class PrefixPostfix {
    public static void main(String[] args) {
        int prefixValue =10;
        System.out.println("Prefix willl update here" + ++prefixValue);
        System.out.println("it will remain the same"+ prefixValue);
        /* prefix is when you put operator in the left side of the value/var */

        int postFixValue = 20;
        System.out.println("Postfix willl update here" + postFixValue++);
        System.out.println("it will remain the same"+ postFixValue);
         /* postfix is when you put operator in the right side of the value/var */
    }
    
}
