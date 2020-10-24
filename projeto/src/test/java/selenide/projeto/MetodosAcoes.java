package selenide.projeto;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;

public class MetodosAcoes {
	
	@BeforeTest
	void configuracao() {
		
		Configuration.startMaximized=true;
		Configuration.timeout=7000;
	}
	

	@Test
	void cadastro() {
		
		open("https://sqengineer.com/");
		$("#menu-item-33").hover();
		$(By.linkText("Basic Web elements")).pressEnter();
		$(by("value","Submit")).should(Condition.exist);
		$("#firstName").setValue("Erick").pressTab();
		$(By.id("lastName")).setValue("Santos");
		$(By.name("gender")).selectRadio("male");
		$("#email").setValue("erick@erick.com");
		$("#selectBox").selectOptionByValue("Sydney");
		$(by("value","Submit")).click();
		
	}
	
}
