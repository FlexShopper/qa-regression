package tsys.appium.utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.clipboard.HasClipboard;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tsys.utilities.TestUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardUtilities {
    static TestUtils utilities = new TestUtils();

    /**
     * closeKeyboard - Verifies if keyboard is open to be closed
     * @param driver
     */
    public static void closeKeyboard( AppiumDriver<?> driver )
    {

        try
        {
            //Using driver approach to close keyboard
            //Log.log(driver).info( "driver method to open/close keyboard" );
            driver.getKeyboard();
            SetDelay( 2000 );
            driver.hideKeyboard();
            utilities.log().info( "Keyboard closed" );
        }
        catch ( Exception e )
        {
            try
            {
                //Uses adb command to check if keyboard is open
                utilities.log().info( "Trying adb method to detected keyboard" );
                SetDelay( 2000 );
                Process p;
                p = Runtime.getRuntime().exec( "adb shell dumpsys input_method | grep mInputShown" );
                BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String           outputText = in.readLine();

                utilities.log().info( "outputText :" + outputText );

                //If open, then send hideKeyboard command
                if ( outputText.contains( "mInputShown=true" ) )
                {
                    utilities.log().info( "Keyboard open -- closing it" );
                    driver.hideKeyboard();
                    in.close();
                }
                else if ( outputText.contains( "mInputShown=false" ) )
                {
                    utilities.log().info( "Keyboard already closed -- nothing to do" );
                    in.close();
                }
                else
                {
                    utilities.log().info( "Empty adb command result" );
                    throw new IllegalArgumentException( "adb command empty result" );
                }
            }
            catch (IOException e1 )
            {
                //At this point neither keyboard closure worked
                utilities.log().info( "Neither keyboard closure worked" );
                e1.printStackTrace();
            }
        }
    }

    /**
     * SetDelay
     * @param milliSeconds
     */
    public static void SetDelay( int milliSeconds )
    {
        try
        {
            Thread.sleep( milliSeconds );
        }
        catch ( InterruptedException e )
        {
            System.out.println( "An error happened while in sleep" );
        }
    }

    /**
     * hideKeyboard_Android - Verifies if keyboard is open to be closed for Android
     * @param driver
     */
    public void hideKeyboard_Android(AppiumDriver<?> driver) {
        if (((AndroidDriver<?>) driver).isKeyboardShown()) {
            try {driver.hideKeyboard();} catch (Exception e) {}
        }
    }

    /**
     * setClipboardText - Alternate option to Send Keys
     * @param driver
     * @param locator
     * @param aTextToSend
     */
    private void setClipboardText(AppiumDriver driver, By locator, String aTextToSend) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator)).click();
            ((HasClipboard) driver).setClipboardText(aTextToSend);
        } finally {
            driver.quit();
        }
    }
}
