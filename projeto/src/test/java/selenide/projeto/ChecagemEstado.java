package selenide.projeto;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

public class ChecagemEstado {

	@BeforeClass
	void configuracoes() {

		Configuration.timeout = 3000;
		Configuration.startMaximized = true;

	}

	@Test
	void checagemEstado() {

		open("https://the-internet.herokuapp.com/");
		$(By.linkText("Dynamic Loading")).click();
		$(By.linkText("Example 1: Element on page that is hidden")).click();
		$("#start").$(By.tagName("button")).should(Condition.exist);
		$("#start").$(By.tagName("button")).shouldHave(Condition.exactText("Start")).click();
		$("#finish").find(By.tagName("h4")).shouldBe(Condition.visible);		
	}

}
