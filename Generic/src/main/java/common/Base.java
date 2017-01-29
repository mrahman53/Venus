package common;

import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by mrahman on 05/08/16.
 */
public class Base {


    //if this is android os or iOS.
    //What is the version of android and iOS
    //if it is real device or Emulator/Simulator
    //where app is located

        public static AppiumDriver ad = null;
        public String OS = null;
        public String deviceName = null;
        public String deviceType = null;
        public String appType = null;
        public String version = null;
        public File appDirectory = null;
        public File findApp = null;
        public DesiredCapabilities cap = null;


        @Parameters({"OS","appType","deviceType", "deviceName","version"})
        @BeforeMethod
        public void setUp(String OS,String appType,String deviceType,String deviceName,
                          String version)throws IOException,InterruptedException{

            if(OS.equalsIgnoreCase("ios")){
                if(appType.contains("iPhone")){
                    appDirectory = new File("iOS/src/app");
                    findApp = new File(appDirectory,"UICatalog6.1.app.zip");
                    if(deviceType.equalsIgnoreCase("RealDevice")){
                        cap = new DesiredCapabilities();
                        cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
                        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
                        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                        cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
                        ad = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                    }else if (deviceType.equalsIgnoreCase("Simulator")){
                        cap = new DesiredCapabilities();
                        cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
                        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
                        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                        cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
                        ad = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    }


                }else if(appType.equalsIgnoreCase("iPad 2")){
                    appDirectory = new File("iOS/src/app");
                    findApp = new File(appDirectory,"UICatalog6.1.app.zip");
                    if(deviceType.contains("RealDevice")){
                        cap = new DesiredCapabilities();
                        cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
                        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
                        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                        cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
                        ad = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                    }else if (deviceType.equalsIgnoreCase("Simulator")){
                        cap = new DesiredCapabilities();
                        cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
                        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
                        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                        cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
                        ad = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                    }
                }

            }else if(OS.contains("Android")){
                if(appType.contains("Phone")){
                    appDirectory = new File("Android/src/app");
                    findApp = new File(appDirectory,"snapchat.apk");
                    if(deviceType.equalsIgnoreCase("RealDevice")){
                        cap = new DesiredCapabilities();
                        cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
                        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
                        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                        cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
                        ad = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                    }else if (deviceType.equalsIgnoreCase("Emulator")){

                        cap = new DesiredCapabilities();
                        cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
                        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
                        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                        cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
                        ad = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    }

                }else if(OS.equalsIgnoreCase("Tablets")){
                    if(deviceType.equalsIgnoreCase("RealDevice")){
                        cap = new DesiredCapabilities();
                        cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
                        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
                        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                        cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
                        ad = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                    }else if (deviceType.equalsIgnoreCase("Emulator")){

                        cap = new DesiredCapabilities();
                        cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
                        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
                        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                        cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
                        ad = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
                        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    }
                }
            }
        }

            @AfterMethod
            public void cleanUpApp(){
                ad.quit();
            }

            public void clickByXpath(String locator){
                ad.findElement(By.xpath(locator)).click();
            }

            public void sleep(int sec)throws InterruptedException{
                Thread.sleep(1000 * sec);
            }

            public void clearField(String locator){
                ad.findElementsById(locator).clear();
            }
            public void clickByXpathOnIOS(String locator){
                //new TouchAction((MobileDriver) ad).tap(By.xpath(locator)).perform();
                ad.tap(1, ad.findElement(MobileBy.xpath(locator)), 200);
            }
            public void clickByID(String locator){
                ad.findElementById(locator).click();
            }
            public void clickByXpathWebElement(WebElement locator){
                locator.click();
            }
            public void clickOn(MobileElement locator){
                locator.click();
            }
            public void clickByName(String locator){
                ad.findElement(By.name(locator)).click();
            }
            public void clickByXpathIos(String locator){
                ((IOSElement)ad.findElementByXPath(locator)).click();
            }
            public void clickOnElement(String locator){
                try {
                    ad.findElement(By.xpath(locator)).click();
                }catch(Exception ex1){
                    //ex1.printStackTrace();

                    try{
                        ad.findElement(By.name(locator)).click();
                    }catch(Exception ex2) {
                        ex2.printStackTrace();
                    }
                }
            }
            public void typeByID(String locator, String value){
                ad.findElementById(locator).sendKeys(value);
            }

            public void typeByClasName(String locator, String value){
                ((IOSElement)ad.findElements(By.className(locator)).get(0)).sendKeys(value);
            }
            public void typeByXpath(String locator, String value, Key key){
                ad.findElement(By.xpath(locator)).sendKeys(value);
            }

            public void typeByName(String locator, String value){
                ad.findElementByName(locator).sendKeys(value);
            }

            public void typeByXpath(String locator, String value){
                ad.findElementByXPath(locator).sendKeys(value);
            }
            public void typeByXpathIos(String locator, String value){
                ((IOSElement)ad.findElementByXPath(locator)).setValue(value);
            }
            public void typeByXpathMobileElement(String locator, String value){
                ((MobileElement)ad.findElementByXPath(locator)).sendKeys(value);
            }
            public List<String> getTexts(List<WebElement> elements){
                List<String> text = new ArrayList<String>();
                for(WebElement element:elements){
                    text.add(element.getText());
                }

                return text;
            }

            public void touch(WebElement locator){
                TouchAction touchAction = new TouchAction(ad);
                touchAction.moveTo(locator);
            }

            public void swipeRightToLeft(){
                //ad.context("NATIVE_APP");
                Dimension size = ad.manage().window().getSize();
                int startx = (int) (size.width * 0.8);
                int endx = (int) (size.width * 0.20);
                int starty = size.height / 2;
                ad.swipe(startx, starty, endx, starty, 3000);

            }
            public void swipeLeftToRight(){
                Dimension size = ad.manage().window().getSize();
                int startx = (int) (size.width * 0.8);
                int endx = (int) (size.width * 0.20);
                int starty = size.height / 2;
                ad.swipe(endx, starty, startx, starty, 3000);
            }

            public void swipeUp(){
                //Get the size of screen.
                Dimension size = ad.manage().window().getSize();

                //Find swipe start and end point from screen's with and height.
                //Find starty point which is at bottom side of screen.
                int startx = (int) (size.width  / 2);
                //Find vertical point where you wants to swipe. It is in middle of screen height.
                int starty = (int) (size.height * 0.80);

                //Find endx point which is at left side of screen.
                int endx = (int) (size.width * 0.30);
                //Find endy point which is at top side of screen.
                int endy = (int) (size.height * 0.20);
                ad.swipe(startx, endy, startx, starty, 3000);

            }

            public void swipeDown(){
                //Get the size of screen.
                Dimension size = ad.manage().window().getSize();

                //Find swipe start and end point from screen's with and height.
                //Find starty point which is at bottom side of screen.
                int startx = (int) (size.width  / 2);
                //Find vertical point where you wants to swipe. It is in middle of screen height.
                int starty = (int) (size.height * 0.80);

                //Find endx point which is at left side of screen.
                int endx = (int) (size.width * 0.30);
                //Find endy point which is at top side of screen.
                int endy = (int) (size.height * 0.20);

                //ad.swipe(startx, endy, startx, starty, 3000);
                ad.swipe(startx, starty, startx, endy, 3000);

            }

            public void waitUntil(String locator){
                WebDriverWait wait = new WebDriverWait(ad, 20);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            }

            public void waitUntilClickable(String locator){
                WebDriverWait wait = new WebDriverWait(ad, 20);
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(locator)));
            }

            public String getTextByXpath(String locator){
                String text = ad.findElementByXPath(locator).getText();

                return text;
            }
            public String getTextById(String locator){
                String text = ad.findElementById(locator).getText();

                return text;
            }

            public void sleepFor(int time)throws InterruptedException{
                Thread.sleep(1000*time);
            }
            public void tapOn(String element){
                new TouchAction((MobileDriver) ad.findElement(By.xpath(element)));
            }

            public MobileElement findByXpathOnPlatform(Map<String, String> list) {
                MobileElement element = null;
                if (list.get("").equalsIgnoreCase("Android")) {
                    element = ((MobileElement) ad.findElementByXPath(list.get("")));
                    return element;
                } else if (list.get("").equalsIgnoreCase("iOS")){

                    element = ((MobileElement) ad.findElementByXPath(list.get("")));

                }
                return element;
            }
}
