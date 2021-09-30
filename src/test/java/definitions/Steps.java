package definitions;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.*;
import page.*;
import utilities.Utilidades;

public class Steps {

	
	@Given("^el usuario se encuentra en el home$")
	public void el_usuario_se_encuentra_en_el_home() throws Throwable 
	{
		TestPage.setIngresarHiperText();
	}

	@When("^selecciona el combobox de ejemplo$")
	public void selecciona_el_combobox_de_ejemplo() throws Throwable 
	{
	   Utilidades.esperarElementoWeb("//select[@name='adreces']").click();
	}

	@When("^elige la opcion \"([^\"]*)\"$")
	public void elige_la_opcion(String opcion) throws Throwable 
	{
	    Thread.sleep(2);
	    Utilidades.esperarElementoWeb("//option[contains(text(),'"+opcion+"')]").click();
	}

	@Then("^valido que el titulo de la seecion es \"([^\"]*)\"$")
	public void valido_que_el_titulo_de_la_seecion_es(String seccion) throws Throwable 
	{
	   assertTrue("", Utilidades.esperarElementoWeb("//h2[contains(text(),'"+seccion+"')]").isDisplayed());
	}

}
