package projeto.selenide.objects;

import org.openqa.selenium.By;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class MinhaConta {
	
	private SelenideElement btnHistorico = $(".icon-list-ol"),
							btnHome = $(".icon-chevron-left"),
							divTitulo = $("#center_column"),
							h1Titulo = $(".page-heading");

	public SelenideElement getBtnHistorico() {
		return btnHistorico;
	}

	public void setBtnHistorico(SelenideElement btnHistorico) {
		this.btnHistorico = btnHistorico;
	}

	public SelenideElement getBtnHome() {
		return btnHome;
	}

	public void setBtnHome(SelenideElement btnHome) {
		this.btnHome = btnHome;
	}

	public SelenideElement getDivTitulo() {
		return divTitulo;
	}

	public void setDivTitulo(SelenideElement divTitulo) {
		this.divTitulo = divTitulo;
	}

	public SelenideElement getH1Titulo() {
		return h1Titulo;
	}

	public void setH1Titulo(SelenideElement h1Titulo) {
		this.h1Titulo = h1Titulo;
	}
	
	
	public void voltarHome() {
		
		h1Titulo.shouldHave(Condition.text("My Account"));
		btnHome.scrollTo().click();
		
		
	}
	
	public void historicoPedidos() {
		h1Titulo.shouldHave(Condition.text("My Account"));
		btnHistorico.click();
	}

}
