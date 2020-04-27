public class ChromeDriverBuilder
{
	public String getChromeDriverPath(String forOs)
	{
		String userDir = System.getProperty("user.dir");
		String relativePath = "/src/test/resources/";

		String chromeDriverFilename = getChromeDriverFilename(forOs);
		String chromedriverPath = userDir + relativePath + chromeDriverFilename;

		return chromedriverPath;
	}

	public String getChromeDriverFilename(String os)
	{
		String chromedriverFilename = "chromedriver";

		if (os.contains("Windows"))
		{
			chromedriverFilename = "chromedriver.exe";
		}

		return chromedriverFilename;
	}
}
