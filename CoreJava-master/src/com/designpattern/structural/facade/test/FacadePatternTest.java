package com.designpattern.structural.facade.test;
/**
 * As you can see that using Facade interface is a lot easier and cleaner way and avoid having a lot of logic at client side. 
 * JDBC Driver Manager class to get the database connection is a wonderful example of facade pattern.
 */
import java.sql.Connection;

import com.designpattern.structural.facade.HelperFacade;
import com.designpattern.structural.facade.MySqlHelper;
import com.designpattern.structural.facade.OracleHelper;
import com.designpattern.structural.facade.HelperFacade.DBTypes;
import com.designpattern.structural.facade.HelperFacade.ReportTypes;

public class FacadePatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String tableName = "Employee";
		
		//generating MySql HTML report and Oracle PDF report without using Facade
		Connection con = MySqlHelper.getMySqlDBConnection();
		MySqlHelper mySqlHelper = new MySqlHelper();
		mySqlHelper.generateMySqlHTMLReport(tableName, con);
		
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.generateOraclePDFReport(tableName, con);
		
		 //generating MySql HTML report and Oracle PDF report using Facade
		HelperFacade.generateReport(DBTypes.MYSQL, ReportTypes.HTML, tableName);
		HelperFacade.generateReport(DBTypes.ORACLE, ReportTypes.PDF, tableName);
	}

}
