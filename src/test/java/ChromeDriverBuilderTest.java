import org.junit.Test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

public class ChromeDriverBuilderTest
{
	@Test
	public void testChromeDriverFilename_ifOnWindows()
	{
		String os = "Windows 10";

		String chromedriverFilename = new ChromeDriverBuilder()
				.getChromeDriverFilename(os);

		System.out.println(chromedriverFilename);
		assertThat(chromedriverFilename).isEqualTo("chromedriver.exe");
	}

	@Test
	public void testChromeDriverFilename_ifOnMac()
	{
		String os = "Mac OS X";

		String chromedriverFilename = new ChromeDriverBuilder()
				.getChromeDriverFilename(os);

		System.out.println(chromedriverFilename);
		assertThat(chromedriverFilename).isEqualTo("chromedriver");
	}

	@Test
	public void testChromeDriverPathExistsOnWindow()
	{
		String os = "Windows 10";
		String path = new ChromeDriverBuilder().getChromeDriverPath(os);

		System.out.println(path);
		assertThat(new File(path)).exists();
	}

	@Test
	public void testChromeDriverPathExistsOnMac()
	{
		String os = "Max OS X";
		String path = new ChromeDriverBuilder().getChromeDriverPath(os);

		System.out.println(path);
		assertThat(new File(path)).exists();
	}
}
