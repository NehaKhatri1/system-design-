package com.java.learning.project.service;

import com.java.learning.project.dao.EapAttributeDao;
import com.java.learning.project.hive.hive;

import java.sql.SQLException;

import static com.java.learning.project.hive.hive.readFromHive;



public class stmprocessor {

    public static void main(String args[]) throws SQLException {

        // initialise spark session here if needed
         EapAttributeDao eapAttributeDao= new EapAttributeDao();  // General rule service classes (there can be 2 or more ) calls to dao classes which inturn calls to model claases to return objects of that model class.
        eapAttributeDao.viewTable();

        dataset<Raw> ds1=readFromHive(session spark,String target);

        enrichDs();

        hive.writeToHive();

    }



    private static void enrichDs() {

    }



}
