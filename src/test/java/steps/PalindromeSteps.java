package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class PalindromeSteps {
    private String testPalindrome;
    private boolean isPalindrome;

   @Given("^I entered string \"(.*?)\"$")
    public void i_entered_string(String toTest)  {
        testPalindrome = toTest;
    }

    @When("^I test it for Palindrome$")
    public void i_test_it_for_Palindrome()  {
        isPalindrome = testPalindrome.equalsIgnoreCase(new StringBuilder(testPalindrome).reverse().toString());

    }

    @Then("^the result should be \"(.*?)\"$")
    public void the_result_should_be(String result)  {
        boolean expectedResult = Boolean.parseBoolean(result);
        if (expectedResult) {
            Assert.assertTrue(isPalindrome);
        } else {
            Assert.assertFalse(isPalindrome);
        }

    }
}