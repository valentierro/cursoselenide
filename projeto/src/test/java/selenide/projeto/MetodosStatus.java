package selenide.projeto;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MetodosStatus {
	
	@BeforeTest
	void configuracao() {
		Configuration.startMaximized=true;		
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
		//$(by("value","Submit")).click();
		
	}
	
	@Test
	void status() {
		
		System.out.println("Get Value: "+$("#firstName").getValue());
		System.out.println("Atribbuto: "+$("#firstName").attr("name"));
		System.out.println("Text: "+$(by("value","Submit")).text());
		System.out.println("Inner Text: "+$("#firstName").innerText());
		System.out.println("Select Option: "+$("#selectBox").getSelectedOption());
		System.out.println("Select Option: "+$("#selectBox").getSelectedValue());
		System.out.println("Select Option: "+$("#selectBox").getSelectedText());
		$(by("value","Submit")).isDisplayed();
		$(by("value","Submit")).exists();

	}

}
