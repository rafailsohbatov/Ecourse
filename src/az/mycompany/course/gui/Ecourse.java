/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package az.mycompany.course.gui;

import az.mycompany.course.dao.DBHelper;
import java.sql.Connection;

/**
 *
 * @author Admin
 */
public class Ecourse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
      Connection c = DBHelper.getConnection();
      if(c != null){
          System.out.println("succcess");
      }
    }

}
