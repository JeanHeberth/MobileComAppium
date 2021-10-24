package com.alura.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriverConfig {

    public final AppiumDriver driverConfig;
    private static AppiumDriverConfig _instace;


    public static AppiumDriverConfig Intance(){
        if (AppiumDriverConfig._instace == null){
            AppiumDriverConfig._instace = new AppiumDriverConfig();
        }
        return AppiumDriverConfig._instace;
    }



    public AppiumDriverConfig(){

        File apk = new File("D:\\Documentos\\DesenvolvimentoIntellij\\aluraAppium\\src\\main\\resources\\alura_esporte.apk");


        DesiredCapabilities configuracoes = new DesiredCapabilities();
        configuracoes.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());
        configuracoes.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        configuracoes.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");


        URL urlConexao = null;
        try {
            urlConexao = new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driverConfig = new AppiumDriver<>(urlConexao, configuracoes);


    }
}
