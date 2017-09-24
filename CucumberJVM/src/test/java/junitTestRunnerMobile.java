//I added Test Runner for mobile devices as well - as long as chrome
//can emulate it. I used Nexus 5 for the test itself.

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Data;
import pageObjects.Locators;
import pageObjects.MobileLocators;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class junitTestRunnerMobile {

    private static ChromeDriver driver;
    private static WebDriverWait wait;

    @BeforeClass
    public static void openBrowser(){
        System.setProperty("webdriver.chrome.driver",Data.chromeLocation);

        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "Nexus 5");

        Map<String, Object> chromeOptions = new HashMap<>();
        chromeOptions.put("mobileEmulation", mobileEmulation);

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        driver = new ChromeDriver(capabilities);
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
        MobileLocators.searchField(driver).click();
    }
    @Test
    public void C_enterRequiredText() {
        Locators.searchInput(driver).sendKeys("english premier league");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void D_selectRequiredLeague() {
        MobileLocators.premierLeagueIcon(driver).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void E_selectHomeTeamToWin() {
        MobileLocators.firstHomeTeamtoWin(driver).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void F_gotToBetslip(){
        MobileLocators.betslipButton(driver).click();
    }
    @Test
    public void G_clickBettingWindow() {
        Locators.bettingWindow(wait).click();
    }
    @Test
    public void H_placeBet() {
        Locators.bettingWindowInput(wait).sendKeys("0.05");
    }

    @Test
    public void I_assertTheOdds() {
        String s = Locators.currentOdds(driver).getText();
        assertEquals("2/1", s);
    }

    @Test
    public void J_assertTheReturnsOffered() {
        String d = Locators.currentReturnsOffered(driver).getText();
        assertEquals(2, Double.parseDouble(d),0.01);
    }
//    @AfterClass
//    public static void closeTheBrowser(){
//        driver.quit();
//    }
}