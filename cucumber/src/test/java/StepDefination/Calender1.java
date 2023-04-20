package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calender1 {
	WebDriver driver;
	String frdate = "20";
    String todate = "26";
	@Given("user enter Giru website")
	public void user_enter_giru_website() {
		System.out.println("hi");
		System.setProperty("webdriver.chrome.driver",
	            "C:\\swathi_online training\\JarFiles\\Chromedriver\\Chromedriver111\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
		// driver.navigate().to("https://demo.guru99.com/test/");
		 driver.get("https://jqueryui.com/datepicker/#date−range");
	}
	@When("user,Date of birth")
	public void user_date_of_birth() throws InterruptedException {
//	WebElement calender=   driver.findElement(By.name("bdaytime"));
//	calender.sendKeys("05241993");
//	Thread.sleep(2000);
//	calender.sendKeys(Keys.TAB);
//	Thread.sleep(2000);
//	calender.sendKeys("3:00PM");
//	Thread.sleep(2000);
		 WebElement e = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		 driver.switchTo().frame(e);
		    // choose from date
		    driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		    Thread.sleep(1000);
		    // choose month from dropdown
		    WebElement m = driver
		    .findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		    Select s = new Select(m);
		    s.selectByVisibleText("May");
		    Thread.sleep(1000);
		    // select day
		    driver.findElement(By.xpath("//td[not(contains(@class,'ui−datepicker− month'))]/a[text()='"+frdate+"']")).click();
	    Thread.sleep(1000);
		    // choose to date
//		    driver.findElement(By.xpath("//input[@id='to']")).click();
//		    Thread.sleep(1000);
		    // choose month from dropdown
//		    WebElement n = driver
//		    .findElement(By.xpath("//div/select[@class='ui− datepicker−month']"));
//		    Select sel = new Select(n);
//		    sel.selectByVisibleText("Feb");
//		    Thread.sleep(1000);
		    // select day
//		    driver.findElement(By.xpath("//td[not(contains(@class,'ui−datepicker− month'))]/a[text()='"+todate+"']")).click();
		    Thread.sleep(1000);
	}
	@Then("user logout button")
	public void user_logout_button() {
	    driver.close();
	}



}
