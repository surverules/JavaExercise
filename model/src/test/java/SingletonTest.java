import com.backend.Singleton;
import sun.management.jmxremote.SingleEntryRegistry;

/**
 * Created by surverules on 10/24/2016.
 *
 *      Observations:
 *                      1. We can create a object of Final declared class.
 *                      2. It is not allowing to extend a final class.
 */
public class SingletonTest {

    public static void main(String[] args) {
        Singleton s1 = new Singleton(5);

        s1.setNum(5);
        System.out.println("Number Set: " + s1.getNum());
        s1.setNum(10);
        System.out.println("Number Set: " + s1.getNum());

    }
}
