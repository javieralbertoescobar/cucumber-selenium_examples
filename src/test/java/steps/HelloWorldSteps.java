package steps;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelloWorldSteps {
    private final WebDriver driver = new ChromeDriver();
    private WebElement element;


    @Given("I open {string} web page")
    public void i_open_web_page(String url) {
        this.driver.get(url);
    }

    @When("the page site is loaded")
    public void the_page_site_is_loaded() {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.tagName("p"), 0));
        this.element = driver.findElement(By.tagName("p"));

    }

    @Then("the page should be display {string}")
    public void the_page_should_be_display(String message) {
        Assert.assertTrue(this.element.getText().equalsIgnoreCase(new StringBuilder(message).toString()));
        this.driver.close();
    }


}
