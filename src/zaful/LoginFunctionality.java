package zaful;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunctionality {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manimaran\\eclipse-workspace\\Myproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.zaful.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		WebElement advertisement = driver.findElement(By.xpath(
				"//div[@class='newuser-coupon-layer js_index_newuser_layer']//a[@class='newuser-coupon-close js-close-newuser-coupon-layer logsss_event_cl']"));
		advertisement.click();

		// user want search the product that he may looking for

		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"js_showHeaderSearchForm\"]/span"));
		searchBox.click();

		WebElement inputbox = driver.findElement(By.xpath("//*[@id='js-search-input-box']"));
		inputbox.sendKeys("SunGlasses");
		WebElement search = driver
				.findElement(By.xpath("//*[@id=\"js_searchBtn\"]/i"));
		search.click();
		
		WebElement glass = driver.findElement(By.xpath("//*[@id=\"js_proList\"]/ul/li[24]/div[1]/div/a/img[1]"));
		glass.click();
		
		

	}

}
