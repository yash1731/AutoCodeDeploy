package StepDefinitions;

import browser.WebBrowserFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class LoginSteps extends WebBrowserFactory {
   
     WebDriver driver = getChromeDriver();
    

    @Given("user is log in page")
    public void user_is_log_in_page() {

        driver.manage().window().maximize();
        driver.get("https://www.dudfara.com/");
    }

    @When("user click on home page")
    public void user_click_on_home_page() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='banner']/div/div/ul/li/a")).click();
        String title = driver.getTitle();
        System.out.println("web page title is - " + title);
    }
    @When("user click on header")
    public void user_click_on_header() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='one']/article[1]/a")).click();
    }
    @Then("user click on menu")
    public void user_click_on_menu() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='header']/a/strong")).click();

        driver.quit();
    }


}
