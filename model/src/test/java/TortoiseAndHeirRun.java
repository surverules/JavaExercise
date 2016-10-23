import com.backend.TortoiseAndHeir;

/**
 * Created by surverules on 10/15/2016.
 */
public class TortoiseAndHeirRun {

    public static void main(String[] Arg) {
        TortoiseAndHeir T1 = new TortoiseAndHeir();
        Thread t1 = new Thread(T1, "Tortoise");
        Thread t2 = new Thread(T1, "Heir");
        t1.start();
        t2.start();

    }
}
