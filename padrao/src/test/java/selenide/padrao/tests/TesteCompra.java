package selenide.padrao.tests;

import org.junit.BeforeClass;
import org.junit.Test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.commands.GetOwnText;

import selenide.padrao.pageobjects.ConfirmarPedido;
import selenide.padrao.pageobjects.DetalheProduto;
import selenide.padrao.pageobjects.Garantia;
import selenide.padrao.pageobjects.Home;
import selenide.padrao.pageobjects.ResultadoBusca;
import static com.codeborne.selenide.Selenide.*;

public class TesteCompra {
	
	static ConfirmarPedido confirmarObj;
	static DetalheProduto detalheObj;
	static Garantia garantiaObj;
	static Home homeObj;
	static ResultadoBusca resultadoObj;
	
	@BeforeClass
	public static void configuracoes() {
		Configuration.startMaximized=true;
		Configuration.timeout=8000;
		
		// instancias de page objects
		confirmarObj = new ConfirmarPedido();
		detalheObj = new DetalheProduto();
		garantiaObj = new Garantia();
		homeObj = new Home();
		resultadoObj = new ResultadoBusca();
		
	}
	
	
	@Test
	public void testeCompra() {
		
		open("https://www.submarino.com.br/");
		homeObj.buscaProduto("celular");
		resultadoObj.escolhaItem("Motorola");
		detalheObj.comprar();
		garantiaObj.continuarGarantia();
		confirmarObj.confirmarCompra("50060090");
		
	}
	
	
	

}
