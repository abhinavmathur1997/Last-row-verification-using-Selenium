package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LastRowVerification {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\SeleniumJavaFramework1\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
WebElement table = driver.findElement(By.xpath("//body/div[@class='page']/div[@class='page_body']/div[@class='centered']/div/main[@id='main']/div[@id='page_body']/div[@id='Blog1']/div[@class='blog-posts hfeed container']/article[@class='post-outer-container']/div[@class='post-outer']/div[@class='post']/div[@id='post-body-1325137018292710854']/div[@class='separator']/div[2]"));


WebElement lastRow = table.findElement(By.xpath("//tr[last()]"));


java.util.List<WebElement> columns = lastRow.findElements(By.tagName("td"));

assert columns.size() == 2;

driver.quit();
}
}


