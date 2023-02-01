package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptionsClass {

	public static void main(String[] args) {
ChromeOptions options=new ChromeOptions();
options.addArguments("--disable-notifications");
WebDriverManager.chromedriver().setup();
options.addArguments("--incognito");
options.addArguments("--start-maximized");
//options.addArguments("--headless");
WebDriver driver=new ChromeDriver(options);
driver.get("https://www.easemytrip.com/");

System.out.println("report");
	}

}
