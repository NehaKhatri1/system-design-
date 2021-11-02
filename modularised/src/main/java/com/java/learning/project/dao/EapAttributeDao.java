package com.java.learning.project.dao;

import java.sql.*;

public class EapAttributeDao {


    public static void viewTable() throws SQLException {
        String query = "select entityid, entityName from resourcestable";
        DriverManager conn;
        try {
               conn= (DriverManager) DBDatabaseManager.getConnection();
                 Statement stmt = ((Connection) conn).createStatement();


            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String entityid = rs.getString("entityid");
                int entityName = rs.getInt("entityName");
               System.out.println(entityid + ", " + entityName);
            }
        } catch (SQLException e) {
           // JDBCTutorialUtilities.printSQLException(e);
        }
    }

}
