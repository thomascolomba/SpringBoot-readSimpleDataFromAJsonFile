package readSimpleDataFromAJsonFile.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyConfigurationDisplayer implements ApplicationListener<ApplicationReadyEvent> {
	@Autowired
	MyConfigurationBean myConf;
	
	public void onApplicationEvent(final ApplicationReadyEvent event) {
		System.out.println("Will display the 'myInteger', 'myString' and 'myBoolean' value from the src/main/resources/myConfiguration.json file");
		System.out.println(myConf.getMyInteger());
		System.out.println(myConf.getMyString());
		System.out.println(myConf.getMyBoolean());
	}
}