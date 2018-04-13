package teste;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import core.BasePage;
import core.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Teste {
	BasePage bp = new BasePage();
	
	@Given("^CT01 - Acessar a tela inicial$")
	public void acessarPaginaInicial() {
		bp.abrirPage("https://www.cvc.com.br/?pmkt=63&gclid=Cj0KCQjwh7zWBRCiARIsAId9b4o_EPtWzgGt0L70KKlXcqTZp_JUlcsh40VlDPhtOnh337UaRsbot4UaAlLuEALw_wcB");
	}
	
	@When("^CT01 - Fazer uma busca qualquer$")
	public void realizarBusca() {
		bp.escreverPorId("ember-power-select-typeahead-input-ember805", "Rio de Janeiro - RJ , Brasil");
		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		DriverFactory.getDriver().findElement(By.id("ember-power-select-typeahead-input-ember805") ).sendKeys(Keys.ENTER);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		bp.escreverPorId("ember-power-select-typeahead-input-ember844", "Fortaleza - CE , Brasil");
		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		DriverFactory.getDriver().findElement(By.id("ember-power-select-typeahead-input-ember844") ).sendKeys(Keys.ENTER);
		
		bp.clicarElementoPorXpath("//*[@id='ember670']/div[1]/div[2]/form/div[8]/input");
		
		bp.clicarElementoPorXpath("//*[@id='ember3060']/div/div/div/button");
		
	}
	
	@When("^CT01 - Escolher um carro particular$")
	public void escolherCarro() {
		
	}
	
	@When ("^CT01 - Escolher um seguro de carro$")
public void escolherSeguroDeCarro() {
		
	}
	
	@When ("^CT01 - Escolher a marca Citroen$")
	public void escolherMarca() {
		
	}
	
	@When ("^CT01 - Escolher o modelo 2014/2014$")
	public void escolherModelo() {
		
	}
	
	@When ("^CT01 - Escolher o modelo C3 PICASSO GLX 1.6 16V FLEX$")
	public void escolherModelo2() {
		
	}
	
	@When ("^CT01 - Clique em iniciar Cota��o$")
	public void clicarIniciarCotacao() {
		
	}
}
