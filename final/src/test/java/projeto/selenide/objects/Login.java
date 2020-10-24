package projeto.selenide.objects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class Login {
	
	private SelenideElement inputEmail = $("#email_create"),
							btnCriarConta = $("#SubmitCreate"),
							inputLogin = $("#email"),
							inputSenha = $("#passwd"),
							btnLogar = $("#SubmitLogin");

	public SelenideElement getInputEmail() {
		return inputEmail;
	}

	public void setInputEmail(SelenideElement inputEmail) {
		this.inputEmail = inputEmail;
	}

	public SelenideElement getBtnCriarConta() {
		return btnCriarConta;
	}

	public void setBtnCriarConta(SelenideElement btnCriarConta) {
		this.btnCriarConta = btnCriarConta;
	}
	
	
	
	
	public SelenideElement getInputLogin() {
		return inputLogin;
	}

	public void setInputLogin(SelenideElement inputLogin) {
		this.inputLogin = inputLogin;
	}

	public SelenideElement getInputSenha() {
		return inputSenha;
	}

	public void setInputSenha(SelenideElement inputSenha) {
		this.inputSenha = inputSenha;
	}

	public SelenideElement getBtnLogar() {
		return btnLogar;
	}

	public void setBtnLogar(SelenideElement btnLogar) {
		this.btnLogar = btnLogar;
	}

	public void iniciarCadastro(String email) {
		inputEmail.setValue(email);
		btnCriarConta.click();
	}
	
	public void logar(String email, String senha) {
		inputLogin.setValue(email);
		inputSenha.setValue(senha);
		btnLogar.click();
	}

}
