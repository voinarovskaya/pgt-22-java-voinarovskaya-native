package com.example.fw;

import java.io.IOException;
import java.util.Properties;

public class ApplicationManager {

	public static ApplicationManager apman;
	private ContactHelper contactHelper;
	private Properties props;
	private ProcessHelper processHelper;
	private AutoItHelper autoItHelper;

	public static ApplicationManager getInstance(Properties props) throws IOException {
		if (apman == null) {
			apman = new ApplicationManager();
			apman.setProperties(props);
			apman.start();
		}
		return apman;
	}
	
	public void start() throws IOException{
		getProcessHelper().startAppUnderTests();
	}
	
	public void stop(){
		getProcessHelper().stopAppUnderTests();
	}		
	
	public String getProperty(String key) {		
		return props.getProperty(key);
	}

	public void setProperties(Properties props) {
		this.props = props;		
	}	
	
	public ContactHelper getContactHelper() {
		if (contactHelper == null) {
			contactHelper = new ContactHelper(this);
		}
		return contactHelper;
	}

	
	public ProcessHelper getProcessHelper() {
		if (processHelper == null) {
			processHelper = new ProcessHelper(this);
		}
		return processHelper;
	}
	
	public AutoItHelper getAutoItHelper() {
		if (autoItHelper == null) {
			autoItHelper = new AutoItHelper(this);
		}
		return autoItHelper;
	}


}
