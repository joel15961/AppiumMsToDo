package stepsDefinitions;

import static utils.Utils.driver;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ExcluirListaPgae;

public class ExcluirListaSteps {
	ExcluirListaPgae elp = new ExcluirListaPgae();

	@Quando("entro na lista principal de todos as lista")
	public void entroNaListaPrincipalDeTodosAsLista() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		elp.telaLista();
		elp.clicarListas();
	}

	@Quando("visualizo Teste Tasks {string}")
	public void visualizoTesteTasks(String string) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		elp.entrarLista(string);
		elp.clicarDeletar();
		elp.clicarDeletarModal();
		
	}

	@Quando("visualizo Testes Planed {string}")
	public void visualizoTestesPlaned(String string) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		elp.entrarLista(string);
		elp.clicarDeletar();
		elp.clicarDeletarModal();
	}

	@Quando("visualizo Testes Important{string}")
	public void visualizoTestesImportant(String string) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		elp.entrarLista(string);
		elp.clicarDeletar();
		elp.clicarDeletarModal();
	}
	@Quando("visualizo Testes My Day{string}")
	public void visualizoTestesMyDay(String string) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		elp.entrarLista(string);
		elp.clicarDeletar();
		elp.clicarDeletarModal();
	}


	@Entao("verifico sua exclusao")
	public void verificoSuaExclusao() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		elp.validarExclusao();
	}
}
