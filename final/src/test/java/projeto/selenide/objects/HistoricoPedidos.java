package projeto.selenide.objects;

import static com.codeborne.selenide.Selenide.$$;

import org.openqa.selenium.By;

import com.codeborne.selenide.ElementsCollection;

public class HistoricoPedidos {
	
	private ElementsCollection pedidos = $$(By.xpath("//table[@id='order-list']//tbody/tr"));

	public ElementsCollection getPedidos() {
		return pedidos;
	}

	public void setPedidos(ElementsCollection pedidos) {
		this.pedidos = pedidos;
	}
	
	
	public void validarQtdPedidos(int qtdPedidos) {
		
		pedidos.shouldHaveSize(qtdPedidos);
		
	}

}
