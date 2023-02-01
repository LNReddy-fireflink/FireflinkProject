package demows1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CompareWishList {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		int i;
		for(i=1;i<=3;i++) {
		driver.findElement(By.id("small-searchterms")).sendKeys("Health Book"+Keys.ENTER);
		driver.findElement(By.linkText("Health Book")).click();
		driver.findElement(By.id("add-to-wishlist-button-22")).click();
		}
		Thread.sleep(2000);
		String data = driver.findElement(By.xpath("//span[text()='Wishlist']/../span[@class='wishlist-qty']")).getText();
       char[] ch=data.toCharArray();
		String num="";
        for(int j=0;j<ch.length;j++) {
        	if(ch[j]>='0'&&ch[j]<='9') {
        		num=num+ch[j];
        	}
        }
        int n=Integer.parseInt(num);
        if((i-1)==n) {
        	System.out.println("pass");
        }
        else {
        	System.out.println("fail");
        }
	}

}
