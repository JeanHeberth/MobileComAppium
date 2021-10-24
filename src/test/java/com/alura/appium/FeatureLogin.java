package com.alura.appium;

import io.appium.java_client.MobileElement;
import org.junit.Test;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;


public class FeatureLogin {

    @Test
    public void Consigo_Realizar_Login_No_Sistema() throws MalformedURLException {

        AppiumDriverConfig driverFeature = new AppiumDriverConfig();


        MobileElement campoIdUsuario = (MobileElement) driverFeature.driverConfig.findElementById("br.com.alura.aluraesporte:id/input_usuario");
        MobileElement campoSenhaUsuario = (MobileElement) driverFeature.driverConfig.findElementById("br.com.alura.aluraesporte:id/input_senha");
        MobileElement botaoLogar = (MobileElement) driverFeature.driverConfig.findElementById("br.com.alura.aluraesporte:id/login_botao_logar");
        campoIdUsuario.setValue("jean");
        campoSenhaUsuario.setValue("123");
        botaoLogar.click();

//        MobileElement erroCadastro = (MobileElement) driverFeature.driverConfig.findElementById("br.com.alura.aluraesporte:id/erro_cadastro");
//        assertEquals("Senhas não conferem", erroCadastro.getText());
    }
}


