package stepsDefinitions;

import static utils.Utils.driver;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.EditarListaPage;

public class EditarListaSteps {
	EditarListaPage el = new EditarListaPage();
	@Quando("entro na pagina principal do aplicativo")
	public void entroNaPaginaPrincipalDoAplicativo() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		el.telaLista();
	}

	@Quando("crio uma lista qualquer {string}")
	public void crioUmaListaQualquer(String texto) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		el.listaAleatoria(texto);
	}

	@Quando("entro nessa lista criada")
	public void entroNessaListaCriada() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		el.listaEditavel();
	}

	@Entao("edito ela com um texto")
	public void editoElaComUmTexto() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		el.escreverListaClick();
		el.escreverLista("Teste Editavel Teste Editavel");
		el.voltarHome();
	}

	@Entao("verifico se foi editada")
	public void verificoSeFoiEditada() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		el.validarTexto();
	}
}
