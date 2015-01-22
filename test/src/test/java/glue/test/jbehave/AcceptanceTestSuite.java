package glue.test.jbehave;

import glue.test.utils.WebDriverConfigurer;
import net.thucydides.jbehave.ThucydidesJUnitStories;

public class AcceptanceTestSuite extends ThucydidesJUnitStories {
	
	
	public AcceptanceTestSuite() {
		
		WebDriverConfigurer.configureDrivers();
		
		
		
		
		}
}
