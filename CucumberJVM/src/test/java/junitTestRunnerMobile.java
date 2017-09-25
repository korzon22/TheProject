//I added Test Runner for mobile devices as well - as long as Chrome
//can emulate it.

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Action;
import pageObjects.Data;
import pageObjects.Locators;
import pageObjects.MobileLocators;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class junitTestRunnerMobile {

    private static ChromeDriver driver;
    private static WebDriverWait wait;

    @BeforeClass
    public static void openBrowser(){
        System.setProperty("webdriver.chrome.driver",Data.chromeLocation);

        Map<String, Object> deviceMetrics = new HashMap<>();
        deviceMetrics.put("width", 350);
        deviceMetrics.put("height", 500);
        deviceMetrics.put("pixelRatio", 2);

        Map<String, Object> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceMetrics", deviceMetrics);
        mobileEmulation.put("userAgent", "Mozilla/5.0 (iPad; CPU OS 7_0 like Mac OS X) AppleWebKit/537.51.1 (KHTML, like Gecko) Version/7.0 Mobile/11A465 Safari/9537.53");

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
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void G_clickBettingWindow() {
        MobileLocators.bettingWindow(driver).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void H_placeBet() {
        Action.putValueOnMobileKeypad(driver, "0.05");
    }

    @Test
    public void I_assertTheOdds() {
        String s = MobileLocators.currentOdds(driver).getText();
        assertEquals("2/1", s);
    }

    @Test
    public void J_assertTheReturnsOffered() {
        String d = Locators.currentReturnsOffered(driver).getText();
        assertEquals(2, Double.parseDouble(d),0.01);
    }
    @AfterClass
    public static void closeTheBrowser(){
        driver.quit();
    }
}