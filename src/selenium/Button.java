package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/buttons");
	 WebElement Primary = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[1]"));
	 Primary.click();
	 WebElement Success = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[2]"));
	 Success.click();
	 WebElement Info = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[3]"));
	 Info.click();
	 WebElement Warning = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[4]"));
	 Warning.click();
	 WebElement Danger = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[5]"));
	 Danger.click();
	 WebElement Link = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[6]"));
	 Link.click();
	 WebElement Left = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[1]"));
	 Left.click();
	 WebElement Middle = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[2]"));
	 Middle.click();
	 WebElement Right = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[3]"));
	 Right.click();
	 WebElement One = driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/button[1]"));
	 One.click();
	 WebElement Two = driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/button[2]"));
	 Two.click();
	 WebElement Dropdown = driver.findElement(By.xpath("//*[@id=\"btnGroupDrop1\"]"));
	 Dropdown.click();
	 
		  
		    
		     

	}

}
