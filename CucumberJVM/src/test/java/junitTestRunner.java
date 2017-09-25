//I added Test Runner for junit as well.
//To be sure that execution is in order added used FixMethodOrder along
//with steps named in alphabetical manner.
//I placed the assertions at the end.
//If we had more complicated steps, I could add another Page Object -
//let's say Actions - with defined click or send keys in it - and
//use a single method for single step.
//As I'm getting constatnt issues with my internet connection I added
//Thread.sleep -5 secs- better be safe than sorry.

import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Data;
import pageObjects.Locators;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class junitTestRunner {

    private static ChromeDriver driver;
    private static WebDriverWait wait;

    @BeforeClass
    public static void openBrowser(){
        System.setProperty("webdriver.chrome.driver",Data.chromeLocation);
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Test
    public void A_openWebPage(){
        driver.get(Data.webpage);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void B_openSearchWindow(){
        Locators.searchField(driver).click();
    }
    @Test
    public void C_enterRequiredText() {
        Locators.searchInput(driver).sendKeys("english premier league");
    }

    @Test
    public void D_selectRequiredLeague() {
        Locators.premierLeagueIcon(driver).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void E_selectHomeTeamToWin() {
        Locators.firstHomeTeamtoWin(driver).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void F_clickBettingWindow() {
        Locators.bettingWindow(wait).click();
    }
    @Test
    public void G_placeBet() {
        Locators.bettingWindowInput(wait).sendKeys("0.05");
    }

    @Test
    public void H_assertTheOdds() {
        String s = Locators.currentOdds(driver).getText();
        assertEquals("2/1", s);
    }

    @Test
    public void I_assertTheReturnsOffered() {
        String d = Locators.currentReturnsOffered(driver).getText();
        assertEquals(2, Double.parseDouble(d),0.01);
    }

    @AfterClass
    public static void closeTheBrowser(){
        driver.quit();
    }
}