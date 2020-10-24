package projeto.selenide.tests;

import static com.codeborne.selenide.Selenide.open;

import org.apache.hc.core5.http.protocol.UriPatternOrderedMatcher;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import com.codeborne.selenide.Configuration;

import projeto.selenide.objects.Cadastro;
import projeto.selenide.objects.CompraEndereco;
import projeto.selenide.objects.ConfirmarCompra;
import projeto.selenide.objects.DetalhesProduto;
import projeto.selenide.objects.Frete;
import projeto.selenide.objects.Home;
import projeto.selenide.objects.Login;
import projeto.selenide.objects.MinhaConta;
import projeto.selenide.objects.Pagamento;
import projeto.selenide.objects.ResultadoBusca;
import projeto.selenide.objects.ResumoCompra;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TesteNovaCompra {
	
	static Home homeObj;
	static Login loginObj;
	static Cadastro cadastroObj;
	static CompraEndereco compraEnderecoObj;
	static DetalhesProduto detalhesProdutoObj;
	static Frete freteObj;
	static MinhaConta minhaContaObj;
	static ResultadoBusca resultadoBuscaObj;
	static ResumoCompra resumoCompraObj;
	static Pagamento pagamentoObj;
	static ConfirmarCompra confirmarCompraObj;
	
	@BeforeClass
	public static void configuracoes() {
		Configuration.startMaximized=true;
		Configuration.timeout=8000;
		
		open("http://automationpractice.com/");
		
		homeObj = new Home();
		loginObj = new Login();
		cadastroObj = new Cadastro();
		compraEnderecoObj = new CompraEndereco();
		detalhesProdutoObj = new DetalhesProduto();
		freteObj = new Frete();
		minhaContaObj = new MinhaConta();
		resultadoBuscaObj = new ResultadoBusca();
		resumoCompraObj = new ResumoCompra();
		confirmarCompraObj = new ConfirmarCompra();
		pagamentoObj = new Pagamento();
	}
	
	@Test
	public void buscarProduto() {
		homeObj.menuCadastro();
		loginObj.logar("erick2@erick.com", "123456");
		homeObj.buscarProduto("t-shirts");
	}
	
	@Test
	public void fazerCompra() {
		resultadoBuscaObj.escolherPrimeiroProduto();
		detalhesProdutoObj.adicionarCarrinho();
		resumoCompraObj.resumoSeguir();
		compraEnderecoObj.infosAdicionais("Teste compra");
		freteObj.aceitarTermos();
		pagamentoObj.tipoPagamento("banco");
		confirmarCompraObj.confirmaCompra();
		
		
	}

}
