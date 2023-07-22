package HBPages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HudaReg 
{
	WebDriver huda_b;
	
// Object Repository	
	By reg_btn1 = By.xpath("/html/body/div[3]/div[1]/div/div[2]/div/div/div/ul/li[2]/a");
	By reg_fnam = By.xpath("//*[@id=\"registration-form-fname\"]");
	By reg_lnam = By.xpath("//*[@id=\"registration-form-lname\"]");
	By reg_phone = By.xpath("//*[@id=\"registration-form-phone\"]");
	By reg_email = By.xpath("//*[@id=\"registration-form-email\"]");
	By reg_pswd = By.xpath("//*[@id=\"registration-form-password\"]");
	By reg_confrm_pswd = By.xpath("//*[@id=\"registration-form-password-confirm\"]");
	By reg_btn2 = By.xpath("//*[@id=\"register\"]/form/button");
	
	public HudaReg(WebDriver huda_b) 
	{
		this.huda_b = huda_b;
	}

// Action Method 1
	public void regInput(String fn,String ln, String ph,String em, String ps)
	{
		WebDriverWait expl_wait = new WebDriverWait(huda_b, Duration.ofSeconds(20));
		expl_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login\"]/form/button")));
		huda_b.findElement(reg_btn1).click();
		//WebDriverWait expl_wait1 = new WebDriverWait(huda_b, Duration.ofSeconds(20));
		//expl_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-form-email\"]")));
		huda_b.findElement(reg_fnam).sendKeys(fn);
		huda_b.findElement(reg_lnam).sendKeys(ln);
		huda_b.findElement(reg_phone).sendKeys(ph);
		huda_b.findElement(reg_email).sendKeys(em);
		huda_b.findElement(reg_pswd).sendKeys(ps);
		huda_b.findElement(reg_confrm_pswd).sendKeys(ps);
		//WebDriverWait expl_wait = new WebDriverWait(huda_b, Duration.ofSeconds(20));
		//expl_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-form-password\"]")));
	}
	
// Action Method 2
	public void Reg()
	{
		WebDriverWait expl_wait = new WebDriverWait(huda_b, Duration.ofSeconds(30));
		//expl_wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"register\"]/form/button")));   
		expl_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"register\"]/form/button")));
		//*[@id="register"]/form/button
		huda_b.findElement(reg_btn2).click();	
	}
}
