import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/**
 * Created by pengtao on 6/3/16.
 */
public class MainTest {

    public
    @Rule
    TestName name = new TestName();

    public static AppiumDriver<MobileElement> driver = null;

    @Before
    public void setUp() throws MalformedURLException {
        File appDir = new File("/Users/pengtao/Desktop/560Driver_v200_test.ipa");
//        File app = new File(appDir,"560Driver_v200_test.ipa");
        System.out.println(appDir.getTotalSpace());
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "9.3");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "IPhone 6");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, appDir.getAbsolutePath());
        desiredCapabilities.setCapability("appiumVersion", "1.5.2");
        desiredCapabilities.setCapability("name", name.getMethodName());
        driver = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
    }

    @Test
    public void getName() {

        MobileElement mobileNum = driver.findElementByXPath
                ("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]");

        MobileElement password = driver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIASecureTextField[1]");

        mobileNum.sendKeys("18602108194");
        password.sendKeys("112233");
        MobileElement loginButton = driver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[1]");
        loginButton.click();

        File appDir = new File("/Users/pengtao/Desktop/");
        File app = new File(appDir, "560Driver_v200_test.ipa");
        System.out.println(app.getTotalSpace() + app.getAbsolutePath());

        File appDir3 = new File("/Users/pengtao/Desktop/560Driver_v200_test.ipa");
        System.out.println(appDir3.getTotalSpace() + appDir3.getAbsolutePath());
    }
}

