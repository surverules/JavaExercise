import com.backend.StackNew;


/**
 * Created by surverules on 10/19/2016.
 */
public class StackNewRun {

    public static void main(String[] args) {
        StackNew<Integer> arr = new StackNew<Integer>(10);


        // Method one: We can push Individual Element in the Loop
        arr.push(5);
        arr.push(4);
        arr.push(3);
        arr.push(2);
        arr.push(1.1);

        arr.pop();
        arr.pop();
        arr.pop();
        arr.pop();
        arr.pop();

        //Method 2nd: Push all elements into Stack and ShowAll
        StackNew<Integer> arr1 = new StackNew<Integer>(10);
        Integer[] number = {10, 20, 30, 40, 50};
        arr1.push(number);
        arr1.popAll();


    }
}
