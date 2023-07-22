package HBPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HudaShoppi 
{
	WebDriver huda_b;
	
// Object Repository	
	//By shop_now = By.xpath("/html/body/div[3]/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/a");
	By makeup = By.xpath("//*[@id=\"L1-Makeup\"]");
	By blush = By.xpath("//a[@class='nav-link subcat-item']");
		//*[@id="body-09a7ae5462417c0160de3f7892"]/div/ul/li[1]/a
	By product = By.xpath("//*[@id=\"product-search-results\"]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/a[1]");
	By qty = By.xpath("/html/body/div[3]/div[2]/div[2]/div[3]/div/div[3]/div[5]/div/div/div[1]/div[1]/span[2]");
	By cart = By.xpath("/html/body/div[3]/div[2]/div[2]/div[3]/div/div[3]/div[5]/div/div/div[1]/button");
	By view_check = By.xpath("//*[@id=\"addedToCartModal\"]/div[1]/div/div[2]/div/div[1]/div[2]/div/div/div/a");
	//By check_out = By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[13]/div/div[1]/a");
	
	By my_acc = By.xpath("/html/body/div[3]/div/div[2]/div/ul/li[2]/a");
	By log_out = By.xpath("/html/body/div[2]/div/div[2]/div/ul/li[2]/div/a[3]");
	
	
	//WebElement makeup = huda_b.findElement(By.xpath("//a[@id=\"L1-Makeup\"]"));
	//WebElement blush = huda_b.findElement(By.xpath("//a[@class='nav-link subcat-item']"));
	
	public HudaShoppi(WebDriver huda_b) 
	{
		this.huda_b = huda_b;
	}

// Action Method 1
	public void purchase()
	{
		huda_b.findElement(makeup).click();
			/*Actions ac_huda_b = new Actions(huda_b);
			ac_huda_b.moveToElement(makeup).perform();*/
		WebDriverWait expl_wait1 = new WebDriverWait(huda_b, Duration.ofSeconds(20));
		expl_wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id=\"L1-Makeup\"]")));
			
		
		WebDriverWait expl_wait2 = new WebDriverWait(huda_b, Duration.ofSeconds(15));
		expl_wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='nav-link subcat-item']")));
		huda_b.findElement(blush).click();
		
		//WebDriverWait expl_wait1 = new WebDriverWait(huda_b, Duration.ofSeconds(20));
		//expl_wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link subcat-item']")));
			/*
			JavascriptExecutor js = (JavascriptExecutor) huda_b;
			js.executeScript("arguments[0].scrollIntoView()", blush);  */
		
		WebDriverWait expl_wait3 = new WebDriverWait(huda_b, Duration.ofSeconds(15));
		expl_wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='nav-link subcat-item']")));
		huda_b.findElement(blush).click();
		huda_b.findElement(product).click();
		huda_b.findElement(qty).click();
		huda_b.findElement(cart).click();
		huda_b.findElement(view_check).click();
		huda_b.findElement(my_acc).click();
		huda_b.findElement(log_out).click();
		//huda_b.findElement(check_out).click();
	}
}
