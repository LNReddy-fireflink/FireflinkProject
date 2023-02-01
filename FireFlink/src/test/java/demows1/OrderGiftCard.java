package demows1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrderGiftCard {

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
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys("dileep");
		driver.findElement(By.id("giftcard_1_RecipientEmail")).sendKeys("dil123@gmail.com");
		driver.findElement(By.id("giftcard_1_Message")).sendKeys("Hi");
		driver.findElement(By.id("add-to-cart-button-1")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.xpath("//input[@title='Continue' and @onclick='Billing.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
		String data = driver.findElement(By.xpath("//div[@class='title']")).getText();
		System.out.println(data);
	
	}

}
