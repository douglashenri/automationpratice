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

//////////////////////////////////////CADASTRO/////////////////////////////////////

	@FindBy(how = How.LINK_TEXT, using = "Sign in")
	protected WebElement linkSigIn;

	@FindBy(how = How.ID, using = "email_create")
	protected WebElement txtEmail;

	@FindBy(how = How.ID, using = "SubmitCreate")
	protected WebElement btCreateAccount;

	@FindBy(how = How.ID, using = "id_gender1")
	protected WebElement radioMr;

	@FindBy(how = How.ID, using = "customer_firstname")
	protected WebElement txtNome;

	@FindBy(how = How.ID, using = "customer_lastname")
	protected WebElement txtSobreNome;

	@FindBy(how = How.ID, using = "passwd")
	protected WebElement txtSenha;

	@FindBy(how = How.ID, using = "days")
	protected WebElement comboNascDia;

	@FindBy(how = How.ID, using = "months")
	protected WebElement comboNascMes;

	@FindBy(how = How.ID, using = "years")
	protected WebElement comboNascAno;

	@FindBy(how = How.ID, using = "newsletter")
	protected WebElement cBMarcar;

	@FindBy(how = How.ID, using = "company")
	protected WebElement txtEmpresa;

	@FindBy(how = How.ID, using = "address1")
	protected WebElement txtEndereco;

	@FindBy(how = How.ID, using = "address2")
	protected WebElement txtEndereco2;

	@FindBy(how = How.ID, using = "city")
	protected WebElement txtCidade;

	@FindBy(how = How.ID, using = "id_state")
	protected WebElement comboState;

	@FindBy(how = How.ID, using = "postcode")
	protected WebElement txtCep;

	@FindBy(how = How.ID, using = "id_country")
	protected WebElement comboPais;

	@FindBy(how = How.ID, using = "other")
	protected WebElement txtOutros;

	@FindBy(how = How.ID, using = "phone")
	protected WebElement txtTelefone;

	@FindBy(how = How.ID, using = "phone_mobile")
	protected WebElement txtCelular;

	@FindBy(how = How.ID, using = "alias")
	protected WebElement txtEnderecoAlternativo;

	@FindBy(how = How.ID, using = "submitAccount")
	protected WebElement btregistrar;

///////////////////////////////////////LOGIN///////////////////////////////////////

	@FindBy(how = How.ID, using = "email")
	protected WebElement txtLogarEmail;

	@FindBy(how = How.ID, using = "passwd")
	protected WebElement txtLogarSenha;

	@FindBy(how = How.ID, using = "SubmitLogin")
	protected WebElement txtLogarEntrar;

	@FindBy(how = How.ID, using = "search_query_top")
	protected WebElement txtPesquisar;

	@FindBy(how = How.NAME, using = "submit_search")
	protected WebElement btPesquisar;

	@FindBy(how = How.CLASS_NAME, using = "icon-th-list")
	protected WebElement selectListFigura;

	@FindBy(how = How.ID, using = "color_1")
	protected WebElement selectColortFigura;

	@FindBy(how = How.ID, using = "add_to_cart")
	protected WebElement selectAddCarrinho;

	@FindBy(how = How.XPATH, using = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	protected WebElement selectCheckOut;

	@FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/p[2]/a[1]")
	protected WebElement selectCheckOutContinuar;

	@FindBy(how = How.NAME, using = "message")
	protected WebElement txtObs;

	@FindBy(how = How.NAME, using = "processAddress")
	protected WebElement btEnderecoCotinuar;

	@FindBy(how = How.ID, using = "cgv")
	protected WebElement cbAceitarTermos;

	@FindBy(how = How.NAME, using = "processCarrier")
	protected WebElement btCotinuarEnvio;

	@FindBy(how = How.XPATH, using = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	protected WebElement selectIrModoPagamento;

	@FindBy(how = How.XPATH, using = "//*[@id=\"cart_navigation\"]/button/span")
	protected WebElement selectConfirmarPedido;
}
