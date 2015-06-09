package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
public class DemoApplicationTests {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmbeddedMongoDBConfiguration.class);

	@Test
	public void contextLoads() {
		LOGGER.info("Running a simple test");
	}

}
