package HBPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HudaMyAcc 
{
	WebDriver huda_b;
	
	//Object Repository
	By my_ac = By.xpath("/html/body/div[2]/div/div[2]/div/ul/li[2]/a");
	
	public HudaMyAcc(WebDriver huda_b) 
	{
		this.huda_b = huda_b;
	}

	//Action Method
	public void myAcc()
	{
		//WebDriverWait expl_wait = new WebDriverWait(huda_b, Duration.ofSeconds(20));
		//expl_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[2]/div/ul/li[2]/a")));
		huda_b.findElement(my_ac).click();
	}
}
