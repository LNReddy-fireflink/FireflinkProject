package demows1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Lakshmi Narayana");
		driver.findElement(By.id("LastName")).sendKeys("Reddy M R");
		driver.findElement(By.id("Email")).sendKeys("lnreddy12@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("LNReddy@23");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("LNReddy@23");
		driver.findElement(By.id("register-button")).click();
		String data = driver.findElement(By.xpath("//a[contains(text(),'@gmail.com')]")).getText();
		System.out.println(data);
	}

}