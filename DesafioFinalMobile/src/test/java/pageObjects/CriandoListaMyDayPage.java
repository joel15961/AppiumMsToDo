package pageObjects;

import static utils.Utils.driver;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CriandoListaMyDayPage {


	public CriandoListaMyDayPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.microsoft.todos:id/lists_recycler_view']")
	private MobileElement tela_lista;
	public void telaLista() {
		tela_lista.isDisplayed();
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.microsoft.todos:id/list_name']")
	private MobileElement botao_my_day;
	public void clicarBotaoMyDay() {
		botao_my_day.click();
	}

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='com.microsoft.todos:id/new_todo_fab']")
	private MobileElement botao_adicionar_myDay;
	public void clicarBotaoAdicionarMyDay() {
		botao_adicionar_myDay.click();
	}
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.microsoft.todos:id/create_task_edit_text']")
	private MobileElement adicionar_task;
	public void adicionarLista(String texto) {
		adicionar_task.sendKeys(texto);
	}
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.microsoft.todos:id/create_task_image_button']")
	private MobileElement botao_adicionar_lista;
	public void botaoAdicionarLista() {
		botao_adicionar_lista.click();
	}
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id='com.microsoft.todos:id/task_content']")
	private MobileElement lista_na_pagina;
	public void listarListas() {
		lista_na_pagina.isDisplayed();
	}
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.microsoft.todos:id/empty_circle']")
	private MobileElement completa_lista;
	public void clicarCompleto() {
		completa_lista.click();
	}
}
