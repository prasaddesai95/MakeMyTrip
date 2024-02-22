package com.MMT.GenericUtils;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;

public class dataBaseUtils {

	Connection con;
	public static void connectToDB() throws Throwable
	{
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		DriverManager.getConnection(IpathConstant.dbUrl, IpathConstant.dbAdmin, IpathConstant.dbPassword);
	}
	
	public void disconnectDB() throws Throwable
	{
		con.close();
	}
}
