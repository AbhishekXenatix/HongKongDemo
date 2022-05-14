package stepDef;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class HK01Step {
    IOSDriver iosDriver;


    @Given("chrome details available")
    public void chromeDetailsAvailable() throws MalformedURLException, InterruptedException {

        System.out.println("Check the test first ...");
        DesiredCapabilities desiredCaps = new DesiredCapabilities();
        desiredCaps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12 Pro Max");
        desiredCaps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        desiredCaps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.2");
        desiredCaps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        desiredCaps.setCapability(MobileCapabilityType.APP, "/Users/abhishekgupta/Library/Developer/Xcode/DerivedData/WebDriverAgent-fxmsedpwfaalxlbcwefbceeuodem/Build/Products/Debug-iphonesimulator/IntegrationApp.app");


        iosDriver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCaps);

        System.out.println("success---------");

        iosDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        iosDriver.findElement(AppiumBy.accessibilityId("Alerts")).click();

        iosDriver.findElement(AppiumBy.accessibilityId("textField")).sendKeys("Hong Kong");
        Thread.sleep(3000);

        iosDriver.findElement(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"Create App Alert\"]")).click();

        iosDriver.switchTo().alert().accept();


    }

    @When("chrome driver open")
    public void chromeDriverOpen() {
        System.out.println("Check the test second  ...");
        //hKcode.openURL();
    }

    @Then("check home page")
    public void checkHomePage() {
        System.out.println("Check the test third ...");
    }
}
