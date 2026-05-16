package com.designpattern.structural.facade;

import java.sql.Connection;

/**
 * 
 * @author pardeshi_n
 *Set of Interfaces
 *We can have two helper interfaces, namely MySqlHelper and OracleHelper.
 */
public class MySqlHelper {
	public static Connection getMySqlDBConnection(){
        //get MySql DB connection using connection parameters
        return null;
    }
     
    public void generateMySqlPDFReport(String tableName, Connection con){
        //get data from table and generate pdf report
    }
     
    public void generateMySqlHTMLReport(String tableName, Connection con){
        //get data from table and generate pdf report
    }
}
