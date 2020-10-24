package selenide.padrao.pageobjects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class Garantia {
	
	private SelenideElement btnGarantia = $("#btn-continue");

	public SelenideElement getBtnGarantia() {
		return btnGarantia;
	}

	public void setBtnGarantia(SelenideElement btnGarantia) {
		this.btnGarantia = btnGarantia;
	}
	
	public void continuarGarantia() {
		btnGarantia.click();
	}

}
