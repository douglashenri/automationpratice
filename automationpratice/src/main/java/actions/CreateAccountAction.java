package actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.CreateAccountPage;
import util.DriverContext;

public class CreateAccountAction extends CreateAccountPage {
	
	protected WebDriverWait wait;
	
	public CreateAccountAction() {
		wait = new WebDriverWait(DriverContext.getDriver(), 5);
	}
	
	public void clicarSign() {
		wait.until(ExpectedConditions.elementToBeClickable(linkSigIn)).click();
	}
	
	public void preencherEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(txtEmail)).sendKeys(email);
	}
	
	public void clicarCreateAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(btCreateAccount)).click();
	}
	
	public void clicarMr() {
		wait.until(ExpectedConditions.elementToBeClickable(radioMr)).click();
	}
	
	public void preencherNome(String nome) {
		wait.until(ExpectedConditions.visibilityOf(txtNome)).sendKeys(nome);
	}
	
	public void preencherSobreNome(String sNome) {
		wait.until(ExpectedConditions.visibilityOf(txtSobreNome)).sendKeys(sNome);
	}
	
	public void preencherSenha(String senha) {
		wait.until(ExpectedConditions.visibilityOf(txtSenha)).sendKeys(senha);
	}
	
	public void selecionarDia(String dia) {
		Select cbNascDia = new Select(comboNascDia);
		cbNascDia.selectByValue(dia);
	}
	
	public void selecionarMes(String mes) {
		Select cbNascMes = new Select(comboNascMes);
		cbNascMes.selectByValue(mes);
	}
	
	public void selecionarAno(String ano) {
		Select cbNascAno = new Select(comboNascAno);
		cbNascAno.selectByValue(ano);
	}
	
	public void clicarCheckBox() {
		cBMarcar.click();
	}
	
	public void preencherEmpresa(String empresa) {
		wait.until(ExpectedConditions.visibilityOf(txtEmpresa)).sendKeys(empresa);
	}
	
	public void preencherEndereco(String endereco) {
		wait.until(ExpectedConditions.visibilityOf(txtEndereco)).sendKeys(endereco);
	}
	
	public void preencherEndereco2(String endereco2) {
		wait.until(ExpectedConditions.visibilityOf(txtEndereco2)).sendKeys(endereco2);
	}
	
	public void preencherCidade(String cidade) {
		wait.until(ExpectedConditions.visibilityOf(txtCidade)).sendKeys(cidade);
	}
	
	public void selecionarState(String state) {
		Select cbState = new Select(comboState);
		cbState.selectByValue(state);
	}
	
	public void preencherCep(String cep) {
		wait.until(ExpectedConditions.visibilityOf(txtCep)).sendKeys(cep);
	}
	
	public void selecionarPais(String pais) {
		Select cbPais = new Select(comboPais);
		cbPais.selectByValue(pais);
	}
	
	public void preencherOutros(String outro) {
		wait.until(ExpectedConditions.visibilityOf(txtOutros)).sendKeys(outro);
	}
	
	public void preencherTelefone(String telefone) {
		wait.until(ExpectedConditions.visibilityOf(txtTelefone)).sendKeys(telefone);
	}
	
	public void preencherCelular(String celular) {
		wait.until(ExpectedConditions.visibilityOf(txtCelular)).sendKeys(celular);
	}
	
	public void preencherEnderecoAlter(String alter) {
		wait.until(ExpectedConditions.visibilityOf(txtEnderecoAlternativo)).sendKeys(alter);
	}
	
	public void clicarRegistrar() {
		wait.until(ExpectedConditions.elementToBeClickable(btregistrar)).click();
	}
}
