package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Main {
    public static void main(String[] args) {

        //ChromeOptions co = new ChromeOptions();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/");
        WebElement userNameTextField = driver.findElement(By.name("userName"));
        userNameTextField.sendKeys("test");
        WebElement passwordTextField = driver.findElement(By.name("password"));
        passwordTextField.sendKeys("test");
        WebElement submitButton = driver.findElement(By.name("submit"));
        submitButton.click();

        //Dashboard
        WebElement successMessage = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3"));
        String successMessageText = successMessage.getText();
        String expectedMessageText = "Login Successfully";
        Assert.assertEquals(successMessageText,expectedMessageText);
        driver.quit();
    }
}