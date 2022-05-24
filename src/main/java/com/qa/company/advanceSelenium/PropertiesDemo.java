package com.qa.company.advanceSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesDemo {

	static Properties prop;

	public static void main(String[] args) {

		readPropFile();

	}

	public static void readPropFile() {

		prop = new Properties();

		try {
			InputStream input = new FileInputStream("./src/main/resources/config.properties");
			prop.load(input);

			System.out.println(prop.getProperty("browser"));
			System.out.println(prop.getProperty("username"));
			System.out.println(prop.getProperty("password"));
			System.out.println(prop.getProperty("projectName"));

		} catch (FileNotFoundException e) {
			// e.printStackTrace();

			System.out.println("Found execption - " + e.getMessage());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
