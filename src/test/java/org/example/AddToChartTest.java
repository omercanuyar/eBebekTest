package org.example;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import java.util.*;

public class AddToChartTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void addToChart() {

        try {
            // Test name: AddToChart
            // Step # | name | target | value
            // 1 | open | / |
            driver.get("https://www.e-bebek.com/");
            // 2 | setWindowSize | 1936x1048 |
            driver.manage().window().maximize();
            // 3 | mouseOver | css=.container-fluid .nav-item:nth-child(2) > .nav-link |
            {
                WebElement element = driver.findElement(By.cssSelector(".container-fluid .nav-item:nth-child(2) > .nav-link"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element).perform();
            }
            // 4 | mouseOut | css=.container-fluid .nav-item:nth-child(2) > .nav-link |
            {
                WebElement element = driver.findElement(By.tagName("body"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element, 0, 0).perform();
            }
            // 5 | click | id=txtSearchBox |
            driver.findElement(By.id("txtSearchBox")).click();
            // 6 | type | id=txtSearchBox | biberon
            driver.findElement(By.id("txtSearchBox")).sendKeys("biberon");
            // 7 | sendKeys | id=txtSearchBox | ${KEY_ENTER}
            driver.findElement(By.id("txtSearchBox")).sendKeys(Keys.ENTER);
            // 8 | click | css=.col-6:nth-child(1) .is-initialized > .ng-star-inserted |
            driver.findElement(By.cssSelector(".col-6:nth-child(1) .is-initialized > .ng-star-inserted")).click();
            // 9 | mouseOver | id=addToCartBtn |
            {
                WebElement element = driver.findElement(By.id("addToCartBtn"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element).perform();
            }
            // 10 | click | id=addToCartBtn |
            driver.findElement(By.id("addToCartBtn")).click();
            // 11 | mouseOut | id=addToCartBtn |
            {
                WebElement element = driver.findElement(By.tagName("body"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element, 0, 0).perform();
            }
            // 12 | click | id=btnShowCart |
            driver.findElement(By.id("btnShowCart")).click();

            WebElement ele = driver.findElement(By.id("btnProductReviewsTab"));

            if(ele.isEnabled()){
                System.out.println("Sepet Dolu");
            }
        }
        catch (Exception e){
            System.out.println("Sepet Boş");
        }
    }
}
