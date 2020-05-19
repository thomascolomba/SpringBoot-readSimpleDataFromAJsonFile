package readSimpleDataFromAJsonFile.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import readSimpleDataFromAJsonFile.mySourceFactory.MyJsonPropertySourceFactory;

@Component
@PropertySource(
		  value = "classpath:myConfiguration.json", 
		  factory = MyJsonPropertySourceFactory.class)
@ConfigurationProperties
public class MyConfigurationBean {
    private Integer myInteger;
    private String myString;
    private Boolean myBoolean;
	public Integer getMyInteger() {
		return myInteger;
	}
	public void setMyInteger(Integer myInteger) {
		this.myInteger = myInteger;
	}
	public String getMyString() {
		return myString;
	}
	public void setMyString(String myString) {
		this.myString = myString;
	}
	public Boolean getMyBoolean() {
		return myBoolean;
	}
	public void setMyBoolean(Boolean myBoolean) {
		this.myBoolean = myBoolean;
	}
}