package com.alura.appium.PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastroPageObjects {

    private AppiumDriver driverFeature;
    private MobileElement campoNome;
    private MobileElement campoSenha;
    private MobileElement campoConfereSenha;
    private MobileElement botaoCadastrar;
    private MobileElement mensagemErro;

    public CadastroPageObjects(AppiumDriver driver) {
        this.driverFeature = driver;
    }

    public void BuscarElementos() {

        campoNome = (MobileElement) driverFeature.findElementById("br.com.alura.aluraesporte:id/input_nome");
        campoSenha = (MobileElement) driverFeature.findElementById("br.com.alura.aluraesporte:id/input_senha");
        campoConfereSenha = (MobileElement) driverFeature.findElementById("br.com.alura.aluraesporte:id/input_confirmar_senha");
        botaoCadastrar = (MobileElement) driverFeature.findElementById("br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar");

    }

    private void PreencherFormulario(String usuario, String senha, String confirmacao) {
        campoNome.setValue(usuario);
        campoSenha.setValue(senha);
        campoConfereSenha.setValue(confirmacao);
    }

    public LoginPageObjects Cadastrar(String usuario, String senha, String confirmacao) {
        PreencherFormulario(usuario, senha, confirmacao);
        botaoCadastrar.click();
        return new LoginPageObjects(driverFeature);
    }

    public String MensagemErro() {
        By erroID = By.id("br.com.alura.aluraesporte:id/erro_cadastro");
        WebDriverWait espera = new WebDriverWait(driverFeature, 10);
        espera.until(ExpectedConditions.presenceOfElementLocated(erroID));
        mensagemErro = (MobileElement) driverFeature.findElement(erroID);

        return mensagemErro.getText();
    }
}

