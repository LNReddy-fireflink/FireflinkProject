package basics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopup2 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://demo.guru99.com/test/simple_context_menu.html");
WebElement rtclick = driver.findElement(By.xpath("//span[text()='right click me']"));
Actions a=new Actions(driver);
a.contextClick(rtclick).perform();
driver.findElement(By.xpath("//span[text()='Edit']")).click();
Alert alert = driver.switchTo().alert();
alert.accept();

WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
a.doubleClick(doubleclick).perform();
Alert popup = driver.switchTo().alert();
popup.accept();
	}

}
