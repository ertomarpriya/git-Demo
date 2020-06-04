package stepDefinations;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Automation.UdemyCucumberCourse.Testbase;
import PageObjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
	public class StepDefination2 {
	WebDriver driver;
	HomePage h;

	    @Given("^User is on greencart landing page$")
	    public void user_is_on_greencart_landing_page() throws Throwable {
	    	driver = Testbase.getDriver();
	    Thread.sleep(3000);
	    
	    	
	    }

	    @When("^User searched for \"([^\"]*)\" vegetable$")
	    public void user_searched_for_something_vegetable(String strArg1) throws Throwable {
	    	
	    	h = new HomePage(driver);
	    	h.getSearch().sendKeys(strArg1);	    
	    
	    }

	    @Then("^\"([^\"]*)\" results are displayed$")
	    public void something_results_are_displayed(String strArg1) throws Throwable {
	    	
	    	System.out.println(strArg1);
	    
	    	WebElement ele =driver.findElement(By.xpath("//div[@class = 'product']/h4"));
	    	String text = ele.getText();
	    	System.out.println(text);
	    	
	    	// Assert.assertTrue(text.contains(strArg1));
	    	
	// Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
	    
	  }

	    @And("^added items to cart$")
	    public void added_items_to_cart() throws Throwable {
	    	driver.findElement(By.cssSelector("a.increment"));
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]/button")).click();    
	    }
	    
	    @And("^user proceeded to checkout page for purchase$")
	    public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {
	    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img")).click();
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();
		    
	    }

	    @Then("^verify selected \"([^\"]*)\" items are displayed in checkout page$")
	    public void verify_selected_something_items_are_displayed_in_checkout_page(String strArg1) throws Throwable {
	    driver.findElement(By.cssSelector("p.product-name"));
	    	//	Assert.assertTrue(driver.findElement(By.xpath("<p class=\"product-name\">Brinjal - 1 Kg</p>")).getText().contains(strArg1));

	    }

	}

