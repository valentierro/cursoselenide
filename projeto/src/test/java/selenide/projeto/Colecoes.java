package selenide.projeto;

import static com.codeborne.selenide.Selenide.*;

import org.junit.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.collections.*;
import static com.codeborne.selenide.CollectionCondition.*;


public class Colecoes {
	
	@BeforeTest
	void configuracao() {
		Configuration.timeout=7000;
		Configuration.startMaximized=true;
		open("https://www.submarino.com.br/");
	}
	
	@Test(priority = 0)
	void colecoes() {
		
		$("#lgpd-accept").click();
		$("#h_search-input").setValue("celular").pressEnter();
		$(".page-title").should(Condition.exactText("celular"));
		//ElementsCollection colecoes = $$(".product-grid-item");
		//System.out.println(colecoes.size());
		//colecoes.shouldHaveSize(42);
		//Assert.assertTrue(colecoes.size() > 0);
		
		//$$(".product-grid-item").shouldHaveSize(42);	
		
		
	}
	
	@Ignore
	@Test(priority = 1)
	void assertions() {
		ElementsCollection titulos = $$(".TitleUI-bwhjk3-15");
		System.out.println(titulos.size());
		
		titulos.shouldHave(size(34));
		System.out.println("Passou no teste ShouldHave size");
		
		titulos.shouldBe(sizeGreaterThan(30));
		System.out.println("Passou no teste sizeGreaterThan");
		
		titulos.shouldBe(sizeGreaterThanOrEqual(33));
		System.out.println("Passou no teste sizeGreaterThanOrEqual");
		
		titulos.shouldBe(sizeLessThan(36));
		System.out.println("Passou no teste sizeLessThan");
		
		titulos.shouldBe(sizeLessThanOrEqual(36));
		System.out.println("Passou no teste sizeLessThanOrEqual");
		
		//titulos.shouldHave(texts("Motorola","Samsung"));
		//System.out.println("Passou no teste texts");
		
		//titulos.shouldHave(exactTexts("Smartphone Motorola Moto G8 64GB Dual Chip Android 6,4\" Qualcomm Snapdragon 665 (SM6125) 4G Câmera Traseira 16MP + 8MP + 2MP Foco à Laser Filmadora 4K - Branco Prisma"));
		//System.out.println("Passou no exactTexts");
		
		titulos.shouldBe(empty);
		System.out.println("Passou no empty");
	}
	
	@Test(priority = 1)
	void filtros() {
		
		
		ElementsCollection titulos = $$(".TitleUI-bwhjk3-15");
		System.out.println(titulos.size());
		
		System.out.println(titulos.filterBy(Condition.text("A71")).size());
		System.out.println(titulos.excludeWith(Condition.text("A71")).size());
		System.out.println(titulos.findBy(Condition.text("A71")).shouldHave(Condition.text("Smartphone Samsung Galaxy A71 128GB Dual Chip Android Tela 6,7\" Octa-Core 2.2 GHz 4G Câmera Quádrupla 64MP(Principal)+12MP(Ultra Wide)+5MP(Macro)+5MP(Profundidade) Filmadora 4K")));
		System.out.println(titulos.get(0));
		System.out.println(titulos.get(0).shouldHave(Condition.text("Motorola")));
		
	}
}
