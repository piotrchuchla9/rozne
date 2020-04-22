package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Events {

    public static WebDriver driver = new ChromeDriver();
    public static WebDriverWait wait = new WebDriverWait(driver, 10);

    public static void getAccessToAccount(){

        driver.get("https://twitter.com/login?lang=pl");
        driver.manage().window().maximize();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,'username_or_email')]")));
        WebElement username = driver.findElement(By.xpath("//input[contains(@name,'username_or_email')]"));
        username.sendKeys("piotrek.chuchla@wp.pl");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,'password')]")));
        WebElement psswd = driver.findElement(By.xpath("//input[contains(@name, 'password')]"));
        psswd.sendKeys("Lordwuj1");

        WebElement finalLogin = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/form/div/div[3]/div/div"));
        finalLogin.click();
    }

    public static void notifications(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/header/div/div/div/div[1]/div[2]/nav/a[3]/div/div[2]/span")));
        WebElement notificationButton = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/header/div/div/div/div[1]/div[2]/nav/a[3]/div/div[2]/span"));
        notificationButton.click();

        List<WebElement> myElements = driver.findElements(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/section/div"));
        int size = myElements.size();
        System.out.println("Size of List: " + size);
        for(WebElement element : myElements)
        {

            System.out.println("elements: "+element .getText());
        }
    }
}
