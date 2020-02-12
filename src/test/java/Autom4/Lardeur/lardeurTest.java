package Autom4.Lardeur;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


public class lardeurTest {
	
	WebDriver driver;
	String url= "https://fr.wowhead.com/";
	
	
	@Before
	public void setup() {
		String BROWSER=System.getProperty("browser");
		if (BROWSER.equals("Chrome")) {
			WebDriver driver = new ChromeDriver();
			driver.get(url);
		}
			else if (BROWSER.equals("Firefox")) {
				WebDriver driver = new FirefoxDriver();
				driver.get(url);
			}
			
	
		
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
			page_pnj = page_item.get_info(driver, "Chahuteurs de cadavre");
			
			page_item = page_pnj.clickOnItem(driver, "Chausses de Lardeur");
			page_pnj = page_item.get_info(driver, "Chausses de Lardeur");
		}
		
		@After
		public void tearDown(){
			driver.close();
		}
}
