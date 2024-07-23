package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://formy-project.herokuapp.com/scroll");
		
Thread.sleep(3000);
		
		JavascriptExecutor scroll =(JavascriptExecutor)driver;
		
		scroll.executeScript("window.scrollBy(0,800)");
		
		Thread.sleep(3000);
		WebElement Fullname = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		Fullname.sendKeys("Aneena saju");
		WebElement Date = driver.findElement(By.xpath("//*[@id=\"date\"]"));
		Date.sendKeys("13/06/2024");
		
		

	}

}
