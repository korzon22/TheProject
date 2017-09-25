//I added here a simple method of using keypad on Mobile Device, which
//is simulated by Chrome

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Action {
    public static void putValueOnMobileKeypad(WebDriver driver, String value){
        for (int i=0; i<value.length(); i++){
            char[] v = value.toCharArray();
            char currentValue = v[i];
            driver.findElement(By.cssSelector("button[data-value='"+currentValue+"']")).click();
        }
    }
}
