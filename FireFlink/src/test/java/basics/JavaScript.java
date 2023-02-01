package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://demowebshop.tricentis.com/");
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollTo(620,1241);");
js.executeScript("window.scrollBy(0,-80);");
WebElement electronics = driver.findElement(By.partialLinkText("Electronics"));
js.executeScript("arguments[0].scrollIntoView(true);",electronics);
	}

}
