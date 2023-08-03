/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package az.mycompany.course.service;

import az.mycompany.course.model.LoginUser;

/**
 *
 * @author Admin
 */
public interface LoginUserService {
        LoginUser loginUser(String username,String password) throws Exception;
}
