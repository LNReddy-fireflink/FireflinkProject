package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptClickTest {
	
	@Test(groups  ="regression")
	public void testCase1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Electronics")).click();
		driver.findElement(By.xpath("//img[@alt='Picture for category Cell phones']")).click();
		driver.findElement(By.linkText("Smartphone")).click();
		driver.findElement(By.id("add-to-cart-button-43")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		String data = driver.findElement(By.linkText("Smartphone")).getText();
		System.out.println(data);	
	}

}
