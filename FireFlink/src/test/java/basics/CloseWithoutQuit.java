package basics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseWithoutQuit {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/LN%20REDDY/Downloads/MultipleWindow.html");
		String prhandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		Set<String> allwnhandle = driver.getWindowHandles();
		for(String i:allwnhandle) {
			
			Thread.sleep(2000);
			System.out.println(i);
			Thread.sleep(2000);
			driver.switchTo().window(i);
			driver.close();
		}
	}

}

