import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTesting {

    static String browser = "Chrome";
    static String baseUrl = "https://courses.ultimateqa.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }

//Launch the Chrome Broswer
        WebDriver driver = new ChromeDriver();
//Open the Url
        driver.get(baseUrl);


        // Print title of the page
        System.out.println(driver.getTitle());
        //print current url
        System.out.println(driver.getCurrentUrl());
        //Print the page source
        System.out.println(driver.getPageSource());
        //Click on sign in link
        // Action to the element
        driver.findElement(By.linkText("Sign In")).click();
        //Print current url
        System.out.println(driver.getCurrentUrl());
        //enter email to email field
        //Action on the element
        driver.findElement(By.id("user[email]")).sendKeys("chetan123@gmail.com");
        //Enter password to password field
        driver.findElement(By.id("user[password]")).sendKeys("Chetan123");
        //click on login button
        driver.findElement(By.className("form__button-group")).click();
        //Navigate to base url
        driver.navigate().to(baseUrl);
        //Navigate Forword to hamepage
        System.out.println(driver.getCurrentUrl());
        driver.navigate().forward();
        //Navigate back to baseUrl
        driver.navigate().back();
        driver.get(baseUrl);
        System.out.println(baseUrl);
        //refresh the page
        driver.navigate().refresh();
        //close the browser
        driver.close();
    }
}
