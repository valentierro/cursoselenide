package selenide.projeto;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.*;

import java.io.File;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class MetodosUteis {
	
	@BeforeTest
	void configuracao() {
		Configuration.startMaximized=true;
		Configuration.browser="firefox";
		Configuration.timeout=7000;
	}
	
	@Ignore
	@Test
	void upload() {
		
		open("https://the-internet.herokuapp.com/");
		$(By.linkText("File Upload")).click();
		File arquivoUpload = $("#file-upload").uploadFile(new File("src/test/upload.txt"));
		$("#file-submit").click();
		$("#uploaded-files").should(Condition.appear);
		
	}
	
	@Test
	void download() throws FileNotFoundException {
		open("https://the-internet.herokuapp.com/");
		$(By.linkText("File Download")).click();
		File arquidoDownload = $(By.linkText("some-file.txt")).download();
		System.out.println(arquidoDownload.getName());
		System.out.println(arquidoDownload.length());
		System.out.println(arquidoDownload.getPath());
		
		$(By.linkText("File Download")).toWebElement().click();
		
	}
	
	

}
