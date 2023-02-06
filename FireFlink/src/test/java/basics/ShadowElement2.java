package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowElement2 {

	static WebDriver driver;
	public static void main(String[] args) {
     WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://watir.com/examples/shadow_dom.html");
		WebElement shadowHost = driver.findElement(By.id("shadow_host"));
		//1st shadow root
		SearchContext shadowRoot = shadowHost.getShadowRoot();
		System.out.println(shadowRoot.findElement(By.cssSelector("span[id='shadow_content'] > span")).getText());
		
		//2nd shodow root
		nestedShafoshadowRoot.findElement(By.cssSelector("#nested_shadow_host"));
		
	}

}
