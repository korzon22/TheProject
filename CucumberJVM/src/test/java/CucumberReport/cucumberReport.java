//I placed here subsequent test steps - with Cucumber Annotations
//Bet I want to place is parametrized - it can be defined in .feature file
//All Cucumber and Junit dependencies are added to pom.xml file
package CucumberReport;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Data;
import pageObjects.Locators;

import java.util.concurrent.TimeUnit;

public class cucumberReport {

    private static ChromeDriver driver;
    private static WebDriverWait wait;

    @Given("^I open the browser$")
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", Data.chromeLocation);
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @When("^I open the William Hill website$")
    public void A_openWebPage() {
        driver.get("http://sports.williamhill.com/betting/en-gb");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("^I choose to search the website$")
    public void  B_openSearchWindow() {
        Locators.searchField(driver).click();
    }

    @Then("^I enter the look-up text$")
    public void C_enterRequiredText() {
        Locators.searchInput(driver).sendKeys("english premier league");
    }

    @Then("^I select the Premier League$")
    public void D_selectRequiredLeague() {
        Locators.premierLeagueIcon(driver).click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("^I choose the first home team to win$")
    public void E_selectHomeTeamToWin() {
        Locators.firstHomeTeamtoWin(driver).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("^I place the bet \"([^\"]*)\"$")
    public void F_clickBettingWindow(String bet) {
        Locators.bettingWindow(wait).click();
        Locators.bettingWindowInput(wait).sendKeys(bet);
    }

    @Then("^Odds should be \"2/1\"$")
    public void H_assertTheOdds ()  {
        String s = Locators.currentOdds(driver).getText();
        Assert.assertEquals("2/1", s);
    }

    @Then("^Return offered should be \"2.1\"$")
    public void I_assertTheReturnsOffered() {
        String d = Locators.currentReturnsOffered(driver).getText();
        Assert.assertEquals(2, Double.parseDouble(d),0.01);

    }
    @Then("^I close the browser$")
    public static void closeTheBrowser(){
        driver.quit();
    }
}