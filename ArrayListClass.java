import java.util.ArrayList;
public class ArrayListClass {
    public static void main(String[] args) {
        /* import array  list from java.util at the top
         * cannot use primitive data type, use warapper for it 
          */
          ArrayList<Integer> arrayList1 = new ArrayList<>();
          /* to add on array list  */
          arrayList1.add(10);
          arrayList1.add(20);
          System.out.println(arrayList1);    
          /* can also add at index directly */ 
          arrayList1.add(1,-20);
          /* this will shift the current element in the 1st index to 2nd index */
          System.out.println(arrayList1);
          /* To remove .remove(index)  */
          arrayList1.remove(0); // will remove 0th index element and shift 1st to 0
          System.out.println(arrayList1);
          /* to update. set (index, value ) */
          arrayList1.set(0, -200);
          System.out.println(arrayList1);
          /* to access. get (index) */
          System.out.println("oth index element" +  arrayList1.get(0));

        /* Task
         * Make ArrayList of the following
         * ["Apple", "Orange", "Banana", "Water Melon", "Pineapple"]
         * Add "Grapes" in 1 index
         * Remove Orange from the arrayList
         * Remove Water Melon
         * Add  Pear in 0th index
         * Change "Pineapple" to "Avacado"
         * Change "Apple" to "Cherry"
         * Note: Print on every add and remove to get the new index of ArrayList
          */
         ArrayList<String> fruits = new ArrayList<>();
         fruits.add("apple");
         fruits.add("orange");
         fruits.add("banana");
         fruits.add("watermelon");
         fruits.add("mango");
         System.out.println(fruits);
         fruits.add(1, "grapes");
         System.out.println(fruits);
         fruits.remove(2);
         System.out.println(fruits);
         fruits.remove(3);
         System.out.println(fruits);
         fruits.add(0, "pear");
         System.out.println(fruits);
         fruits.set(4, "Avocado");
         System.out.println(fruits);
         fruits.set(1, "cherry");
         System.out.println(fruits);
         
    
        


    }
    
}
