package br.com.caelum.aceitacao;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
	
	@Test
	public void testandoBrowser() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com.br/");
		
		WebElement campoDeTexto = driver.findElement(By.name("q"));
		
		campoDeTexto.sendKeys("TDD");
		
		campoDeTexto.submit();
		
		String html = driver.getPageSource();
		
		driver.close();
		boolean contains = html.contains("Caelum");
		
		Assert.assertTrue(contains);
		
	}

}
