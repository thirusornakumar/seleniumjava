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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners({ testlistenerexample.testlistenerexample.class})
public class test_dataprovider {
	

	
	@BeforeClass
	public void setup()
	{

		System.out.println("Before class - Class start");
		
	}
	
	@BeforeTest
	public void btt()
	{
		
		System.out.println("Before - Any test begins");
	}
	
	@AfterClass
	public void teardown()
	{
	
		System.out.println("After - Class Teardown");
	}
	
	@Test(priority = 1, groups= {"sanity"})
	public void firsttest() {
		
		System.out.println("Inside First Test");
		

}
	@Test(priority = 2, groups= {"sanity","regression"}, dependsOnMethods = {"firsttest"})
	@Parameters({"env"})
	public void secondtest(String envname) {
		
	
		System.out.println("Inside Second Test");
		System.out.println(envname);
		


}
	@Test(dataProvider = "dp", priority   = 3)
	public void thirdtest(String u, String p) {

		System.out.println("Inside third Test");
		System.out.println( u +"---"+ p);
		

		
}
	@DataProvider(name="dp")
	public  Object[][] logincreds() {
		
		System.out.println("Inside fourth Test");
		Object data[][] = {
				{"login1", "pwd1"},
				{"login2", "pwd2"},
				{"login3", "pwd3"},
				{"login4", "pwd4"},
				
				
		};
		return data;


}
	
	
}

