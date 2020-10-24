package projeto.selenide.objects;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class DetalhesProduto {
	
	private SelenideElement btnAddCarrinho = $(By.name("Submit")),
							btnCheckout = $(".button-medium");

	public SelenideElement getBtnAddCarrinho() {
		return btnAddCarrinho;
	}

	public void setBtnAddCarrinho(SelenideElement btnAddCarrinho) {
		this.btnAddCarrinho = btnAddCarrinho;
	}
	
	
	public SelenideElement getBtnCheckout() {
		return btnCheckout;
	}

	public void setBtnCheckout(SelenideElement btnCheckout) {
		this.btnCheckout = btnCheckout;
	}

	public void adicionarCarrinho() {
		switchTo().frame(0);
		btnAddCarrinho.click();
		switchTo().parentFrame();
		btnCheckout.click();
	}

}
