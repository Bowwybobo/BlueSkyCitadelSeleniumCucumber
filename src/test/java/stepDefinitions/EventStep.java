package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EventStep {
    WebDriver driver;


    @When("^I click on events$")
    public void i_click_on_events() {
        driver.findElement(By.linkText("Events")).click();
    }


    @And("^I enter a date in Events In$")
    public void iEnterADateInEventsIn() {
        driver.findElement(By.cssSelector("#tribe-bar-date")).sendKeys("2020-02");
    }

    @And("^I enter a word in the search bar$")
    public void iEnterAWordInTheSearchBar() {
        driver.findElement(By.xpath("//input[@name=\"tribe-bar-search\"]")).sendKeys("Wadd up");
    }

    @And("^I click on find events$")
    public void iClickOnFindEvents() {
        driver.findElement(By.xpath("//input[@name='submit-bar']")).click();
    }

    @Then("^I should see the events for the selected month$")
    public void iShouldSeeTheEventsForTheSelectedMonth() {
    }
}
