/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.mycompany.course.dao;

import az.mycompany.course.model.LoginUser;
import az.mycompany.course.model.Role;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class LoginUserDaoImpl implements LoginUserDao {
    
    @Override
    public LoginUser loginUser(String username, String password) throws Exception {
        
        LoginUser loginUser = new LoginUser();
        
        String sql = """
                     SELECT X.ID,
                            X.NAME,
                            X.SURNAME,
                            X.USERNAME,
                            X.ROLE_ID ROLE_ID,
                            X.ROLE_NAME ROLE_NAME
                       FROM (SELECT LU.ID,
                                    LU.USERNAME,
                                    LU.PASSWORD,
                                    S.NAME,
                                    S.SURNAME,
                                    R.ID ROLE_ID,
                                    R.ROLE_NAME ROLE_NAME
                               FROM LOGIN_USER LU
                                    INNER JOIN STUDENT S
                                       ON S.ID = LU.STUDENT_ID
                                    INNER JOIN ROLE R
                                       ON R.ID = LU.ROLE_ID
                             UNION ALL
                             SELECT LU.ID,
                                    LU.USERNAME,
                                    LU.PASSWORD,
                                    T.NAME,
                                    T.SURNAME,
                                    R.ID ROLE_ID,
                                    R.ROLE_NAME ROLE_NAME
                               FROM LOGIN_USER LU
                                    INNER JOIN TEACHER T
                                       ON T.ID = LU.TEACHER_ID
                                    INNER JOIN ROLE R
                                       ON R.ID = LU.ROLE_ID) X
                      WHERE X.USERNAME = ? AND X.PASSWORD = ?""";
        
        try ( Connection c = DBHelper.getConnection();  PreparedStatement ps = c.prepareStatement(sql);) {
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                loginUser.setId(rs.getLong("ID"));
                loginUser.setName(rs.getString("NAME"));
                loginUser.setSurname(rs.getString("SURNAME"));
                Role role = new Role();
                role.setId(rs.getLong("ROLE_ID"));
                role.setRoleName(rs.getString("ROLE_NAME"));
                loginUser.setRole(role);
                loginUser.setUsername(rs.getString("USERNAME"));
            }
        }
        return loginUser;
    }
}
