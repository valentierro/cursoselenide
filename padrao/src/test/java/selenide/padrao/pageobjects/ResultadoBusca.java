package selenide.padrao.pageobjects;

import static com.codeborne.selenide.Selenide.$$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

public class ResultadoBusca {
	
	private ElementsCollection resultados = $$(".TitleUI-bwhjk3-15");

	public ElementsCollection getResultados() {
		return resultados;
	}

	public void setResultados(ElementsCollection resultados) {
		this.resultados = resultados;
	}
	
	public void escolhaItem(String item) {
		resultados.filter(Condition.text(item)).get(0).click();
	}
	
	
}
