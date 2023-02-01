package demows1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WishListToCart {

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
		int i;
		for(i=1;i<=2;i++) {
		driver.findElement(By.id("small-searchterms")).sendKeys("Health Book"+Keys.ENTER);
		driver.findElement(By.linkText("Health Book")).click();
		driver.findElement(By.id("add-to-wishlist-button-22")).click();
		}
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		List<WebElement> allch = driver.findElements(By.name("addtocart"));
		for(WebElement j:allch) {
			j.click();
		}
		driver.findElement(By.name("addtocartbutton")).click();
		String data = driver.findElement(By.xpath("//span[text()='Shopping cart']/../span[@class='cart-qty']")).getText();
		char[] ch=data.toCharArray();
		String num="";
		for(int j=0;j<ch.length;j++) {
			if(Character.isDigit(ch[j])) {
				num=num+ch[j];
			}
		}
		int n=Integer.parseInt(num);
		if(i==n) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}

}
