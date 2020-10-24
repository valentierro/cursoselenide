package projeto.selenide.objects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class ResultadoBusca {
	
	private ElementsCollection resultadosBusca = $$(".product_img_link");

	public ElementsCollection getResultadosBusca() {
		return resultadosBusca;
	}

	public void setResultadosBusca(ElementsCollection resultadosBusca) {
		this.resultadosBusca = resultadosBusca;
	}
	
	
	public void escolherPrimeiroProduto() {
		resultadosBusca.get(0).click();
	}

}
