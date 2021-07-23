package crm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Debug_The_Code {

	@Test
	
	public void loginTest() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		    WebElement username =driver.findElement(By.name("user_name"));
            username.sendKeys("admin");
            WebElement password = driver.findElement(By.name("user_password"));
            password.sendKeys("admin");
}
}