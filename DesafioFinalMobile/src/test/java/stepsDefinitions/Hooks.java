package stepsDefinitions;


import static utils.Utils.acessarApp;
import static utils.Utils.driver;

import java.util.concurrent.TimeUnit;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

public class Hooks {
	@Before
	public void setUp() throws Exception {
		acessarApp();
	}
	@Before(value = "not @Login")
	public void loginAntesDeTudo() throws Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LoginPage lp = new LoginPage();
		Thread.sleep(7000);
		lp.loginPrincipal("accpbcristal9@gmail.com", "d3d3.dllJ");
	}

	@After
	public void tearDown(Scenario scenario) {
	//	capturarTela(scenario);
		 driver.quit();
	}
}
