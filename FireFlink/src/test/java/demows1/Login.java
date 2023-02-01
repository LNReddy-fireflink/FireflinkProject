package demows1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("lnreddy1223@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("LNReddy@23");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
		String data = driver.findElement(By.xpath("//a[contains(text(),'@gmail.com')]")).getText();
		System.out.println(data);
	}

}
