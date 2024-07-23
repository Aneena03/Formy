package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/fileupload");
		
		WebElement fileUpload = driver.findElement(By.xpath("//*[@id=\"file-upload-field\"]"));
		fileUpload.sendKeys("file:///C:/Users/DELL/Downloads/Module%205.docx.pdf");
		Thread.sleep(3000);

	}

}
