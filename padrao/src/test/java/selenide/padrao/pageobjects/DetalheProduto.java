package selenide.padrao.pageobjects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class DetalheProduto {
	
	private SelenideElement btnCompar = $("#btn-buy");

	public SelenideElement getBtnCompar() {
		return btnCompar;
	}

	public void setBtnCompar(SelenideElement btnCompar) {
		this.btnCompar = btnCompar;
	}
	
	
	public void comprar() {
		btnCompar.click();
	}

}
