package com.Magento;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class Base {
    public static WebDriver driver;
    public static Properties props =new Properties();
    public Base(){
        try {File file =new File("src/main/java/com/Magento/Properties/Config.Properties");
            FileInputStream fis =new FileInputStream(file);
            props.load(fis);

        }catch (IOException e){
            e.printStackTrace();
        }


    }

    public static void Luncher(){
        if(props.getProperty("browser").equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver =new ChromeDriver(options);
            }

            else if(props.getProperty("browser").equalsIgnoreCase("Firefox")){
                FirefoxOptions options = new FirefoxOptions();
                options.setBinary("C:\\Users\\KhaledBEDOUI\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(options);
            /*DesiredCapabilities X = new DesiredCapabilities();
            X.setCapability(CapabilityType.BROWSER_NAME,"firefox");
            URL url=new URL("http://localhost:4444/wd/hub");
            driver = new RemoteWebDriver(url,X);*/


        } else if (props.getProperty("browser").equalsIgnoreCase("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();

        }else if(props.getProperty("browser").equalsIgnoreCase("Safari")){
            SafariOptions safariOptions = new SafariOptions();
            safariOptions.setUseTechnologyPreview(true);
            SafariDriver driver = new SafariDriver(safariOptions);



        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.get(props.getProperty("url"));


    }
}
