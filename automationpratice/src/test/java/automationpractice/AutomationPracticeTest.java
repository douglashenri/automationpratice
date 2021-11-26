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

public class AutomationPracticeTest {

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
		account.preencherEmail("uninassaudglasa@yahoo.com.br");
		account.clicarCreateAccount();
		account.clicarMr();
		account.preencherNome("Douglassa");
		account.preencherSobreNome("Henriquea");
		account.preencherSenha("123456");
		account.selecionarDia("1");
		account.selecionarMes("2");
		account.selecionarAno("2000");
		account.clicarCheckBox();
		account.preencherEmpresa("Empresa X");
		account.preencherEndereco("Rua 2");
		account.preencherEndereco2("Rua 22");
		account.preencherCidade("Recife");
		account.selecionarState("9");
		account.preencherCep("56321");
		account.selecionarPais("21");
		account.preencherOutros("outro");
		account.preencherTelefone("12345678");
		account.preencherCelular("87654321");
		account.preencherEnderecoAlter("Alternativo");
		account.clicarRegistrar();
		
		
	}

}
