import com.backend.ErrorLogger;

/**
 * Created by surverules on 10/24/2016.
 *
 *      Singleton Object Creation:
 *          1. Test to indentify if we create multiple object does it return same object or create new object
 *             as per object instantiation
 *
 */
public class ErrorLoggerTest {

    public static void main(String[] args) {

        ErrorLogger e1 = ErrorLogger.newInstance();
        System.out.println("Count of Instance: " + e1.instancecount);
        System.out.println("Count of Instance: " + ErrorLogger.instancecount);
        ErrorLogger e2 = ErrorLogger.newInstance();
        System.out.println("Count of Instance: " + e2.instancecount);
        System.out.println("Count of Instance: " + ErrorLogger.instancecount);


    }
}
