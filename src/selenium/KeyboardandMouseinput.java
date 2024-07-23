package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardandMouseinput {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/keypress");
		WebElement Fullname = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		Fullname.sendKeys("Aneena Saju");
		
		WebElement Button = driver.findElement(By.xpath("//*[@id=\"button\"]"));
		Button.click();
	}

}
