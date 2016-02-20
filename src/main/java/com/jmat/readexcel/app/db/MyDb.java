/*
 **********************************************************************
 **********************************************************************
 ** By Wuriyanto                                                     **
 ** EMAIL/FACEBOOK : wuriyanto48@yahoo.co.id  OR  Prince Wury        **
 ** WEBSITE : wuriyantoinformatika.blogspot.com                      **
 ** CITY : BANJARNEGARA CENTRAL JAVA INDONESIA                       **
 ** COMPUTER SCIENCE                                                 **
 ** MUHAMMADIYAH UNIVERSITY OF PURWOKERTO                            **
 ** NB:BEBAS DIDISTRIBUSIKAN UNTUK TUJUAN BELAJAR                    **      
 **                                                                  **
 **                                     JMAT.inc & Black Code Studio **
 **********************************************************************
 **********************************************************************

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmat.readexcel.app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author WURI
 */
public class MyDb {

    private static final String HOST = "jdbc:mysql://localhost:3306/data_mahasiswa";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String DRIVER_DB = "com.mysql.jdbc.Driver";

    private static Connection connection;

    public static Connection connect() {
        if (connection == null) {
            try {
                Class.forName(DRIVER_DB);
                connection = DriverManager.getConnection(HOST, USER, PASSWORD);
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return connection;
    }

}
