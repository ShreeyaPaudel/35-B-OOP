import java.util.ArrayList;
public class ArrayListloop {
    public static void main(String[] args) {
        /* Import ArrayList on top, import java.util.ArrayList */
        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(10);
        intArr.add(20);
        intArr.add(30);
        intArr.add(50);
        /* To loop ArrayList, same as array, get length/size first */
        /* To get length use .size */
        int arrLen = intArr.size();
        /* Loop from 0 to size/len -1 */
        for(int index = 0; index < arrLen; index ++){
            System.out.println("Index" + index + "Value" + intArr.get(index));
        }

        // Using for each
        for(Integer element:intArr){
            System.out.println(element);

}
    }
}
