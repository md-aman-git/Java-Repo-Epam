package com.epam.jdbcdemo;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        Utility util = new Utility();
//        try {
//			util.saveImgToDB();
//			System.out.println("-----------Image saved to DB-----------");
//		} catch (ClassNotFoundException | SQLException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        try {
			util.getImgFromDB();
			System.out.println("-----------Image saved to Drive-----------");
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Completed program...");
    }
}
