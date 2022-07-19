package pageObjects;

import static utils.Utils.driver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class UsuarioPage {

	Actions action = new Actions(driver);

	public UsuarioPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.microsoft.todos:id/edit_text")
	private MobileElement listTitle;

	@AndroidFindBy(id = "com.microsoft.todos:id/create_list_text_view")
	private MobileElement botaoAddLista;

	@AndroidFindBy(id = "android:id/button1")
	private MobileElement botaoCreate;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='teste']")
	private MobileElement listaTeste;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Back']")
	private MobileElement botaoBack;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='SAVE']")
	private MobileElement botaoSave;

	@AndroidFindBy(id = "com.microsoft.todos:id/name_background")
	private MobileElement botaoListaTitle;

	@AndroidFindBy(id = "com.microsoft.todos:id/new_todo_fab")
	private MobileElement botaoAddItem;

	@AndroidFindBy(id = "com.microsoft.todos:id/create_task_edit_text")
	private MobileElement taskTitle;

	@AndroidFindBy(id = "com.microsoft.todos:id/create_task_image_button")
	private MobileElement createTask;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='lista editada']")
	private MobileElement listaEditada;

	@AndroidFindBy(id = "com.microsoft.todos:id/task_title")
	private MobileElement taskNovoItem;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@bounds='[975,73][1080,199]']")
	private MobileElement opcoesTask;

	@AndroidFindBy(id = "com.microsoft.todos:id/delete")
	private MobileElement botaoDelete1;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='DELETE']")
	private MobileElement botaoDelete2;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='More options']")
	private MobileElement menuLista;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Delete list']")
	private MobileElement botaoDeleteList;

	public void acionarDeleteList() {
		botaoDeleteList.click();
	}

	public void abrirMenuLista() {
		menuLista.click();
	}

	public void acionarBotaoDelete2() throws Exception {
		Thread.sleep(2000);
		botaoDelete2.click();
	}

	public void acionarBotaoDelete1() throws Exception {
		Thread.sleep(2000);
		botaoDelete1.click();
	}

	public void selecionarTaskNovoItem() throws Exception {
		Thread.sleep(2000);
		action.clickAndHold(taskNovoItem).perform();
	}

	public void selecionarListaEditada() throws Exception {
		Thread.sleep(3000);
		listaEditada.click();
	}

	public void acionarBotaoCreateTask() throws Exception {
		Thread.sleep(2000);
		createTask.click();
	}

	public void informarTaskTitle(String string) {
		taskTitle.sendKeys(string);
	}

	public void acionarBotaoAddItem() throws Exception {
		botaoAddItem.click();
	}

	public void acionarBotaoListaTittle() {
		botaoListaTitle.click();
	}

	public void acionarBotaoSave() {
		botaoSave.click();
	}

	public void acionarBotaoBack() throws Exception {
		Thread.sleep(4000);
		botaoBack.click();
	}

	public void selecionarListaTeste() throws Exception {
		Thread.sleep(5000);
		listaTeste.click();
	}

	public void acionarBotaoCreate() throws Exception {
		Thread.sleep(3000);
		botaoCreate.click();
	}

	public void informarNomeDaLista(String string) throws Exception {
		Thread.sleep(3000);
		listTitle.sendKeys(string);
	}

	public void acionarBotaoAddLista() throws Exception {
		Thread.sleep(5000);
		botaoAddLista.click();
	}

	public void abrirTaskNovoItem() {
		taskNovoItem.click();
	}
}
