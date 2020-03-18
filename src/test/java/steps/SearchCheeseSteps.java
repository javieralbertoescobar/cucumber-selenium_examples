package steps;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchCheeseSteps {
    private final WebDriver driver = new ChromeDriver();
    @Given("I visit {string} web page")
    public void i_visit_web_page(String url) {
        driver.get(url);
        WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.tagName("input"), 0));

    }

    @When("I enter {string} in search")
    public void i_enter_in_search(String query) {
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(query);
        element.submit();
    }

    @Then("the page title should start with {string}")
    public void the_page_title_should_start_with(String titleStartsWith) {
        Assert.assertTrue(this.driver.getTitle().toLowerCase().startsWith(titleStartsWith));
        this.driver.close();
    }


}
