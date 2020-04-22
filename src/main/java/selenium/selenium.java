package selenium;

import org.apache.log4j.BasicConfigurator;

import java.io.IOException;

public class selenium {
    public static void main(String[] args) throws IOException {
        BasicConfigurator.configure();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Piotrek\\projekciki\\src\\main\\java\\selenium\\chromedriver.exe");

        Events.getAccessToAccount();
        //Events.usingBufferedWritter();
        Events.notifications();
    }
}
