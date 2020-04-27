import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleSeleniumTest
{
	WebDriver driver;

	@Before
	public void setup()
	{
		driver = new ChromeDriver();
	}

	@Test
	public void openPage()
	{
		driver.get("https://training.one-shore.com");
		assertThat(driver.getTitle()).contains("Training");
	}

	@After
	public void teardown()
	{
		driver.quit();
	}
}
