package HBTest;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class HudaBaseClass 
{
	WebDriver huda_b;
	
	@BeforeClass
	public void start()
	{
		huda_b = new ChromeDriver();
		huda_b.get("https://hudabeauty.com/en_IN/home");
		
		huda_b.manage().deleteAllCookies();
		
		WebElement cook = huda_b.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));  
		WebDriverWait expl_wait = new WebDriverWait(huda_b, Duration.ofSeconds(10));
		expl_wait.until(ExpectedConditions.elementToBeClickable(cook));
		cook.click();
		
		huda_b.manage().window().maximize();
		
		/*WebElement btn_tnx = huda_b.findElement(By.xpath("//*[@id=\"bx-element-1348794-tHAvwSt\"]/button"));  
		WebDriverWait expl_wait1 = new WebDriverWait(huda_b, Duration.ofSeconds(15));
		expl_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"bx-element-1348794-tHAvwSt\"]/button")));
			//expl_wait.until(ExpectedConditions.elementToBeClickable(cook));
		btn_tnx.click(); */
	}
}
