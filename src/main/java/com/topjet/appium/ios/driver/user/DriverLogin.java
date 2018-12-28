package com.topjet.appium.ios.driver.user;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;



/**
 * Created by pengtao on 6/7/16.
 */
public class DriverLogin {

    /**
     * 司机版密码登录
     * @param driver
     */
    public static void loginByPassword(IOSDriver<MobileElement> driver) {
        MobileElement mobileNum = driver.findElementByXPath
                ("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]");

        MobileElement password = driver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIASecureTextField[1]");

        mobileNum.sendKeys("18602108194");
        password.sendKeys("112233");
        MobileElement loginButton = driver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[1]");
        loginButton.click();
    }

    /**
     * 司机版验证码登录/验证码登录需服务端配合写死验证码
     * @param driver
     */
    public static void loginByCode(IOSDriver<MobileElement> driver){
        MobileElement mobileNum = driver.findElementByXPath
                ("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]");

        MobileElement password = driver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIASecureTextField[1]");

        mobileNum.sendKeys("18602108194");
        password.sendKeys("112233");
        MobileElement loginButton = driver.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[1]");
        loginButton.click();
    }
}
