package projeto.selenide.objects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;

public class ConfirmarCompra {
	
	private SelenideElement btnConfirmaCompra = $(By.xpath("//p[@id='cart_navigation']//span"));

	public SelenideElement getBtnConfirmaCompra() {
		return btnConfirmaCompra;
	}

	public void setBtnConfirmaCompra(SelenideElement btnConfirmaCompra) {
		this.btnConfirmaCompra = btnConfirmaCompra;
	}
	
	
	public void confirmaCompra() {
		btnConfirmaCompra.scrollTo().click();
	}

}
