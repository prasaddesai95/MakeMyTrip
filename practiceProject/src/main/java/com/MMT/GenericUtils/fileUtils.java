package com.MMT.GenericUtils;

import java.io.FileInputStream;
import java.util.Properties;

public class fileUtils {

	public String readDataFromProperties(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IpathConstant.filePath);
		Properties pro= new Properties();
		pro.load(fis);
		String value=pro.getProperty(key);
		return value;
	}
}
