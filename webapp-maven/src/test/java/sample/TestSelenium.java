package sample;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium {
   	@Test
	public void testGoogleSearch() throws Exception {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://www.google.com/xhtml");
	  Thread.sleep(5000);  
	  WebElement searchBox = driver.findElement(By.name("q"));
	  searchBox.sendKeys("Adi3000");
	  searchBox.submit();
	  Thread.sleep(5000); driver.quit();
	}
}
