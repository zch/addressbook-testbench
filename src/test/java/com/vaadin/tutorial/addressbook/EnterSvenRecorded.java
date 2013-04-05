package com.vaadin.tutorial.addressbook;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.HasInputDevices;
import org.openqa.selenium.HasTouchScreen;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keyboard;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Mouse;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rotatable;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TouchScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverCommandProcessor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.vaadin.testbench.By;
import com.vaadin.testbench.TestBench;
import com.vaadin.testbench.TestBenchTestCase;

public class EnterSvenRecorded extends TestBenchTestCase {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	@Before
	public void setUp() throws Exception {
		driver = TestBench.createDriver(new FirefoxDriver());
		baseUrl = "http://localhost:8080/";
	}

	@Test
	public void testEnterSven() throws Exception {
		driver.get(concatUrl(baseUrl, "/?restartApplication"));
		driver.findElement(By.vaadin("ROOT::PID_Snew-contact/domChild[0]/domChild[0]")).click();
		testBenchElement(driver.findElement(By.vaadin("ROOT::PID_SFirst-Name"))).click(36,11);
		testBenchElement(driver.findElement(By.vaadin("ROOT::PID_SFirst-Name"))).click(36,11);
		new Actions(driver).doubleClick(driver.findElement(By.vaadin("ROOT::PID_SFirst-Name")));
		new Actions(driver).keyDown(Keys.SHIFT).build().perform();
		driver.findElement(By.vaadin("ROOT::PID_SFirst-Name")).sendKeys("S");
		new Actions(driver).keyDown(Keys.SHIFT).build().perform();
		driver.findElement(By.vaadin("ROOT::PID_SFirst-Name")).clear();
		driver.findElement(By.vaadin("ROOT::PID_SFirst-Name")).sendKeys("Sven");
		testBenchElement(driver.findElement(By.vaadin("ROOT::PID_SLast-Name"))).click(50,10);
		testBenchElement(driver.findElement(By.vaadin("ROOT::PID_SLast-Name"))).click(50,10);
		new Actions(driver).doubleClick(driver.findElement(By.vaadin("ROOT::PID_SLast-Name")));
		testBenchElement(driver.findElement(By.vaadin("ROOT::PID_SLast-Name"))).click(50,10);
		new Actions(driver).keyDown(Keys.SHIFT).build().perform();
		driver.findElement(By.vaadin("ROOT::PID_SLast-Name")).sendKeys("S");
		new Actions(driver).keyDown(Keys.SHIFT).build().perform();
		driver.findElement(By.vaadin("ROOT::PID_SLast-Name")).clear();
		driver.findElement(By.vaadin("ROOT::PID_SLast-Name")).sendKeys("Svensson");
		testBenchElement(driver.findElement(By.vaadin("ROOT::PID_SCompany"))).click(59,9);
		new Actions(driver).keyDown(Keys.SHIFT).build().perform();
		driver.findElement(By.vaadin("ROOT::PID_SCompany")).sendKeys("V");
		new Actions(driver).keyDown(Keys.SHIFT).build().perform();
		driver.findElement(By.vaadin("ROOT::PID_SCompany")).clear();
		driver.findElement(By.vaadin("ROOT::PID_SCompany")).sendKeys("aadin");
		new Actions(driver).keyDown(Keys.SHIFT).build().perform();
		driver.findElement(By.vaadin("ROOT::PID_SCompany")).sendKeys("L");
		new Actions(driver).keyDown(Keys.SHIFT).build().perform();
		driver.findElement(By.vaadin("ROOT::PID_SCompany")).clear();
		driver.findElement(By.vaadin("ROOT::PID_SCompany")).sendKeys("Vaadin Ltd");
		testBenchElement(driver.findElement(By.vaadin("ROOT::PID_Ssearch-field"))).click(302,11);
		driver.findElement(By.vaadin("ROOT::PID_Ssearch-field")).clear();
		driver.findElement(By.vaadin("ROOT::PID_Ssearch-field")).sendKeys("sven");
		Thread.sleep(500);
		assertEquals("Sven", driver.findElement(By.vaadin("ROOT::PID_Scontact-list/domChild[1]/domChild[0]/domChild[1]/domChild[0]/domChild[0]/domChild[0]/domChild[0]")).getText());
		assertEquals("Svensson", driver.findElement(By.vaadin("ROOT::PID_Scontact-list/domChild[1]/domChild[0]/domChild[1]/domChild[0]/domChild[0]/domChild[1]/domChild[0]")).getText());
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
}
