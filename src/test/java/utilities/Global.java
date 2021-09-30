package utilities;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;	
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class Global {
	
	public static WebDriver driver;
	
    public static void inicializarDriver()
    {
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/webdriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();      
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        options.addArguments("--disable-gpu");    
        options.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); 
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); 
        driver.manage().window().maximize();
        
    }
    /* 
	 * @param scenario
	 * @throws Exception
	 */
	public static void screenShotForAllScenario() throws Exception {
		File sourcePath = ((TakesScreenshot) Global.driver).getScreenshotAs(OutputType.FILE);
		String folderPath = System.getProperty("user.dir")+"/reporte/img/";
		File folder = new File(folderPath);
		folder.mkdir();
		File destinationPath = new File(folderPath + "PruebaTsoft.png");
		Files.copy(sourcePath, destinationPath);
	}

}
