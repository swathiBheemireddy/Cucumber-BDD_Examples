package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Alert {
	
	WebDriver driver;
	@Given("user  website")
	
	public void user_website() {
	
		System.setProperty("webdriver.chrome.driver",
	            "C:\\swathi_online training\\JarFiles\\Chromedriver\\Chromedriver111\\chromedriver.exe");
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
		//WebDriver driver = new ChromeDriver(options);//input[@id='hobbies-checkbox-2']
		driver.navigate().to("https://demoqa.com/alerts"); 
		  driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
	}
	@When("user select the Alert")
	public void user_select_the_alert() {
		driver.findElement(By.id("alertButton")).click();
	    Alert simpleAlert = (Alert) driver.switchTo().alert();
	    simpleAlert.accept();
	   
	}
	private void accept() {
		// TODO Auto-generated method stub
		
	}
	@Then("user close site")
	public void user_close_site() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




}
