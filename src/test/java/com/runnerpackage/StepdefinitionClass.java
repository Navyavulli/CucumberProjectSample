package com.runnerpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefinitionClass {
	WebDriver driver;
	@Given("User is on Search page")
	public void user_is_on_Search_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sivakumar\\eclipse-workspace\\Firstday\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flyfrontier.com/deals/sales/promo-code/booknow");
	}

	@When("User selects Flight and passenger details")
	public void user_selects_Flight_and_passenger_details() {
		WebElement book = 	driver.findElement(By.xpath("//a(@href='flight'"));
		book.click();
	WebElement onetrip = 	driver.findElement(By.xpath("//input[@value = 'oneway']"));
		onetrip.click();
		WebElement dep = driver.findElement(By.xpath("//span[@tabindex = '-1'])[2]"));
		dep.click();
		
	   
	}

	@Then("User clicks the search button")
	public void user_clicks_the_search_button() {
	    System.out.println("ok");
	}


}
