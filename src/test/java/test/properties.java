package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class properties {
	//How to write Global parameters with java cod
	
	public void go() {
		System.out.println("you go girl");
	}
	
public void login() throws IOException {
	
	Properties prop=new Properties ();
	FileInputStream file=new FileInputStream ("/Users/mustafademirkiran/eclipse-workspace/HRMS/src/test/java/test/datadriven.properties");
	prop.load(file);
	
	System.out.println(prop.getProperty("username"));
	
	
	
	
}
	
	
	
	
}
