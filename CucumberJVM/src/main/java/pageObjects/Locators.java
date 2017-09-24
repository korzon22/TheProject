//I use Locators for location of elements I'm going to use,
//like buttons, input or text to assert.
//I'm using different approaches to locate the elements - id, xpath, class, css selectors.
//I can get a single element or more than one element - Arraylist is used in such case.
//Wait is used in few cases - to make sure that element is available.

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Locators {

    private static WebElement element = null;

    public static WebElement searchField(WebDriver driver){
        element = driver.findElement(By.linkText("Search"));
        return element;

    }

    public static WebElement searchInput(WebDriver driver){
        element = driver.findElement(By.id("search-input"));
        return element;
    }

    public static WebElement premierLeagueIcon(WebDriver driver){
        List<WebElement> items = driver.findElements(By.linkText("Premier League"));
        return items.get(1);
    }

    public static WebElement firstHomeTeamtoWin(WebDriver driver){
        element = driver.findElement(By.cssSelector("div[class='market-group marketW win-draw-win events-group-container']"))
                .findElement(By.cssSelector("button[class='btn betbutton oddsbutton']"));
        return element;
    }
    public static WebElement bettingWindow(WebDriverWait wait) {
        element = wait.until(ExpectedConditions.elementToBeClickable((By.className("betslip-selection__input-container"))));
        return element;
    }

    public static WebElement bettingWindowInput(WebDriverWait wait) {
        element = wait.until(ExpectedConditions.elementToBeClickable((By.className("betslip-selection__stake-input"))));
        return element;
    }

    public static WebElement currentOdds(WebDriver driver){
        element = driver.findElement(((By.className("betbutton__odds"))));
        return element;
    }

    public static WebElement currentReturnsOffered(WebDriver driver){
        element = driver.findElement(By.id("total-to-return-price"));
        return element;
    }

}
