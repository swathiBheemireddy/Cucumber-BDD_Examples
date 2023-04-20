package StepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CheckBox {
	WebDriver driver;
//	@Given("user Registration form")
//	public void user_registration_form() {
//
//	System.out.println("hi");
//	System.setProperty("webdriver.chrome.driver",
//            "C:\\swathi_online training\\JarFiles\\Chromedriver\\Chromedriver111\\chromedriver.exe");
//
//	ChromeOptions options = new ChromeOptions();
//	options.addArguments("--remote-allow-origins=*");
//	 driver = new ChromeDriver(options);
//	//WebDriver driver = new ChromeDriver(options);//input[@id='hobbies-checkbox-2']
//	driver.navigate().to("https://demoqa.com/automation-practice-form");
//	}
//	@When("user enters firstname,surname,Mobile no or email address,New Password,Date of birth and Gender")
//	public void user_enters_firstname_surname_mobile_no_or_email_address_new_password_date_of_birth_and_gender() throws InterruptedException {
//	  List< WebElement> ckeckbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
//	  for(WebElement e:ckeckbox) {
//      	if(e.getAttribute("id").equalsIgnoreCase("hobbies-checkbox-2"))
//      	{
//      		e.click();
//      		Thread.sleep(2000);
//      	}
//       
//}
//}
	

	@Given("user click checkbox")
	public void user_click_checkbox() {
		System.out.println("hi");
		System.setProperty("webdriver.chrome.driver",
	            "C:\\swathi_online training\\JarFiles\\Chromedriver\\Chromedriver111\\chromedriver.exe");
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
		//WebDriver driver = new ChromeDriver(options);//input[@id='hobbies-checkbox-2']
		driver.navigate().to("https://demoqa.com/automation-practice-form"); 
		//driver.manage().timeouts().implicitlyWait(2000, null);
		  driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
	}
	@When("userselect the checkbox")
	public void userselect_the_checkbox() throws InterruptedException {
//	     WebElement ckeckbox=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']"));
//	     
	     //driver.findElement(By.xpath("//*[@id=\"hobbies-checkbox-3\"]")).click();
//		  for(WebElement e:ckeckbox) {
//  	if(e.getAttribute("id").equalsIgnoreCase("hobbies-checkbox-2"))
//  	{
//  		e.click();
//  		Thread.sleep(2000);
//  	}
//		WebElement checkBoxElement = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
//		boolean isSelected = checkBoxElement.isSelected();
//				
//		//performing click operation if element is not checked
//		if(isSelected == false) {
//			checkBoxElement.click();
//		}
		 WebElement r= driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
		 boolean isSelected = r.isSelected();
	     if(isSelected == false) {
	    	 r.click();
			}
		  }
	
	@When("select the checkbox button")
	public void select_the_checkbox_button() {
	  driver.close();
	}



}