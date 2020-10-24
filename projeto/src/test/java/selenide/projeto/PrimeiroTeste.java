package selenide.projeto;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class PrimeiroTeste {
	
	
	@BeforeClass
	void antesDeTudo() {
		
		Configuration.startMaximized=true;
		Configuration.browser="firefox";
		Configuration.headless=true;
		
	}
	
	@Test
	void teste() {
		
		open("https://www.facebook.com/");
		$("#email").setValue("erick@erick.com").pressTab();
		$(By.name("pass")).setValue("21656515").pressEnter();
		$(".fb_logo ._8ilh .img").shouldNot(Condition.appear);
	}

}
