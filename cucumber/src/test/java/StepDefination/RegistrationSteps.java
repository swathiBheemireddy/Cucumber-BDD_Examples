package StepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {
	WebDriver driver;
	
	@Given("user Registration form")
	public void user_registration_form() {

	System.out.println("hi");
	System.setProperty("webdriver.chrome.driver",
            "C:\\swathi_online training\\JarFiles\\Chromedriver\\Chromedriver111\\chromedriver.exe");

	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	 driver = new ChromeDriver(options);
	//WebDriver driver = new ChromeDriver(options);
	driver.navigate().to("https://www.facebook.com/reg/");
	}

	@When("user enters firstname,surname,Mobile no or email address,New Password,Date of birth and Gender")
	public void user_enters_firstname_surname_mobile_no_or_email_address_new_password_date_of_birth_and_gender() throws InterruptedException {
	    driver.findElement(By.name("firstname")).sendKeys("swathi");
	    Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("bheemireddy");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("bheemireddyswathi2@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("Swathi@24");
        Thread.sleep(2000);
        driver.findElement(By.id("day")).sendKeys("21");
        Thread.sleep(2000);
        driver.findElement(By.id("month")).sendKeys("july"); 
        Thread.sleep(2000);
        driver.findElement(By.id("year")).sendKeys("1987");
        Thread.sleep(2000);
       // driver.findElement(By.id("year")).sendKeys("1993"); 
        //WebElement radio1 = driver.findElement(By.id("u_0_4_9N"));							
        //WebElement radio2 = driver.findElement(By.id("u_0_5_Kp"));
       // radio2.click();
        //WebElement radio1 = driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[preceding-sibling::label[text(_='female']])"));
       // WebElement Element2 =  driver.findElement(By.xpath("//input[@name='_8esa'][@value='2']"));    
      //****span[@class='_5k_2 _5dba']/input[preceding-sibling :: label][text()='Female']]
//        boolean select=r.isSelected();
//        if(select == false) {
//        	radio1.click();
        List<WebElement> r= driver.findElements(By.name("sex"));
        for(WebElement e:r) {
        	if(e.getAttribute("value").equalsIgnoreCase("1"))
        	{
        		e.click();
        		Thread.sleep(2000);
        	}
        }
       		System.out.println("hi2");
	}
	@And("click on signup button")
	public void click_on_signup_button() {
		System.out.println("hi3");
	}

	@Then("user login to Home page")
	public void user_login_to_home_page() {
		driver.close();
	}

}
