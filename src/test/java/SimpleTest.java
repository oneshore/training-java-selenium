import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleTest
{
	@Test
	public void sanityTest()
	{
		assertThat(true).isEqualTo(true);
	}

	@Test
	public void insanityTest()
	{
		assertThat(false).isEqualTo(true);
	}
}
