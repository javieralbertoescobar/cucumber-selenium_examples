package steps;

import Modelo.Color;
import Modelo.Paper;
import io.cucumber.java.en.*;
import org.junit.Assert;


public class CustomTypeColorSteps {
    private Color testcolor;
    private Paper paper = new Paper();



    @Given("I have a {color} color")
    public void i_have_a(Color color) {
       this.testcolor = color;
    }

    @When("I paint with my color in a paper")
    public void i_paint_with_my_color_in_a_paper() {
        this.paper.colored(this.testcolor);
    }

    @Then("the paper is should be colored with {color}")
    public void the_paper_is_should_be_colored_with(Color color) {
        Assert.assertTrue(this.paper.isColored());
        Assert.assertEquals(this.testcolor,color);

    }


}
