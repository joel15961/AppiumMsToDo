package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;
import static utils.Utils.*;

public class LoginSteps {
	
	LoginPage lp = new LoginPage();
	
	@Dado("que o usuario esteja acessando o sistema")
	public void queOUsuarioEstejaAcessandoOSistema() throws Exception {
		Thread.sleep(2000);
		lp.paginaInicial();
	}

	@Quando("o usuario informar o email {string}")
	public void oUsuarioInformarOEmail(String string) throws Exception {
		
	    lp.criarContaEmail(string);
	}

	@Quando("clicar em sign")
	public void clicarEmSign() {
	    lp.clicarSigin();
	}

	@Quando("informar a senha {string}")
	public void informarASenha(String string)throws Exception {
		Thread.sleep(7000);
	    lp.senha(string);
	}

	@Quando("clicar no botao de login")
	public void clicarNoBotaoDeLogin() {
	    lp.btnEntrar();
	}

	@Entao("o sistema exibe o usuario logado")
	public void oSistemaExibeOUsuarioLogado() {
	    
	}

}
