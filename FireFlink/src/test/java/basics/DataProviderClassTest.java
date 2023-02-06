package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderClassTest {
	
	
	@DataProvider(name="testdata",parallel = true)
	public Object[][] data() {
		Object[][] ar=new Object[2][2];
		ar[0][0]="admin";
		ar[0][1]="manager";
		ar[1][0]="admin";
		ar[1][1]="manager";
				return ar;
	}
	@Test(dataProvider ="testdata" )
	public void test(String fn,String ln) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(fn);
		driver.findElement(By.name("pwd")).sendKeys(ln);
		driver.findElement(By.xpath("//div[text()='Login '] ")).click();
		driver.findElement(By.id("logoutLink"));
		driver.close();
	}
	
}
