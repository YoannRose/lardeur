package Autom4.Lardeur;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageAccueil {
	@FindBy(name = "q")
	private static WebElement recherche_barre;
	

	
	public static PageRecherche rechercherLardeur(WebDriver driver, String bossName) {
		  recherche_barre.sendKeys(bossName);
		  recherche_barre.submit();
		  return PageFactory.initElements(driver, PageRecherche.class);
	  }
}
