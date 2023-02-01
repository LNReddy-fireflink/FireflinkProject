package demows1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddNewAddress {

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
	    driver.findElement(By.linkText("Addresses")).click();
	    driver.findElement(By.xpath("//input[@value='Add new']")).click();
	    driver.findElement(By.id("Address_FirstName")).sendKeys("L N");
	    driver.findElement(By.id("Address_LastName")).sendKeys("Reddy");
	    driver.findElement(By.id("Address_Email")).sendKeys("lnreddy1223@gmail.com");
	    WebElement country = driver.findElement(By.id("Address_CountryId"));
	    Select s=new Select(country);
	    s.selectByVisibleText("India");
	    driver.findElement(By.id("Address_City")).sendKeys("Bengaluru");
	    driver.findElement(By.id("Address_Address1")).sendKeys("Banaswadi");
	    driver.findElement(By.id("Address_ZipPostalCode")).sendKeys("563126");
	    driver.findElement(By.id("Address_PhoneNumber")).sendKeys("7353390973");
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	    String data = driver.findElement(By.xpath("(//ul[@class='info'])[2]")).getText();
	    System.out.println(data);
	}

}
