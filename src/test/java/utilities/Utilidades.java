package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilidades {

	/**
	 * Espera hasta 10 segundos que un elemento se despliegue en pantalla. Retorna el webelement encontrado
	 * @param path
	 * @return
	 */
	public static WebElement esperarElementoWeb(String path) 
	{
		WebDriverWait wait = new WebDriverWait(Global.driver, 10);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
	}
}
