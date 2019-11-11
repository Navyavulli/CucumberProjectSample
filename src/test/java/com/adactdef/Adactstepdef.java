package com.adactdef;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactstepdef {
	WebDriver driver;
	@Given("User is on Hotel login page")
	public void user_is_on_Hotel_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sivakumar\\eclipse-workspace\\Firstday\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/");
		driver.manage().window().maximize();
	}

	@When("User enters Username and password and click the login button")
	public void user_enters_Username_and_password_and_click_the_login_button() {
	 WebElement username = driver.findElement(By.id("username"));
	 username.sendKeys("Vikram");
	 
	 WebElement password = driver.findElement(By.id("password"));
	 password.sendKeys("@1234");
	 	
	 WebElement login = driver.findElement(By.id("login"));
	 login.click();
	 	
	}

	@Then("User enters into the next page")
	public void user_enters_into_the_next_page() {
	String loginpage = 	driver.getWindowHandle();
	
	Set<String> op = driver.getWindowHandles();
	for(String x: op) {
if(!loginpage.equals(x)) {
	System.out.println("loggedin successfully");
}
	else{
		System.out.println("login not successful");
		
	}

}	
	}
	}