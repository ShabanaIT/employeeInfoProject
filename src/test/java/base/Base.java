package base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Base {
	
	protected static WebDriver driver; 	
	public static void navigateURL(String url) {
		driver.get(url);
	}
	
	public static void click(By locator) {
		driver.findElement( locator ).click();
	}
	
	public static void clear(By locator) {
		driver.findElement( locator ).clear();
	}
	
	
	public static void sendkeys(By locator, String value) {
		driver.findElement( locator ).sendKeys( value  );
	}
	
	public static String getElementText(By locator) {
		
		WebElement element =  driver.findElement( locator );
		
		String s = element.getText();	
		return s;
	}
	public  String getAttributeValue(By by, String key ){
		return driver.findElement( by ).getAttribute( key );
	}
}