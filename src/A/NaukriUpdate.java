package A;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NaukriUpdate {
  
	
	WebDriver driver;
	
	String Mail="smahesh0502@gmail.com";
	
	@BeforeMethod
	  public void beforeMethod() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaSelenium\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
	}
	@Test
  public void f() throws InterruptedException 
	{
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys(Mail);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Mahi@0707");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ni-gnb-header-section\"]/div[3]/div[2]/div[3]/div/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ni-gnb-header-section\"]/div[3]/div[2]/div[3]/div[2]/div[2]/div/div[1]/div[2]/a")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class=\"edit icon\"])[1]")).click();
	
		driver.findElement(By.xpath("//textarea")).clear();
		driver.findElement(By.xpath("//textarea")).sendKeys("[Immediate Joiner]Having 2.2 years’ experience as Quality Analyst with Manual and Automation Testing includes Functional, Non-Functional, Globalization, API Testing Using POSTMAN , Automation Testing (Selenium Web driver with JAVA) using BDDCucumber");

		driver.close();
  }
}
