package runner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import utilities.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict=true,
		features = "src/test/resources/features/",
		glue = "definitions/",
		tags = {"@Test01"},
		plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:reporte/cucumber/report.html"}
		)
public class TestRunner{
		
    @BeforeClass
    public static void inicializar() 
    {	
    	Global.inicializarDriver();
    }
      
    @AfterClass
    public static void screenShot() throws Exception 
    {
		Global.screenShotForAllScenario();
		Global.driver.quit();
	}  
   
}
