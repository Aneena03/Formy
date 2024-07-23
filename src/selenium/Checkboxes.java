package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/checkbox");
		WebElement Checkbox1 = driver.findElement(By.xpath("//*[@id=\"checkbox-1\"]"));
		Checkbox1.click();
		WebElement Checkbox2 = driver.findElement(By.xpath("//*[@id=\"checkbox-2\"]"));
		Checkbox2.click();
		WebElement Checkbox3 = driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));
		Checkbox3.click();

	}

}
