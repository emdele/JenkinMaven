package StepDefinition;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class smokeTest {
	
	   WebDriver driver;
	@Test
	@Given("^I am on the home page with the url$")
	public void i_am_on_the_home_page_with_the_url() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ayodeji\\Desktop\\chromedriver.exe\\");
		   driver = new ChromeDriver();
	        driver.get("https://www.florida4less.co.uk/");
	    
	}

	@When("^I click the link$")
	public void i_click_the_link() throws Throwable {
		    driver.findElement(By.xpath("//*[@id=\"layout\"]/div[1]/header/div[4]/nav/ul/li[1]/a"));
	       
	   
	}

	@When("^Another link$")
	public void another_link() throws Throwable {
		 driver.findElement(By.xpath("//*[@id=\"layout\"]/div[1]/header/div[4]/nav/ul/li[2]/a"));
	  
	 
	}

	@Then("^I should be on the page$")
	public void i_should_be_on_the_page() throws Throwable {
	         driver.close();
	}

	
	
	
	
	
	
	
	
}
	
	