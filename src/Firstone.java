import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Firstone {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\newWebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		String userName = "standard_user";
		String passWord = "secret_sauce";
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(passWord);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		

		List <WebElement> clickToAdd = driver.findElements(By.className("btn_primary"));
		for(int i=0 ; i<clickToAdd.size();i++) {
			clickToAdd.get(i).click();
		}
		
//		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).getText();
		
		String actualItemsInCart = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).getText();
		String expectedItemsInCart = "6";

		Assert.assertEquals(actualItemsInCart, expectedItemsInCart);

		}
	
       
}
		     
