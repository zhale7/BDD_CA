package org.example;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
//import static org.testng.AssertJUnit.assertTrue;


public class Steps {
    public WebDriver driver ;

    @Given("Open the Firefox and launch the application")
    public void user_is_on_Github_login_page() {
        System.out.println("This Step open the Firefox and launch the application.");
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\Jala\\Downloads\\geckodriver-v0.33.0-win64.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demo.guru99.com/v4/");
    }

    @When("Enter the Username and Password")
    public void user_enters_username_and_password() {
        System.out.println("This step enter the Username and Password on the login page.");
        WebElement userIdInput = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        WebElement passwordInput = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
        userIdInput.sendKeys("zhale");
        passwordInput.sendKeys("zhale");
    }

    @Then("Reset the credential")
    public void clicks_on_reset_button() {
        System.out.println("This step click on the Reset button.");
        WebElement loginButton = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[2]"));
        loginButton.click();
        driver.quit();
    }

}