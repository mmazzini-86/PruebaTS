package page;

import utilities.Global;


public class TestPage {
	
	public static String url = "https://www.upf.edu/hipertextnet/numero-1/menu-select.html";

	public static void setIngresarHiperText() throws Throwable 
	{
		Global.driver.get(url);
		Thread.sleep(2000);
	}

}

