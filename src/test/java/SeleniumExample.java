import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

public class SeleniumExample {
    public static void main(String ags[]) throws  Exception{
        WebDriver web_driver = new ChromeDriver();
        web_driver.navigate().to(new URL("https://www.google.com"));
        /*WebDriverWait wait = new WebDriverWait(web_driver,10000);
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.tagName("input"),0));
        WebElement input = web_driver.findElement(By.cssSelector("#lst-ib"));
        input.sendKeys("Javier Escobar");
        input.sendKeys(Keys.ENTER);*/
        web_driver.quit();


    }
}
