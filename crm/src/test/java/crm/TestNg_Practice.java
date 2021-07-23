package crm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class TestNg_Practice {
	@Parameters({"text"})

	@Test()
	
	
	public void test_Case1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("facebook");
		driver.findElement(By.xpath("//div[contains(@class,'sbic sb27')]")).click();
		
		
		System.out.println("Test case 1 executed");
		
	}
		@Test(enabled=false)
		
		public void test_Case2() {
          
			System.out.println("Test case 2 exected");
			
		
		
	}
	
}
