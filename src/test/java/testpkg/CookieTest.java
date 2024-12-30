package testpkg;

import org.testng.annotations.Test;

import basepkg.BaseCookie;
import pagepkg.CookiePage;

public class CookieTest extends BaseCookie {
	@Test
	public void testCookieman() {
		CookiePage cp=new CookiePage(driver);
		cp.homePage();
		cp.itemSelect();
		cp.closeButton();
		cp.mainPage();
	}
}
