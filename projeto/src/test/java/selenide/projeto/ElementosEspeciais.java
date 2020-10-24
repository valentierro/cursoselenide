package selenide.projeto;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.getSelectedRadio;
import static com.codeborne.selenide.Selenide.open;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.WebDriverRunner.*; 

public class ElementosEspeciais {
	
	@BeforeTest
	void configuracoes() {
		Configuration.startMaximized=true;
		Configuration.timeout=7000;
	}
	
	@Ignore
	@Test
	void checkboxRadio() {
			open("https://www.testandquiz.com/selenium/testing.html");	
			$("#fname").setValue("Erick");
			$(By.name("gender")).selectRadio("male");
			$(".Automation").setSelected(true);
			$(".Performance").setSelected(true);
			//$(".Automation").setSelected(false);
			$(".Performance").setSelected(false);
			
			System.out.println($(".Automation").isSelected());
			System.out.println($(".Performance").isSelected());
			
			System.out.println(getSelectedRadio(By.name("gender")).val());
	}
	
	@Ignore
	@Test
	void select() {
		open("https://www.seleniumeasy.com/test/");
		$(By.linkText("No, thanks!")).click();
		$(By.linkText("Input Forms")).click();
		$(By.linkText("Select Dropdown List")).click();
		$("#select-demo").selectOption(2);
		$("#select-demo").selectOption("Friday");
		$("#select-demo").selectOptionByValue("Saturday");
		$("#select-demo").selectOptionContainingText("Sun");
		
		System.out.println($("#select-demo").getSelectedText());
		System.out.println($("#select-demo").getSelectedValue());
		System.out.println($("#select-demo").getSelectedOption());
	}
	@Ignore
	@Test
	void multiselect() {
		open("https://www.seleniumeasy.com/test/");
		$(By.linkText("No, thanks!")).click();
		$(By.linkText("Input Forms")).click();
		$(By.linkText("Select Dropdown List")).click();
		
		$("#multi-select").selectOption(0,3);
		//$("#multi-select").selectOption("Florida","Pennsylvania","Washington");
		//$("#multi-select").selectOptionByValue("Texas","Ohio");
		
		System.out.println($("#multi-select").getSelectedText());
		System.out.println($("#multi-select").getSelectedValue());
		System.out.println($("#multi-select").getSelectedOption());
		
		
	}
	
	@Ignore
	@Test
	void iframe() {
		open("https://the-internet.herokuapp.com/");
		$(By.linkText("Frames")).click();
		$(By.linkText("iFrame")).click();
		
		switchTo().frame("mce_0_ifr");
		
		$("#tinymce").clear();
		$("#tinymce").setValue("Teste de iframes");
		
		switchTo().parentFrame();
		
		$(By.linkText("Elemental Selenium")).click();
		
	}
	
	@Ignore
	@Test
	void alerts() throws InterruptedException {
		open("https://the-internet.herokuapp.com/");
		$(By.linkText("JavaScript Alerts")).scrollTo().click();
		$(by("onclick","jsAlert()")).click();
		System.out.println(switchTo().alert().getText());
		switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		$(by("onclick","jsConfirm()")).click();
		switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		
		$(by("onclick","jsPrompt()")).click();
		switchTo().alert().sendKeys("Teste de alerta");
		Thread.sleep(2000);
		switchTo().alert().accept();
		Thread.sleep(2000);
	}
	
	@Test
	void janelas() {
		open("https://demoqa.com/browser-windows");
		$("#tabButton").click();
		System.out.println(switchTo().window(1).getCurrentUrl());
		System.out.println(switchTo().window(0).getCurrentUrl());
		$("#windowButton").click();
		System.out.println(switchTo().window(2).getCurrentUrl());
		System.out.println(switchTo().window(0).getCurrentUrl());
		
		
		WebDriver driver = WebDriverRunner.getAndCheckWebDriver();
		
		
		
		
	}
	
	
}

