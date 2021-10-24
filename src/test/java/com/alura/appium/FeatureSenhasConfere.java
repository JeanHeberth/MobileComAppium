package com.alura.appium;

import io.appium.java_client.MobileElement;
import org.junit.Test;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;


public class FeatureSenhasConfere {

    @Test
    public void Consigo_Cadastrar_Usuario_Com_Senha_Que_Confere() throws MalformedURLException {

        AppiumDriverConfig driverFeature = new AppiumDriverConfig();
        MobileElement botaoCadastrarUsuario = (MobileElement) driverFeature.driverConfig.findElementById("br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario");
        botaoCadastrarUsuario.click();

        MobileElement campoNome = (MobileElement) driverFeature.driverConfig.findElementById("br.com.alura.aluraesporte:id/input_nome");
        MobileElement campoSenha = (MobileElement) driverFeature.driverConfig.findElementById("br.com.alura.aluraesporte:id/input_senha");
        MobileElement campoConfereSenha = (MobileElement) driverFeature.driverConfig.findElementById("br.com.alura.aluraesporte:id/input_confirmar_senha");
        MobileElement campoBotaoCadastrarSenha = (MobileElement) driverFeature.driverConfig.findElementById("br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar");
        campoNome.setValue("jean");
        campoSenha.setValue("123");
        campoConfereSenha.setValue("123");
        campoBotaoCadastrarSenha.click();


        //        MobileElement erroCadastro = (MobileElement) driverFeature.driverConfig.findElementById("br.com.alura.aluraesporte:id/erro_cadastro");
        //        assertEquals("Senhas não conferem", erroCadastro.getText());
    }
}

