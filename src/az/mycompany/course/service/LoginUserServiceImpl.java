/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.mycompany.course.service;

import az.mycompany.course.dao.LoginUserDao;
import az.mycompany.course.model.LoginUser;

/**
 *
 * @author Admin
 */
public class LoginUserServiceImpl implements LoginUserService{

    private LoginUserDao loginuserDao;

    public LoginUserServiceImpl(LoginUserDao loginuserDao) {
        this.loginuserDao = loginuserDao;
    }
    

    @Override
    public LoginUser loginUser(String username, String password) throws Exception {
        return loginuserDao.loginUser(username, password);
    }
    
}
