package stepdef;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SantraSteps {


    @Given("user selects the dropdown value in the homepage")
    public void homepage(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://sentrallife:sentrallife@test.sentral.com/");
        driver.manage().window().maximize();
    }
}
