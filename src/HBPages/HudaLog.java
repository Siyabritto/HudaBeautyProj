package HBPages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HudaLog 
{
	WebDriver huda_b;
	
// Object Repository
	By log_email = By.xpath("//*[@id=\"login-form-email\"]");
	By log_pswd = By.xpath("//*[@id=\"login-form-password\"]");
	By log_btn2 = By.xpath("//*[@id=\"login\"]/form/button");
	
	By shop_now = By.xpath("/html/body/div[3]/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/a");
	
	public HudaLog(WebDriver huda_b) 
	{
		this.huda_b = huda_b;
	}

// Action Method 1
	public void logInput(String em,String ps)
	{
		WebDriverWait expl_wait1 = new WebDriverWait(huda_b, Duration.ofSeconds(20));
		expl_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-form-email\"]")));
		huda_b.findElement(log_email).sendKeys(em);
		
		WebDriverWait expl_wait = new WebDriverWait(huda_b, Duration.ofSeconds(20));
		expl_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-form-password\"]")));
		huda_b.findElement(log_pswd).sendKeys(ps);
	}
		
// Action Method 2
		public void Login()
		{
			WebDriverWait expl_wait = new WebDriverWait(huda_b, Duration.ofSeconds(20));
			expl_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login\"]/form/button")));
			huda_b.findElement(log_btn2).click();
			huda_b.findElement(shop_now).click();	
		}
}
