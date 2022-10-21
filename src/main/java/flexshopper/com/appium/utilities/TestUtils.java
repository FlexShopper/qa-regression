package flexshopper.com.appium.utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestUtils {
    static private Random random = new Random();

    public String dateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public String date() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public String time() {
        DateFormat dateFormat = new SimpleDateFormat("HH-mm-ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    /**
     * Logging() Method
     * @return
     */
    public Logger log() {
        return LogManager.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
    }

    /**
     *  Throws a RuntimeException with specific reason as to why test failed
     * Sets the global variable to halt all tests to true
     * @param failReason
     * @throws RuntimeException
     */
    public void failAndExitTests(String failReason) {
        Settings.haltRemainingTests = true;
        log().info("Failed for the following reason: " + "\"" + failReason + "\"");
        throw new RuntimeException("Failed for the following reason: " + "\"" + failReason + "\"");
    }
}
