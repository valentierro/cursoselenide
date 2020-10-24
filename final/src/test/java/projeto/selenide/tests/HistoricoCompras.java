package projeto.selenide.tests;

import static com.codeborne.selenide.Selenide.open;

import org.junit.BeforeClass;
import org.junit.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import projeto.selenide.objects.Cadastro;
import projeto.selenide.objects.CompraEndereco;
import projeto.selenide.objects.ConfirmarCompra;
import projeto.selenide.objects.DetalhesProduto;
import projeto.selenide.objects.Frete;
import projeto.selenide.objects.HistoricoPedidos;
import projeto.selenide.objects.Home;
import projeto.selenide.objects.Login;
import projeto.selenide.objects.MinhaConta;
import projeto.selenide.objects.Pagamento;
import projeto.selenide.objects.ResultadoBusca;
import projeto.selenide.objects.ResumoCompra;

public class HistoricoCompras {
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
	static HistoricoPedidos historicoObj;
	
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
		historicoObj= new HistoricoPedidos();
	}
	
	
	@Test
	public void verificarHistorico() {
		homeObj.menuCadastro();
		loginObj.logar("erick2@erick.com", "123456");
		minhaContaObj.historicoPedidos();
		historicoObj.validarQtdPedidos(2);
		
		
	}
}
