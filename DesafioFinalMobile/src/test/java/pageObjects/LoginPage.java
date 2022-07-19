package pageObjects;

import static utils.Utils.driver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {

	Actions action = new Actions(driver);

	public LoginPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.microsoft.todos:id/signup_button")
	private MobileElement link_conta;

	@AndroidFindBy(id = "com.microsoft.todos:id/email_phone_edit_text")
	private MobileElement create_conta_email;

	@AndroidFindBy(id = "com.microsoft.todos:id/sign_in_button")
	private MobileElement botao_next;
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='i0118']")
	private MobileElement campo_senha;
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='idSIButton9']")
	private MobileElement btn_entrar;

//	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='i0118']")
//	private MobileElement campoSenha;
//	
//
//	@AndroidFindBy(xpath = "//android.widget.Button[@text='Sign in']")
//	private MobileElement botaoSign2;

	public void paginaInicial() {
		link_conta.isDisplayed();
	}

	public void criarContaEmail(String string) throws Exception {
		create_conta_email.sendKeys(string);

	}

	public void clicarSigin() {
		botao_next.click();
	}

	public void senha(String string) {

		campo_senha.sendKeys(string);
	}

	public void btnEntrar() {

		btn_entrar.click();
	}
	public void loginPrincipal(String email, String senha) throws Exception {
		Thread.sleep(5000);
		criarContaEmail(email);
		Thread.sleep(5000);
		clicarSigin();
		Thread.sleep(5000);
		senha(senha);
		Thread.sleep(5000);
		btnEntrar();
		
		
	}
}
