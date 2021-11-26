package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import util.DriverContext;

public class CreateAccountPage {
	
	
	
	public CreateAccountPage() {
		PageFactory.initElements(DriverContext.getDriver(), this);
	}

	@FindBy(how=How.LINK_TEXT, using="Sign in")
	protected WebElement linkSigIn;
	
	@FindBy(how= How.ID, using="email_create")
	protected WebElement txtEmail;

	@FindBy(how= How.ID, using="SubmitCreate")
	protected WebElement btCreateAccount;
	
	@FindBy(how= How.ID, using="id_gender1")
	protected WebElement radioMr;
	
	@FindBy(how= How.ID, using="customer_firstname")
	protected WebElement txtNome;
	
	@FindBy(how= How.ID, using="customer_lastname")
	protected WebElement txtSobreNome;
	
	@FindBy(how= How.ID, using="passwd")
	protected WebElement txtSenha;

	@FindBy(how= How.ID, using="days")
	protected WebElement comboNascDia;
	
	@FindBy(how= How.ID, using="months")
	protected WebElement comboNascMes;
	
	@FindBy(how= How.ID, using="years")
	protected WebElement comboNascAno;
	
	@FindBy(how= How.ID, using="newsletter")
	protected WebElement cBMarcar;
	
	@FindBy(how= How.ID, using="company")
	protected WebElement txtEmpresa;
	
	@FindBy(how= How.ID, using="address1")
	protected WebElement txtEndereco;
	
	@FindBy(how= How.ID, using="address2")
	protected WebElement txtEndereco2;
	
	@FindBy(how= How.ID, using="city")
	protected WebElement txtCidade;
	
	@FindBy(how= How.ID, using="id_state")
	protected WebElement comboState;
	
	@FindBy(how= How.ID, using="postcode")
	protected WebElement txtCep;
	
	@FindBy(how= How.ID, using="id_country")
	protected WebElement comboPais;
	
	@FindBy(how= How.ID, using="other")
	protected WebElement txtOutros;	
	
	@FindBy(how= How.ID, using="phone")
	protected WebElement txtTelefone;
	
	@FindBy(how= How.ID, using="phone_mobile")
	protected WebElement txtCelular;
	
	@FindBy(how= How.ID, using="alias")
	protected WebElement txtEnderecoAlternativo;
	
	@FindBy(how= How.ID, using="submitAccount")
	protected WebElement btregistrar;
	
}
