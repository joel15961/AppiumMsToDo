package stepsDefinitions;

import static utils.Utils.driver;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CriandoListaAssignedToMePage;
import pageObjects.CriandoListaImportantPage;
import pageObjects.CriandoListaMyDayPage;
import pageObjects.CriandoListaplanedPage;

public class CriandoListaSteps {
	CriandoListaMyDayPage clpmd = new CriandoListaMyDayPage();
	CriandoListaImportantPage clip = new CriandoListaImportantPage();
	CriandoListaplanedPage clpp = new CriandoListaplanedPage();
	CriandoListaAssignedToMePage clatmp = new CriandoListaAssignedToMePage();
	@Quando("estou logado na pagina principal de Listas")
	public void estouLogadoNaPaginaPrincipalDeListas() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clpmd.telaLista();
		
	}

	@Entao("Clico na aba de My Day")
	public void clicoNaAbaDeMyDay() throws Exception {
		Thread.sleep(3000);
		clpmd.clicarBotaoMyDay();
	   
	}

	@Entao("Aperto no botao de adicionar")
	public void apertoNoBotaoDeAdicionar() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clpmd.clicarBotaoAdicionarMyDay();
	}

	@Entao("Descrevo o nome {string}")
	public void descrevoONome(String string)throws Exception {
		Thread.sleep(3000);
		clpmd.adicionarLista(string);
	}

	@Entao("clico no botao de Adicionar Lembrete")
	public void clicoNoBotaoDeAdicionarLembrete()  {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clpmd.botaoAdicionarLista();
	}

	@Entao("Verifico que existe Lembretes")
	public void verificoQueExisteLembretes() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clpmd.listarListas();
	}

	@Entao("clico em Completado")
	public void clicoEmCompletado() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clpmd.clicarCompleto();
	}

	@Quando("estou ligado na pagina principal de Listas important")
	public void estouLigadoNaPaginaPrincipalDeListasImportant() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clip.telaLista();
	}

	@Entao("Clico na aba deimportant")
	public void clicoNaAbaDeimportant() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clip.clicarBotaoimportant();
	}

	@Entao("Aperto no botao de adicionar Lista")
	public void apertoNoBotaoDeAdicionarLista() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clip.clicarBotaoAdicionarimportanty();
	}

	@Entao("escrevo o nome {string}")
	public void escrevoONome(String string) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clip.adicionarLista(string);
	}

	@Entao("clico  Adicionar Lembrete")
	public void clicoAdicionarLembrete() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clip.botaoAdicionarLista();
	}

	@Entao("Verifico se tem Lembretes")
	public void verificoSeTemLembretes() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clip.listarListas();
	}

	@Entao("clico em Completo")
	public void clicoEmCompleto() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clip.clicarCompleto();
	}

	@Quando("estou ligado na pagina da Lista Planed")
	public void estouLigadoNaPaginaDaListaPlaned() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clpp.telaLista();
	}

	@Entao("Clico na aba de Planed")
	public void clicoNaAbaDePlaned() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clpp.clicarBotaoPlanned();
	}

	@Entao("Aperto no botao de adicionar lista Planed")
	public void apertoNoBotaoDeAdicionarListaPlaned() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clpp.clicarBotaoAdicionarPlanned();
	}

	@Entao("Descrevo o nome {string} da lista Planed")
	public void descrevoONomeDaListaPlaned(String string) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clpp.adicionarLista(string);
	}

	@Entao("clico no botao de Adicionar Lembrete da lista Planed")
	public void clicoNoBotODeAdicionarLembreteDaListaPlaned() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clpp.botaoAdicionarLista();
	}

	@Entao("Verifico que existe Lembretes da lista Planed")
	public void verificoQueExisteLembretesDaListaPlaned() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clpp.listarListas();
	}

	@Entao("clico em Completado na lista Planed")
	public void clicoEmCompletadoNaListaPlaned() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clpp.clicarCompleto();
	}

	@Quando("estou ligado na pagina principal de Listas AssignedToMe")
	public void estouLigadoNaPaginaPrincipalDeListasAssignedToMe() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clatmp.telaLista();
	}

	@Entao("Clico na aba de AssignedToMe")
	public void clicoNaAbaDeAssignedToMe() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clatmp.clicarBotaoTasks();
	}

	@Entao("Aperto no botao de adicionar da lista AssignedToMe")
	public void apertoNoBotaoDeAdicionarDaListaAssignedToMe() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clatmp.clicarBotaoAdicionarTasks();
		
	}

	@Entao("Descrevo o nome {string} na lista AssignedToMe")
	public void descrevoONomeNaListaAssignedToMe(String string) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clatmp.adicionarLista(string);
		
	}

	@Entao("clico no botao de Adicionar Lembrete da lista AssignedToMe")
	public void clicoNoBotODeAdicionarLembreteDaListaAssignedToMe() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clatmp.botaoAdicionarLista();
		
	}

	@Entao("Verifico que existe Lembretes na lista AssignedToMe")
	public void verificoQueExisteLembretesNaListaAssignedToMe() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clatmp.listarListas();
		
	}

	@Entao("clico em Completado na pagina da AssignedToMe")
	public void clicoEmCompletadoNaPaginaDaAssignedToMe() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clatmp.clicarCompleto();
	}
}
