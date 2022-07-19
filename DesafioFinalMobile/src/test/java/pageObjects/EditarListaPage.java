package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EditarListaPage {
	public EditarListaPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.microsoft.todos:id/lists_recycler_view']")
	private MobileElement tela_lista;
	public void telaLista() {
		tela_lista.isDisplayed();
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Tasks']")
	private MobileElement botao_Tasks;
	public void clicarBotaoTasks() {
		botao_Tasks.click();
	}

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='com.microsoft.todos:id/new_todo_fab']")
	private MobileElement botao_adicionar_Tasks;
	public void clicarBotaoAdicionarTasks() {
		botao_adicionar_Tasks.click();
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
	public void listaAleatoria(String texto) {
		clicarBotaoTasks();
		clicarBotaoAdicionarTasks();
		adicionarLista(texto);
		botaoAdicionarLista();
		listarListas();
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='teste Editavel']")
	private MobileElement lista_editavel;
	public void listaEditavel() {
		lista_editavel.click();
	}
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='Add note, Button']")
	private MobileElement nota;
	public void escreverListaClick() {
		nota.click();		
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Updated a few moments ago']")
	private MobileElement validar_texto;
	public void validarTexto() {
		String texto = validar_texto.getText();
		assertEquals("Updated a few moments ago", texto);
	}
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Add note']")
	private MobileElement nota_escrever;
	public void escreverLista(String texto) {
		nota_escrever.sendKeys(texto);		
	}
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='android:id/home']")
	private MobileElement voltar;
	public void voltarHome() {
		voltar.click();	
	}
}
