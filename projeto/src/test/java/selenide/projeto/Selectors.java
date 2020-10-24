package selenide.projeto;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;

public class Selectors {
	
	
	@BeforeClass
	void configuracoes() {
		
		Configuration.startMaximized=true;
		Configuration.timeout=6000;
		
		
	}
	
	@Ignore
	@Test
	void teste() {
		
		open("https://www.submarino.com.br/");
		$("#h_search-input").setValue("celular").pressEnter();
		$$(By.className("ImageUI-sc-9rtsvr-0")).shouldHave(size(4));
		$(By.id("h_usr-link")).click();
		
	}
	@Ignore
	@Test
	void amazonBR() {
		
		open("https:/www.amazon.com.br/");
		$(By.id("nav-link-accountList")).hover();
		$(By.linkText("Comece aqui.")).click();
		$("#ap_customer_name").setValue("Erick").pressTab();
		$("#ap_email").setValue("adddsdsd@email.com").pressTab();
		$("#ap_password").setValue("123456").pressTab();
		$(By.name("passwordCheck")).setValue("123456");
		$(".a-button-input").click();
		
		Assert.assertTrue(title().equalsIgnoreCase("Confirme sua identidade"));	
		
	}
	
	@Test
	void elementoFilho() {
		
		open("https://sqengineer.com/");
		$("#menu-item-33").hover();
		$(By.linkText("Practice Tables")).click();
		//$("#table1").find(byText("Test Complete")).click();
		$("#table1").$(By.linkText("Test Complete")).click();
		
	}
	
}