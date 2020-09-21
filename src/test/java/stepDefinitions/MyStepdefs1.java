package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class MyStepdefs1 {
    WebDriver driver;


    @Given("^I navigate to blueskycitadelform site$")
    //@Given("I navigate to blueskycitadelform site")
    public void i_navigate_to_blueskycitadelform_site()  {
        //STEP 2: set your system path
        //System.setProperty("webdriver.gecko.driver", "/Users/Wiley/BlueSky/Gecko/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/Users/Wiley/BlueSky/Chrome/chromedriver");


        //STEP 3: Instantiate your firefox driver
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();


        //STEP 4: Navigate to url
        driver.get("http://blueskycitadel.com/");
    }

    @When("^I click on Automation Testing Form$")
    public void iClickOnAutomationTestingForm() {
        //WebDriverWait wait = new WebDriverWait(driver,30);
        //wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Automation Testing Form")));
        driver.findElement(By.linkText("Automation Testing Form")).click();
        //The above code will close the pop up and then click on the Automation Testing Form
    }

    @And("^I enter the single line text$")
    public void iEnterTheSingleLineText() {
        driver.findElement(By.xpath("//*[@id=\"nf-field-135\"]")).sendKeys("Bowwy");
    }

    @And("^I enter email$")
    public void iEnterEmail() {
        driver.findElement(By.xpath("//input[@type=(\"email\")]")).sendKeys("walex@yahoo.com");
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        driver.findElement(By.name("nf-field-144")).sendKeys("Olutosin");

    }


    @And("^I select two from Multi Select$")
    public void iSelectTwoFromMultiSelect() {
        //WebElement singleLineText = driver.findElement(By.name("nf-field-136"));
        //Select dropTwo = new Select(singleLineText);
        //dropTwo.selectByValue("two");
        new Select(driver.findElement(By.name("nf-field-136"))).selectByValue("two");
    }

    @And("^I select two numbers from multi select$")
    public void iSelectTwoNumbersFromMultiSelect() {
        WebElement multiSelect = driver.findElement(By.cssSelector("#nf-field-137"));
        Select multiSelector = new Select(multiSelect);
        multiSelector.selectByVisibleText("Two");
       multiSelector.selectByVisibleText("Three");

        //Trying to Re-factor the above code
        //new MulSelect(driver.findElement(By.cssSelector("#nf-field-137")))
    }



    @And("^I click three from radio list$")
    public void iClickThreeFromRadioList() {
        driver.findElement(By.cssSelector("#nf-label-class-field-138-2")).click();
    }

    @And("^I select one from checkbox list$")
    public void iSelectOneFromCheckboxList() {
        driver.findElement(By.id("nf-label-field-139-0")).click();
    }

    @And("^I select togo from country$")
    public void iSelectTogoFromCountry() {
        new Select(driver.findElement(By.name("nf-field-140"))).selectByVisibleText("Togo");
    }

    @And("^I enter a date$")
    public void iEnterADate() {
        driver.findElement(By.xpath("//*[@id=\"nf-field-141-wrap\"]/div[2]/div/input[2]")).sendKeys("08/09/2020");
    }

    @And("^I enter text into paragraph text$")
    public void iEnterTextIntoParagraphText() {
        driver.findElement(By.cssSelector("#nf-field-143")).sendKeys("I love automating things");
    }

    @And("^I click on submit$")
    public void iClickOnSubmit() {
       driver.findElement(By.cssSelector("#nf-field-133")) .click();
    }


    @Then("^My form should be submitted$")
    public void myFormShouldBeSubmitted() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(driver.findElement(By.cssSelector("#nf-form-9-cont > div > div.nf-response-msg > p:nth-child(1)")).getText(), "Your form has been successfully submitted.");
    }


    @Then("^I close my window$")
    public void iCloseMyWindow() {
        driver.close();
    }


    @And("^I close the pop up$")
    public void iCloseThePopUp() {
       // WebDriverWait wait = new WebDriverWait(driver,30);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"popmake-1342\"]/button"))).click();
    }
}
