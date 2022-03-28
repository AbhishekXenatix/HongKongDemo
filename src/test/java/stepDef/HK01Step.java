package stepDef;

import DriverManager.BaseDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HK01Step extends BaseDriver {
    @Given("chrome details available")
    public void chromeDetailsAvailable() {

        System.out.println("Check the test first ...");


    }

    @When("chrome driver open")
    public void chromeDriverOpen() {

        System.out.println("Check the test second  ...");
    }

    @Then("check home page")
    public void checkHomePage() {

        System.out.println("Check the test third ...");


    }
}
