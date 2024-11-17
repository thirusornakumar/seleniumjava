package TestNgexamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ testlistenerexample.testlistenerexample.class})
public class test_daependencygrouping {
	
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
	
	@BeforeTest
	public void btt()
	{
		
		System.out.println("Before - Any test begins");
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
		System.out.println("After - Class Teardown");
	}
	
	@Test(priority = 1, groups= {"sanity"})
	public void firsttest() {
		
		System.out.println("Inside First Test");
		driver.navigate().to("https://the-internet.herokuapp.com/");
		Assert.fail("firsttest failed");

}
	@Test(priority = 2, groups= {"sanity","regression"}, dependsOnMethods = {"firsttest"})
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

