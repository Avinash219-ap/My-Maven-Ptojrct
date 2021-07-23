package crm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateOrganisation {
	
	
	@Test
	
	public void createOrganisationWithIndustryTest() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();	
	
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@type='text' and @name =\"accountname\"]")).sendKeys("Sony");
		WebElement dropdn = driver.findElement(By.name("industry"));
		Select select = new Select(dropdn);
		select.selectByVisibleText("Banking");
		Thread.sleep(3000);
		WebElement dropdn1 = driver.findElement(By.name("accounttype"));
		Select type = new Select(dropdn1);
		type.selectByVisibleText("Customer");
		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/select.gif\"]")).click();
		
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
	}

}
