package projeto.selenide.objects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class Pagamento {
	
	private SelenideElement btnPagamentoBanco = $(".bankwire"),
							btnPagamentoCheque = $(".cheque");

	public SelenideElement getBtnPagamentoBanco() {
		return btnPagamentoBanco;
	}

	public void setBtnPagamentoBanco(SelenideElement btnPagamentoBanco) {
		this.btnPagamentoBanco = btnPagamentoBanco;
	}
	
	
	
	public SelenideElement getBtnPagamentoCheque() {
		return btnPagamentoCheque;
	}

	public void setBtnPagamentoCheque(SelenideElement btnPagamentoCheque) {
		this.btnPagamentoCheque = btnPagamentoCheque;
	}

	public void tipoPagamento(String tipoPagamento) {
		if (tipoPagamento.equalsIgnoreCase("banco")) {
			btnPagamentoBanco.click();
		}else {
			btnPagamentoCheque.click();
		}
	}
							
							

}
