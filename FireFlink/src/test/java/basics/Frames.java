package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("file:///C:/Users/LN%20REDDY/Downloads/iframe.html");
driver.switchTo().frame("frame2");
//driver.findElement(By.xpath("//a[text()='Discover All']")).click();
//driver.findElement(By.xpath("//span[@class='bars']")).click();
driver.findElement(By.xpath("(//img[@alt='Autocar India Facebook Page'])[1]")).click();
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Google")).click();
FluentWait wait =new FluentWait(driver);
wait.pollingEvery(Duration.ofSeconds(1));
wait.withTimeout(Duration.ofSeconds(10));
wait.until(ExpectedConditions.alertIsPresent());
	}

}
