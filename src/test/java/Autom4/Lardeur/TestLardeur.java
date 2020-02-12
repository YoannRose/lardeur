package Autom4.Lardeur;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


public class TestLardeur {
	
	WebDriver driver = new FirefoxDriver();
	String url= "https://fr.wowhead.com/";
	
	
	@Before
	public void setup() {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	

		@Test
		public void testPageObjectLardeur() throws InterruptedException{
			WebElement accept_cookies=driver.findElement(By.xpath("//button[@class=\"as-oil__btn-optin as-js-optin as-oil__btn-initial\"]"));
			accept_cookies.click();
			PageAccueil page_accueil = PageFactory.initElements(driver, PageAccueil.class);
			PageRecherche page_recherche = page_accueil.rechercherLardeur(driver, "Lardeur");
			PagePNJ page_pnj = page_recherche.clickOnLardeur(driver);	
			PageItem page_item = page_pnj.clickOnItem(driver, "Chahuteurs de cadavre");
		}
		
		@After
		public void tearDown(){
			driver.close();
		}
}
