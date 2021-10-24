package com.alura.appium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.alura.appium.PageObjects.CadastroPageObjects;
import com.alura.appium.PageObjects.LoginPageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Test;


public class FeatureErroSenhasNaoConfere {

    @Test
    public void nao_Consigo_Cadastrar_Usuario_Com_Senha_Que_Nao_Confere() {

        AppiumDriver driverFeature = AppiumDriverConfig.Intance().driverConfig;
        MobileElement botaoCadastrarUsuario = (MobileElement) driverFeature.findElementById("br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario");
        botaoCadastrarUsuario.click();


        CadastroPageObjects telaCadastro = new CadastroPageObjects(driverFeature);
        telaCadastro.BuscarElementos();
        telaCadastro.Cadastrar("Jean", "123", "321");
        assertEquals("Senhas não conferem", telaCadastro.MensagemErro());
        driverFeature.navigate().back();
    }

    @Test
    public void Consigo_Cadastrar_Usuario_Com_Senha_Que_Confere() {

        AppiumDriver driverFeature = AppiumDriverConfig.Intance().driverConfig;

        MobileElement botaoCadastrarUsuario = (MobileElement) driverFeature.findElementById("br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario");
        botaoCadastrarUsuario.click();

        CadastroPageObjects telaCadastro = new CadastroPageObjects(driverFeature);
        telaCadastro.BuscarElementos();
        telaCadastro.Cadastrar("Jean", "123", "123");

        MobileElement botaoLogar = (MobileElement) driverFeature.findElementById("br.com.alura.aluraesporte:id/login_botao_logar");


    }


}

