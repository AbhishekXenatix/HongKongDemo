package stepDef;

import StepsPages.HKcode;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HK01Step {

    HKcode hKcode = new HKcode();

    @Given("chrome details available")
    public void chromeDetailsAvailable() {
        System.out.println("Check the test first ...");
    }

    @When("chrome driver open")
    public void chromeDriverOpen() {
        System.out.println("Check the test second  ...");
        hKcode.openURL();
    }

    @Then("check home page")
    public void checkHomePage() {
        System.out.println("Check the test third ...");
    }
}
