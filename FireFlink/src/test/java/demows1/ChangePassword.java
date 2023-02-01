package demows1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChangePassword {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("lnreddy1223@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("LNreddy@23");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
		driver.findElement(By.linkText("My account")).click();
		driver.findElement(By.linkText("Change password")).click();
		driver.findElement(By.id("OldPassword")).sendKeys("LNreddy@23");
		driver.findElement(By.id("NewPassword")).sendKeys("LNReddy@23");
		driver.findElement(By.id("ConfirmNewPassword")).sendKeys("LNReddy@23");
		driver.findElement(By.xpath("//input[@value='Change password']")).click();
		String data = driver.findElement(By.xpath("//div[contains(text(),'Password was changed')]")).getText();
		System.out.println(data);
	}

}
