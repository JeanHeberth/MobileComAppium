package com.alura.appium.PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginPageObjects {


    private AppiumDriver driverFeature;
    private MobileElement botaoCadastro;
    private MobileElement botaoCadastrarUsuario;

    public LoginPageObjects(AppiumDriver driver) {
        this.driverFeature = driver;
    }


    public void buscarElementos() {

        botaoCadastrarUsuario = (MobileElement) driverFeature.findElementById("br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario");
    }


    public CadastroPageObjects IrParaTelaDeCadastro() {
        botaoCadastrarUsuario.click();
        return new CadastroPageObjects(this.driverFeature);
    }
}
