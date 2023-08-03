/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package az.mycompany.course.dao;

import az.mycompany.course.model.LoginUser;

/**
 *
 * @author Admin
 */
public interface LoginUserDao {
    LoginUser loginUser(String username,String password) throws Exception;
}
