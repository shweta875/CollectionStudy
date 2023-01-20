package com.LinkedHashMap;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo1 {

	public static void main(String[] args) throws IOException {
		FileReader reader=new FileReader(" C:\\Users\\Admin\\Desktop\\New folder\\shweta2.properties");
		Properties p=new Properties();
		p.load(reader);
		String p1=p.getProperty("userName");
		String p2=p.getProperty("password");
		String p3=p.getProperty("url");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
			

}
}
