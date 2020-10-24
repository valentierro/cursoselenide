package projeto.selenide.objects;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class ResumoCompra {
	
	private SelenideElement btnCheckout = $(By.linkText("Proceed to checkout"));

	public SelenideElement getBtnCheckout() {
		return btnCheckout;
	}

	public void setBtnCheckout(SelenideElement btnCheckout) {
		this.btnCheckout = btnCheckout;
	}
	
	
	public void resumoSeguir() {
		btnCheckout.click();
	}
							
			

}
