package automationpractice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actions.CreateAccountAction;
import util.Constants;
import util.DriverContext;

public class AutomationPracticeTestLogin {

	WebDriver driver;
	CreateAccountAction account;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", Constants.PATH_CHROMEDRIVE );
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		DriverContext.setDriver(driver);
		account = new CreateAccountAction();
	}
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		account.clicarSign();
		account.preencherEmailLogin("uninassaudglasas@yahoo.com.br");
		account.preencherSenhaLogin("123456");
		account.clicarEntrarLogar();
		account.preencherPesquisa("Faded Short Sleeve T-shirts");
		account.clicarPesquisar();
		account.clicarListFigura();
		account.clicarColorFigura();
		account.ClicarAddCarrinho();
		account.ClicarCheckOut();
		account.ClicarCheckOutContinuar();
		account.preencherObs("Favor enviar embalagem para presente!");
		account.ClicarEnderecoContinuar();
		account.ClicarAceitartermos();
		account.ClicarContinuarEnvio();
		account.ClicarModoDePagamento();
		account.ClicarConfirmarPedido();
		
		
	}

}
