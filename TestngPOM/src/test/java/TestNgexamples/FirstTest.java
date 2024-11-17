package TestNgexamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ testlistenerexample.testlistenerexample.class})
public class FirstTest {
	
	WebDriver driver ;
	WebElement addelementlink;
	WebElement addelementbtn;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("Before - Class setup");

		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
		System.out.println("After - Class Teardown");
	}
	

	
	@AfterTest
	public void btt2()
	{
		
		System.out.println("After - Any test ends");
	}
	
	@BeforeSuite
	public void btt5()
	{
		
		System.out.println("Before - Any suite starts");
	}
	
	@AfterSuite
	public void btt6()
	{
		
		System.out.println("After - Any suite ends");
	}
	
	
	
	
	
	@Test(priority = 1)
	public void firsttest() {
		
		System.out.println("Inside First Test");
		driver.navigate().to("https://the-internet.herokuapp.com/");

}
	@Test(priority = 2)
	public void secondtest() {
		
		addelementlink = driver.findElement(By.xpath("//a[normalize-space()='Add/Remove Elements']"));
		addelementlink.click();
		System.out.println("Inside Second Test");


}
	@Test(priority = 3)
	public void thirdtest() {
		addelementbtn = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
		addelementbtn.click();
		System.out.println("Inside third Test");

		
}
	@Test(priority = 4)
	public void fourthtest() {
		
		System.out.println("Inside fourth Test");


}
	
	
}

