package com.alura.appium.PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginPageObjects {


    private AppiumDriver driverFeature;
    private MobileElement botaoCadastro;

    public LoginPageObjects(AppiumDriver driver) {
        this.driverFeature = driver;
    }


    public void buscarElementos() {

        botaoCadastro = (MobileElement) driverFeature.findElementById("br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar");
    }

    public CadastroPageObjects IrParaCadastro() {
        botaoCadastro.click();
        return new CadastroPageObjects(this.driverFeature);
    }
}
