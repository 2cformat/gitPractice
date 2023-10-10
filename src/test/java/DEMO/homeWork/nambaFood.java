package DEMO.homeWork;

import DEMO.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class nambaFood extends BaseChrome {

    @Test
    void EatNamba(){
        driver.get("https://nambafood.kg/");//  ссылка на сайт
        WebElement foodEating = driver.findElement(By.xpath("//ul[@class='nav']//a[@href='/food']"));
        foodEating.click();
        WebElement nationalFood = driver.findElement(By.xpath("//div[@class='cat-wrap']/a[1]"));
        nationalFood.click();
        WebElement cafeMubarak = driver.findElement(By.xpath("//div[@class='catalog-wrap']/a[@href='/mubarak-gogolya']"));
        cafeMubarak.click();
        WebElement orderFirst = driver.findElement(By.xpath("//div[@data-item-id='315314']/div[2]/div[2]"));
        orderFirst.click();
        orderFirst.click();
        WebElement orderFirstBtn = driver.findElement(By.xpath("//div[@data-item-id='315314']/button"));
        orderFirstBtn.click();
        WebElement orderSecond = driver.findElement(By.xpath("//div[@data-item-id='315324']/div[2]/div[2]"));
        orderSecond.click();
        orderSecond.click();
        WebElement orderSecondBtn = driver.findElement(By.xpath("//div[@data-item-id='315324']/button"));
        orderSecondBtn.click();
        WebElement cartBtn = driver.findElement(By.xpath("//div[@id='cart']"));
        cartBtn.click();
        WebElement orderSubmit = driver.findElement(By.xpath("//div[@class='order--actions']/a"));
        orderSubmit.click();
        WebElement nameInput = driver.findElement(By.id("food_order_client_name"));
        nameInput.sendKeys("Жоошбек, спокойный крутой парень");
        WebElement inputAddress = driver.findElement(By.id("food_order_address"));
        inputAddress.sendKeys("5 микрорайон 72/3");
        inputAddress.click();
        WebElement doorCode = driver.findElement(By.id("food_order_door_code"));
        doorCode.sendKeys("кв 15 3этаж");
        WebElement phoneInput = driver.findElement(By.id("food_order_phone"));
        phoneInput.sendKeys("0999555777");
        WebElement additional_info = driver.findElement(By.id("food_order_additional_info"));
        additional_info.sendKeys("Супер кафе!");
    }
}
