//If needed I can extend the Locators and add ones used
//for mobile testing if we are dealing with slight differences between mobile
// and website (like ones with xpath).
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MobileLocators extends Locators{

    private static WebElement element = null;

    public static WebElement searchField(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"header\"]/section/a[9]/i"));
        return element;
    }

    public static WebElement premierLeagueIcon(WebDriver driver){
        element = driver.findElement(By.cssSelector("i[style='background-image: url(https://cmssports.staticcache.org/assets/image/0006/656907/football-with_rule.png)']"));
        return element;
    }

    public static WebElement firstHomeTeamtoWin(WebDriver driver){
        element = driver.findElement(By.cssSelector("div[class='market-group marketW win-draw-win events-group-container']"))
                .findElement(By.cssSelector("button[class='btn betbutton oddsbutton']"));
        return element;
    }
    public static WebElement betslipButton(WebDriver driver){
        element = driver
                .findElement(By.id("toolbar"))
                .findElement(By.cssSelector("span[class='toolbar__icon icon-bet-slip']"));
        return element;
    }

    public static WebElement bettingWindow(WebDriver driver) {
        element = driver
                .findElement(By.id("bets-container-singles"))
                .findElement(By.cssSelector("span[class='betslip-selection__input-container ng-untouched ng-valid ng-dirty ng-valid-parse']"));

        return element;
    }

    public static WebElement currentOdds(WebDriver driver){
        element = driver.findElement(((By.cssSelector("span[class='betslip-selection__price']"))));
        return element;
    }
}
