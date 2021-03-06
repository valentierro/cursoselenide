package selenide.padrao.pageobjects;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;

public class Home {
	
	private SelenideElement inputBusca = $("#h_search-input"),
							btnBusca = $("#h_search-btn"),
							btnCookies = $("#lgpd-accept");

	public SelenideElement getInputBusca() {
		return inputBusca;
	}

	public void setInputBusca(SelenideElement inputBusca) {
		this.inputBusca = inputBusca;
	}

	public SelenideElement getBtnBusca() {
		return btnBusca;
	}

	public void setBtnBusca(SelenideElement btnBusca) {
		this.btnBusca = btnBusca;
	}

	public SelenideElement getBtnCookies() {
		return btnCookies;
	}

	public void setBtnCookies(SelenideElement btnCookies) {
		this.btnCookies = btnCookies;
	}
	
	
	public void buscaProduto(String produto) {
		btnCookies.click();
		inputBusca.setValue(produto);
		btnBusca.click();
	}
	
	

}
