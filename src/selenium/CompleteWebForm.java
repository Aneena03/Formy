package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CompleteWebForm {

	private static Select experience;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		WebElement Firstname = driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
		Firstname.sendKeys("Aneena");
		
		WebElement Lastname = driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
		Lastname.sendKeys("Saju");
		
		WebElement Jobtitle = driver.findElement(By.xpath("//*[@id=\"job-title\"]"));
		Jobtitle.sendKeys("Software testing");
		
		WebElement college = driver.findElement(By.xpath("//*[@id=\"radio-button-2\"]"));
		college.click();
		
		WebElement sex = driver.findElement(By.xpath("//*[@id=\"checkbox-2\"]"));
		sex.click();
		
		WebElement yearofexperience = driver.findElement(By.id("select-menu"));
		Select select = new Select(yearofexperience);
		select.selectByValue("0-1");
		
		
		
				
		
		
		
		
		
		 
		

	}

}
