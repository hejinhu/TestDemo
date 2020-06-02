package com.jianyan.config;

import java.io.IOException;
import java.util.Properties;

public class Application {
	Properties props;

	public String proper(String key) {
		props = new Properties();
		try {
			props.load(
					Application.class.getClassLoader().getResourceAsStream("appliction.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props.getProperty(key);
//		System.out.println(props.getProperty("browserName"));
	}

}
