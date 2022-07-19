package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ExcluirListaPgae {
	public ExcluirListaPgae() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.microsoft.todos:id/lists_recycler_view']")
	private MobileElement tela_lista;
	public void telaLista() {
		tela_lista.isDisplayed();
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Tasks']")
	private MobileElement clicar_todas_listas;
	public void clicarListas() {
		clicar_todas_listas.click();
	}
	
	public void entrarLista(String string) {
	 MobileElement inserirValor = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='"+string+"']");
	 inserirValor.click();
	}
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.microsoft.todos:id/delete']")
	private MobileElement deletar;
	public void clicarDeletar() {
		deletar.click();
	}
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
	private MobileElement modal_deletar;
	public void clicarDeletarModal() {
		modal_deletar.click();
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Tasks show up here if they aren’t part of any lists you’ve created.']")
	private MobileElement empty;
	public void validarExclusao() {
		String texto = empty.getText();
		assertEquals("Tasks show up here if they aren’t part of any lists you’ve created.", texto);
	}
	
	
}
