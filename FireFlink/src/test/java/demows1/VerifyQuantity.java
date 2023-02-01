package demows1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyQuantity {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("lnreddy1223@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("LNReddy@23");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
		driver.findElement(By.partialLinkText("Electronics")).click();
		driver.findElement(By.xpath("//img[@alt='Picture for category Cell phones']")).click();
		driver.findElement(By.linkText("Smartphone")).click();
		driver.findElement(By.id("add-to-cart-button-43")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.findElement(By.name("removefromcart")).click();
		WebElement listbox = driver.findElement(By.id("CountryId"));
		Select s=new Select(listbox);
		s.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@class='qty-input']")).clear();
		String num="5";
		driver.findElement(By.xpath("//input[@class='qty-input']")).sendKeys("num");
		
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.xpath("//input[@title='Continue' and @onclick='Billing.save()']")).click();
		driver.findElement(By.xpath("//input[@title='Continue' and @onclick='Shipping.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		String dat = driver.findElement(By.xpath("//td[@class='qty nobr']/span[2]")).getText();
         if(num.equals(dat)) {
        	 System.out.println("pass");
         }
         else {
        	 System.out.println("fail");
         }
	}

}
