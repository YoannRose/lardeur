package Autom4.Lardeur;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageRecherche {

	@FindBy(xpath = "//td/a[@href=\"/npc=46254/lardeur\"]")
	private static WebElement lardeur_boss;
	
	public static PagePNJ clickOnLardeur(WebDriver driver) {
		  lardeur_boss.click();
		  return PageFactory.initElements(driver, PagePNJ.class);
	  }
}
