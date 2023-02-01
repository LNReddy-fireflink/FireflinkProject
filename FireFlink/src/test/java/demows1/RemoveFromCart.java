package demows1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RemoveFromCart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys("Laptop"+Keys.ENTER);
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.findElement(By.id("small-searchterms")).sendKeys("Health Book"+Keys.ENTER);
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.findElement(By.id("small-searchterms")).sendKeys("Smartphone"+Keys.ENTER);
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		List<WebElement> allchbx = driver.findElements(By.name("removefromcart"));
		for(WebElement i:allchbx) {
			i.click();
		}
		driver.findElement(By.name("updatecart")).click();
		String data = driver.findElement(By.xpath("//div[contains(text(),'Your Shopping Cart is empty!')]")).getText();
		System.out.println(data);
		
		
	}

}
