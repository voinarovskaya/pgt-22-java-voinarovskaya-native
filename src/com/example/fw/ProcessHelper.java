package com.example.fw;

import java.io.IOException;

public class ProcessHelper extends HelperBase{

	private Process exec;

	public ProcessHelper(ApplicationManager manager) {
		super(manager);
		
	}
	
	public void startAppUnderTests() throws IOException{
		String command =  manager.getProperty("app.path");
		exec = Runtime.getRuntime().exec(command);
	}
	
	public void stopAppUnderTests(){
		exec.destroy();
	}

}
