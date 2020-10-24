package projeto.selenide.objects;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class CompraEndereco {
	
	private SelenideElement txtInfoAdicionais = $(By.name("message")),
							btnCheckout = $(By.name("processAddress"));

	public SelenideElement getTxtInfoAdicionais() {
		return txtInfoAdicionais;
	}

	public void setTxtInfoAdicionais(SelenideElement txtInfoAdicionais) {
		this.txtInfoAdicionais = txtInfoAdicionais;
	}

	public SelenideElement getBtnCheckout() {
		return btnCheckout;
	}

	public void setBtnCheckout(SelenideElement btnCheckout) {
		this.btnCheckout = btnCheckout;
	}
	
	
	public void infosAdicionais(String infoAdicional) {
		txtInfoAdicionais.scrollTo().setValue(infoAdicional);
		btnCheckout.click();
	}
			

}
