package selenide.padrao.pageobjects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class ConfirmarPedido {
	
	private SelenideElement inputCep = $("#cep"),
							btnCep = $(".freightForm-okBtn"),
							btnComprar = $("#buy-button");

	public SelenideElement getInputCep() {
		return inputCep;
	}

	public void setInputCep(SelenideElement inputCep) {
		this.inputCep = inputCep;
	}

	public SelenideElement getBtnCep() {
		return btnCep;
	}

	public void setBtnCep(SelenideElement btnCep) {
		this.btnCep = btnCep;
	}

	public SelenideElement getBtnComprar() {
		return btnComprar;
	}

	public void setBtnComprar(SelenideElement btnComprar) {
		this.btnComprar = btnComprar;
	}
	
	
	public void confirmarCompra(String cep) {
		inputCep.setValue(cep);
		btnCep.click();
		btnComprar.click();
	}

}
