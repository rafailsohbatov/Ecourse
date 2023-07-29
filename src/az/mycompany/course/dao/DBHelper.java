/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.mycompany.course.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author Admin
 */
public class DBHelper {
    public static Connection getConnection() throws Exception {
        Properties properties = new Properties();
        properties.load(new BufferedReader(new FileReader("config.properties")));
        Class.forName(properties.getProperty("db.driver"));
        Connection c = DriverManager.getConnection(properties.getProperty("db.url"), properties.getProperty("db.username"), properties.getProperty("db.password"));
        return c;
    }
}
