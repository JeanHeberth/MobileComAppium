package com.alura.appium.PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

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

    public void Cadastrar(String usuario, String senha, String confirmacao) {
        PreencherFormulario(usuario, senha, confirmacao);
        botaoCadastrar.click();
    }

    public String MensagemErro() {
        mensagemErro = (MobileElement) driverFeature.findElementById("br.com.alura.aluraesporte:id/erro_cadastro");
        return mensagemErro.getText();
    }
}

