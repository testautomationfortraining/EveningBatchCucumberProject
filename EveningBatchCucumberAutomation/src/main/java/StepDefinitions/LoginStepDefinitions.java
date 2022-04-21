package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
	
	WebDriver driver;

	@Given("^user is already in login Page$")
	public void user_in_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/");
		driver.manage().window().maximize();
	}
	
	@When("^user enters username and password$")
	public void user_enter_username_password() {
		WebElement username=driver.findElement(By.xpath("//input[@name='uid']"));
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		username.sendKeys("mngr398089");
		password.sendKeys("menUvAp");
	}
	
	@Then("^user clicks the login button$")
	public void user_clicks_login_button() {
		WebElement loginBtn=driver.findElement(By.xpath("//input[@name='btnLogin']"));
		loginBtn.click();
	}
	
	@Then("^user close the browser$")
	public void user_close_browser() {
		driver.close();
	}
}
