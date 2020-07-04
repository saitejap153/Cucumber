package com.cts.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {

	WebDriver driver;
	
	@Given("User on homepage")
	public void user_on_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/lenovo/Downloads/chromedriver_win32(1)/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("User on login page")
	public void user_on_login_page() {
		driver.get("http://www.newtours.demoaut.com/");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
	   driver.findElement(By.name("userName")).sendKeys("saitejap800@gmail.com");
	   driver.findElement(By.name("password")).sendKeys("tejakannalu");
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
	   driver.findElement(By.xpath("//input[@name=\"login\"]")).click();
	}

	@Then("User lands on homepage")
	public void user_lands_on_homepage() {
	    driver.quit();
	}
}
