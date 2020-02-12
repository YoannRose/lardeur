package Autom4.Lardeur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PagePNJ {
	
	public static PageItem clickOnItem(WebDriver driver, String nom_item) {
		WebElement item = driver.findElement(By.xpath("//a[.='"+nom_item+"']"));
		  item.click();
		  return PageFactory.initElements(driver, PageItem.class);
	  }
}
