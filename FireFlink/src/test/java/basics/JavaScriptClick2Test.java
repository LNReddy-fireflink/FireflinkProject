package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptClick2Test {
	
	@Test(groups = "smoke")
	public void testCase2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("lnreddy1223@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("LNReddy@23");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
		String text="Smartphone";
		driver.findElement(By.id("small-searchterms")).sendKeys(text);
		driver.findElement(By.linkText("Smartphone")).click();
		driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
		driver.findElement(By.linkText("Compare products list")).click();
		String data = driver.findElement(By.linkText("Smartphone")).getText();
		if(text.equals(data)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		
	}
		
	}
	@Test
	public void testCase3() {
		System.out.println("report");
	}

}
