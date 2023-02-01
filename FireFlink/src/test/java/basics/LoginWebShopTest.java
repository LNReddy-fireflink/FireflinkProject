package basics;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWebShopTest {
	
	@Test(dataProvider = "testdata")
	public void text(String userName, String password) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("lnreddy1223@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("LNReddy@23");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
	}
	@DataProvider(name="testdata",parallel = true)
	public String[][] retrieve() throws EncryptedDocumentException, IOException {
		return DataDriven.test("webshop");
	}

}
