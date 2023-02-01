package demows1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToWishList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Electronics")).click();
		driver.findElement(By.xpath("//img[@alt='Picture for category Cell phones']")).click();
		driver.findElement(By.linkText("Smartphone")).click();
		driver.findElement(By.id("add-to-wishlist-button-43")).click();
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		String data = driver.findElement(By.linkText("Smartphone")).getText();
		System.out.println(data);
	}

}
