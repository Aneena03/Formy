package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		    WebElement Address = driver.findElement(By.id("autocomplete"));
		    Address.sendKeys("Karukappillil");
		    WebElement Streetaddress = driver.findElement(By.id("street_number"));
		    Streetaddress.sendKeys("Chengulam");
		    WebElement Streetaddress2 = driver.findElement(By.xpath("//*[@id=\"route\"]"));
		    Streetaddress2.sendKeys("Adimaly");
		    WebElement City = driver.findElement(By.id("locality"));
		    City.sendKeys("Chengulam");
		    WebElement State = driver.findElement(By.id("administrative_area_level_1"));
		    State.sendKeys("Kerala");
		    WebElement Zipcode = driver.findElement(By.id("postal_code"));
		    Zipcode.sendKeys("685565");
		    WebElement Country = driver.findElement(By.id("country"));
		    Country.sendKeys("India");
		    
		
		

	}

}
