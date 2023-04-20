package StepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dropdown {
	WebDriver driver;
	@Given("user launch website")
	public void user_launch_website() {
		System.setProperty("webdriver.chrome.driver",
	            "C:\\swathi_online training\\JarFiles\\Chromedriver\\Chromedriver111\\chromedriver.exe");
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
		//WebDriver driver = new ChromeDriver(options);//input[@id='hobbies-checkbox-2']
		driver.navigate().to("https://demoqa.com/select-menu"); 
		  driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
	}

	@When("user select the dropdown")
	public void user_select_the_dropdown() throws InterruptedException {
//		Select dropdown=new Select(driver.findElement(By.id("oldSelectMenu")));
//	  dropdown.selectByIndex(3);
//	  Thread.sleep(4000);
//		Select dropdown=new Select(driver.findElement(By.xpath("//*[@id='cars']")));
//		if(dropdown.isMultiple()){
//			dropdown.selectByVisibleText("Audi");
//			Thread.sleep(2000);
//		}
//		WebElement r=driver.findElement(By.id("'withOptGroup"));
//		if(WebElement e :r)
//		{
//			
//		}
//		List<WebElement> r= driver.findElements(By.id("'withOptGroup"));
//        for(WebElement e:r) {
//        	if(e.getAttribute("value").equalsIgnoreCase("1"))
//        	{
//        		e.click();
//        		Thread.sleep(2000);
//        	}
        
//		driver.findElement(By.xpath("//input[@id='react-select-2-input'")).click();
//		//input[@id='react-select-2-input']
	}

	@Then("user closewebsite")
	public void user_closewebsite() {
	    driver.quit();
	}
}
