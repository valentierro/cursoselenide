package projeto.selenide.objects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;

public class Home {
	
	private SelenideElement inputBusuca = $("#search_query_top"),
							btnBusca = $(By.name("submit_search")),
							menuCadastro = $(By.linkText("Sign in"));

	public SelenideElement getInputBusuca() {
		return inputBusuca;
	}

	public void setInputBusuca(SelenideElement inputBusuca) {
		this.inputBusuca = inputBusuca;
	}

	public SelenideElement getBtnBusca() {
		return btnBusca;
	}

	public void setBtnBusca(SelenideElement btnBusca) {
		this.btnBusca = btnBusca;
	}

	public SelenideElement getMenuCadastro() {
		return menuCadastro;
	}

	public void setMenuCadastro(SelenideElement menuCadastro) {
		this.menuCadastro = menuCadastro;
	}
	
	public void menuCadastro() {
		menuCadastro.click();
	}
	
	public void buscarProduto(String nomeProduto) {
		inputBusuca.setValue(nomeProduto);
		btnBusca.click();
	}

}
