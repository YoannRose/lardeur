package Autom4.Lardeur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageItem {
	
	
	@FindBy(xpath = "//a[.=\"Lardeur\"]")
	private static WebElement lardeur_boss2;

	
	public static PagePNJ get_info (WebDriver driver, String nom_item) {
		WebElement item = driver.findElement(By.xpath("//b[.='"+nom_item+"']/.."));
		  item.getText();
		  System.out.println(item.getText());
		  lardeur_boss2.click();
		  return PageFactory.initElements(driver, PagePNJ.class);
	  }
}


